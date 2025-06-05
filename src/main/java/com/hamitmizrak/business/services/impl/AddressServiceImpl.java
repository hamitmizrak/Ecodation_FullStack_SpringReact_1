package com.hamitmizrak.business.services.impl;

import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.AddressDto;
import com.hamitmizrak.business.mapper.AddressMapper;
import com.hamitmizrak.business.services.IAddressService;
import com.hamitmizrak.data.embeddable.AddressEntityEmbeddable;
import com.hamitmizrak.data.entity.AddressEntity;
import com.hamitmizrak.data.repository.IAddressRepository;
import com.hamitmizrak.exception._404_NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.web.mappings.MappingsEndpoint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

// LOMBOK
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor // for Constructor

// Asıl iş yükünü yapan yer
@Service
public class AddressServiceImpl implements IAddressService<AddressDto, AddressEntity> {

    // INJECTION
    // 1.YOL
    /*
    @Autowired
     private IAddressRepository iAddressRepository;
     */

    // 2.YOL
    // CONSTRUCTOR INJECTION
    /*
    private final IAddressRepository iAddressRepository;
    private final ModelMapperBean modelMapperBean;
    @Autowired
    public AddressServiceImpl(IAddressRepository iAddressRepository, ModelMapperBean modelMapperBean) {
        this.iAddressRepository = iAddressRepository;
        this.modelMapperBean = modelMapperBean;
    }
     */

    // 3.YOL
    // LOMBOK CONSTRUCTOR INJECTION
    private final IAddressRepository iAddressRepository;
    private final ModelMapperBean modelMapperBean;
    private final MappingsEndpoint mappingsEndpoint;

    //////////////////////////////////////////////////////////////////////
    // MODEL MAPPER
    @Override
    public AddressDto entityAddressToDto(AddressEntity addressEntity) {
        // 1.YOL (ModelMapper)
        //return modelMapperBean.modelMapperMethod().map(addressEntity, AddressDto.class);

        // 2.YOL (BİZİM YAZDIĞIMIZ)
        return AddressMapper.AddressEntityToDto(addressEntity);
    }

    @Override
    public AddressEntity dtoAddressToEntity(AddressDto addressDto) {
        // 1.YOL (ModelMapper)
        // return modelMapperBean.modelMapperMethod().map(addressDto, AddressEntity.class);

        // 2.YOL (BİZİM YAZDIĞIMIZ)
        return AddressMapper.AddressDtoToEntity(addressDto);
    }

    //////////////////////////////////////////////////////////////////////
    // CRUD
    // @Transactional = import org.springframework.transaction.annotation.Transactional;

    // CREATE
    @Override
    @Transactional // Create, Update, Delete
    public AddressDto addressServiceCreate(AddressDto addressDto) {
        // 1.YOL
        // AddressEntity addressEntity = AddressMapper.AddressDtoToAddressEntity(addressDto);

        // 2.YOL
        AddressEntity addressEntityCreate=dtoAddressToEntity(addressDto);
        addressEntityCreate=iAddressRepository.save(addressEntityCreate);
        return entityAddressToDto(addressEntityCreate);
    }

    // LIST
    @Override
    public List<AddressDto> addressServiceList() {
        return iAddressRepository.findAll()
                .stream()
                // 1.YOL
                //.map(AddressMapper::AddressEntityToDto)
                //.sorted(Comparator.comparing((temp)->temp.getAddressEntityEmbeddable))

                // 2.YOL
                .map((temp) -> AddressMapper.AddressEntityToDto(temp))
                .collect(Collectors.toList());
    }


    // FIND BY ID
    @Override
    public AddressDto addressServiceFindById(Long id) {
        return iAddressRepository.findById(id)
                .map(AddressMapper::AddressEntityToDto)
                .orElseThrow(()-> new _404_NotFoundException(id+" nolu Address yoktur"));
    }


    // UPDATE
    @Override
    @Transactional // Create, Update, Delete
    public AddressDto addressServiceUpdate(Long id, AddressDto addressDto) {

        // ID VARSA
        AddressEntity addressEntityUpdate= dtoAddressToEntity(addressServiceFindById(id));

        // Embeddable
        AddressEntityEmbeddable addressEntityEmbeddable = new AddressEntityEmbeddable();
        addressEntityEmbeddable.setZipCode(addressDto.getZipCode());
        addressEntityEmbeddable.setCity(addressDto.getCity());
        addressEntityEmbeddable.setState(addressDto.getState());
        addressEntityEmbeddable.setStreet(addressDto.getState());
        addressEntityEmbeddable.setDoorNumber(addressDto.getDoorNumber());
        addressEntityEmbeddable.setDescription(addressDto.getDescription());
        addressEntityEmbeddable.setAddressQrCode(addressDto.getAddressQrCode());
        addressEntityEmbeddable.setCountry(addressDto.getCountry());
        return entityAddressToDto(addressEntityUpdate);
    }

    // DELETE
    @Override
    @Transactional // Create, Update, Delete
    public AddressDto addressServiceDeleteById(Long id) {
        // ID VARSA
        AddressEntity addressEntityDelete= dtoAddressToEntity(addressServiceFindById(id));
        iAddressRepository.delete(addressEntityDelete);
        return entityAddressToDto(addressEntityDelete);
    }

    //////////////////////////////////////////////////////////////////////
    // PAGINATION
    @Override
    public Page<AddressDto> addressServicePagination(int currentPage, int pageSize) {
        Pageable pageable= PageRequest.of(currentPage, pageSize);
        Page<AddressDto> addressDtoPage =(Page<AddressDto>) iAddressRepository.findAll(pageable)
                .stream()
                .map(AddressMapper::AddressEntityToDto)
                .collect(Collectors.toList());
        return addressDtoPage;
    }

    // SORTED (Herhangi bir kolon)
    @Override
    public List<AddressDto> addressServiceAllSortedBy(String sortedBy) {
        return iAddressRepository.findAll(
                Sort.by(Sort.Direction.ASC,sortedBy) )
                .stream()
                .map(AddressMapper::AddressEntityToDto)
                .collect(Collectors.toList());
    }

    // SORTED ASC (CITY)
    @Override
    public List<AddressDto> addressServiceAllSortedByCityAsc() {
        return iAddressRepository.findAll(
                        Sort.by(Sort.Direction.ASC,"addressEntityEmbeddable.city") )
                .stream()
                .map(AddressMapper::AddressEntityToDto)
                .collect(Collectors.toList());
    }

    // SORTED DESC
    @Override
    public List<AddressDto> addressServiceAllSortedByCityDesc() {
        return  iAddressRepository.findAll(
                        Sort.by(Sort.Direction.DESC,"addressEntityEmbeddable.city") )
                .stream()
                .map(AddressMapper::AddressEntityToDto)
                .collect(Collectors.toList());
    }

} // end AddressServiceImpl
