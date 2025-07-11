package com.hamitmizrak.business.services.impl;


import com.hamitmizrak.bean.ModelMapperBean;
import com.hamitmizrak.business.dto.BlogDto;
import com.hamitmizrak.business.services.interfaces.IBlogServices;
import com.hamitmizrak.data.entity.BlogEntity;
import com.hamitmizrak.data.mapper.BlogMapper;
import com.hamitmizrak.data.repository.IBlogRepository;
import com.hamitmizrak.exception.HamitMizrakException;
import com.hamitmizrak.exception._404_NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

// LOMBOK
@RequiredArgsConstructor
@Log4j2

// SERVICES
@Service
public class BlogServicesImpl implements IBlogServices<BlogDto, BlogEntity> {

    // INJECTION (Lombok Constructor Field) => 3.YOL
    private final IBlogRepository iBlogRepository;
    private final ModelMapperBean modelMapperBeanClass;

    //////////////////////////////////////////////////////////////////////////////
    // SPEED DATA
    @Override
    public String blogSpeedData(Long data) {
        return null;
    }

    // DELETE ALL
    @Override
    public String blogAllDelete() {
        iBlogRepository.deleteAll();
        return null;
    }

    //////////////////////////////////////////////////////////////////////////////
    // MODEL MAPPER
    @Override
    public BlogDto entityToDto(BlogEntity blogEntity) {
        // 1.YOL
        //return modelMapperBeanClass.modelMapperMethod().map(blogEntity,BlogDto.class);

        // 2.YOL
        return BlogMapper.BlogEntityToBlogDto(blogEntity);
    }

    @Override
    public BlogEntity dtoToEntity(BlogDto blogDto) {
        // 1.YOL
        //return  modelMapperBeanClass.modelMapperMethod().map(blogDto,BlogEntity.class);

        // 2.YOL
        return BlogMapper.BlogDtoToBlogEntity(blogDto);
    }

    //////////////////////////////////////////////////////////////////////////////
    // CREATE
    @Override
    @Transactional // create, delete, update
    public BlogDto  objectServiceCreate(BlogDto blogDto) {
        if(blogDto!=null){
            BlogEntity blogEntity=dtoToEntity(blogDto);
            iBlogRepository.save(blogEntity);
            blogDto.setBlogId(blogEntity.getBlogId());
            blogDto.setSystemCreatedDate(blogEntity.getSystemCreatedDate());
        }else{
            throw  new NullPointerException("blogdto null veri");
        }
        return blogDto;
    }

    // LIST
    @Override
    public List<BlogDto> objectServiceList() {
        Iterable<BlogEntity> entityIterable=  iBlogRepository.findAll();
        // Dto To entityb List
        List<BlogDto> categoryDtoList=new ArrayList<>();
        for (BlogEntity entity:  entityIterable) {
            BlogDto blogDto=entityToDto(entity);
            categoryDtoList.add(blogDto);
        }
        log.info("Liste Sayısı: "+categoryDtoList.size());
        return categoryDtoList;
    }

    // FIND
    @Override
    public BlogDto objectServiceFindById(Long id) {
        // 1.YOL (FIND)
        /*
        Optional<BlogEntity> findOptionalBlogEntity=  iCategoryRepository.findById(id);
        CategoryDto categoryDto=entityToDto(findOptionalBlogEntity.get());
        if(findOptionalBlogEntity.isPresent()){
            return categoryDto;
        }
        */

        // 2.YOL (FIND)
        BlogEntity findBlogEntity=  null;
        if(id!=null){
            findBlogEntity=  iBlogRepository.findById(id)
                    .orElseThrow(()->new _404_NotFoundException((id+" nolu id yoktur")));
        }else if(id==null) {
            throw new HamitMizrakException("İd null olarak geldi");
        }
        return entityToDto(findBlogEntity);
    }

    // UPDATE
    @Override
    @Transactional // create, delete, update
    public BlogDto objectServiceUpdate(Long id, BlogDto blogDto) {
        // Önce Bul
        BlogDto blogFindDto= objectServiceFindById(id);
       if(blogFindDto!=null){
           BlogEntity blogEntity=dtoToEntity(blogFindDto);
           blogEntity.setTitle(blogDto.getTitle());
           blogEntity.setHeader(blogDto.getHeader());
           blogEntity.setContent(blogDto.getContent());
           iBlogRepository.save(blogEntity);
           // Dönüştede ID ve Date Set et
       }
        return blogDto;
    }

    // DELETE
    @Override
    @Transactional // create, delete, update
    public BlogDto objectServiceDelete(Long id) {
        // Önce Bul
        BlogDto categoryFindDto= objectServiceFindById(id);
        if(categoryFindDto!=null){
            iBlogRepository.deleteById(id);
            // Dönüştede ID ve Date Set et
        }
        return categoryFindDto;
    }

} //end class
