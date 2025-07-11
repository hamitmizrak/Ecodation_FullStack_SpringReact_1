package com.hamitmizrak.business.services.impl;


import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.RoleDto;

import com.hamitmizrak.business.services.interfaces.IRoleService;
import com.hamitmizrak.data.entity.RoleEntity;
import com.hamitmizrak.data.repository.IRoleRepository;
import com.hamitmizrak.exception.HamitMizrakException;

import com.hamitmizrak.exception._404_NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

// Lombok
@RequiredArgsConstructor
@Log4j2

// Service: Asıl İş Yükünü sırtlayan
@Service
@Component("roleServicesImpl") // @Component => Spring'in bir parcasısın
public class RoleServicesImpl implements IRoleService<RoleDto, RoleEntity> {

    // Injection IRoleRepository (1.YOL => @Autowired)
    /*
    @Autowired
    private IRoleRepository iRoleRepository;
    */

    // Injection IRoleRepository (2.YOL => Constructor Injection)
    /*
    private final IRoleRepository iRoleRepository;
    @Autowired
    public RoleServicesImpl(IRoleRepository iRoleRepository) {
        this.iRoleRepository = iRoleRepository;
    }
    */

    // 3. YOL (Lombok => Constructor Injection)
    private final IRoleRepository iRoleRepository;

    // 1.YOL (ModelMapper)
    // private final ModelMapper modelMapper;
    private final ModelMapperBean modelMapperBeanClass;

    ///////////////////////////////////////////////////////////////////////////////////////
    //**** Model Mapper *****************************************************************//
    // Model Mapper
    @Override
    public RoleDto entityToDto(RoleEntity roleEntity) {
        return modelMapperBeanClass.modelMapperMethod().map(roleEntity, RoleDto.class);
    }

    @Override
    public RoleEntity dtoToEntity(RoleDto roleDto) {
        return modelMapperBeanClass.modelMapperMethod().map(roleDto, RoleEntity.class);
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    //**** CRUD*****************************************************************//
    // CREATE (ROLE)
    @Override
    @Transactional// Create,Update,Delete
    public RoleDto objectServiceCreate(RoleDto roleDto) {
        RoleEntity roleEntity1;
        // Dto => Entity çevirmek
        roleEntity1 = dtoToEntity(roleDto);
        roleEntity1.setRoleName(roleEntity1.getRoleName().toUpperCase());
        // Kaydetmek
        RoleEntity roleEntity2 = iRoleRepository.save(roleEntity1);
        // ID ve Date Dto üzerinde Set yapıyorum
        roleDto.setRoleId(roleEntity2.getRoleId());
        roleDto.setSystemCreatedDate(roleEntity2.getSystemCreatedDate());
        return roleDto;
    } //end Create

    // LIST (ROLE)
    @Override
    public List<RoleDto> objectServiceList() {
        //Entity List
        List<RoleEntity> roleEntityList1 = iRoleRepository.findAll();

        // Dto List
        List<RoleDto> roleDtoList = new ArrayList<>();

        // Entity To Dto List
        for (RoleEntity tempEntity : roleEntityList1) {
            RoleDto roleDto1 = entityToDto(tempEntity);
            roleDtoList.add(roleDto1);
        }
        return roleDtoList;
    }  //end List

    // FIND (ROLE)
    @Override
    public RoleDto objectServiceFindById(Long id) {
        // 1.YOL
        /*
        Optional<RoleEntity> optionalRoleEntityFindById= iRoleRepository.findById(id);
        // isPresent: Entity varsa
        if(optionalRoleEntityFindById.isPresent()){
            return entityToDto(optionalRoleEntityFindById.get());
        }
        */

        // 2.YOL
        Boolean booleanRoleEntityFindById = iRoleRepository.findById(id).isPresent();
        RoleEntity roleEntity = null;
        //if(id!=null){
        if (booleanRoleEntityFindById) {
            roleEntity = iRoleRepository.findById(id).orElseThrow(
                    () -> new _404_NotFoundException(id + " nolu ID Bulunamadı")
            );
        } else if (!booleanRoleEntityFindById) {
            throw new HamitMizrakException("Roles Dto id boş değer geldi");
        }
        return entityToDto(roleEntity);
    }  //end Find

    // UPDATE (ROLE)
    @Override
    @Transactional// Create,Update,Delete
    public RoleDto objectServiceUpdate(Long id, RoleDto roleDto) {
        // Find
        RoleDto roleDtoFind = objectServiceFindById(id);

        // Update
        RoleEntity roleUpdateEntity = dtoToEntity(roleDtoFind);
        if (roleUpdateEntity != null) {
            roleUpdateEntity.setRoleName(roleDto.getRoleName());
            iRoleRepository.save(roleUpdateEntity);
        }
        // ID ve Date Dto üzerinde Set yapıyorum
        roleDto.setRoleId(roleUpdateEntity.getRoleId());
        roleDto.setSystemCreatedDate(roleUpdateEntity.getSystemCreatedDate());
        return entityToDto(roleUpdateEntity);
    }

    // DELETE (ROLE)
    @Override
    @Transactional// Create,Update,Delete
    public RoleDto objectServiceDelete(Long id) {
        // Find
        RoleDto roleDtoFind = objectServiceFindById(id);

        RoleEntity roleDeleteEntity = dtoToEntity(roleDtoFind);
        if (roleDeleteEntity != null) {
            iRoleRepository.deleteById(id);
            return roleDtoFind;
        }else {
            throw new HamitMizrakException(roleDtoFind+ "nolu data silinemedi");
        }
        // return null;
    }

} //end RoleServicesImpl
