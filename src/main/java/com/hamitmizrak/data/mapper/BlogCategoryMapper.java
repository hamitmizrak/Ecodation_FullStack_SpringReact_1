package com.hamitmizrak.data.mapper;


import com.hamitmizrak.business.dto.BlogCategoryDto;
import com.hamitmizrak.data.entity.BlogCategoryEntity;
import lombok.extern.log4j.Log4j2;

// LOMBOK
@Log4j2

public class BlogCategoryMapper {

    // 1- CustomerEntity'i CustomerDto'a çevir
    public static BlogCategoryDto BlogCategoryEntityToBlogCategoryDto(BlogCategoryEntity blogCategoryEntity){
        // Instance (CustomerDto)
        BlogCategoryDto blogCategoryDto= new BlogCategoryDto();

        //ID,SYSTEM DATE
        blogCategoryDto.setCategoryId(blogCategoryEntity.getCategoryId());
        blogCategoryDto.setCategoryName(blogCategoryEntity.getCategoryName());

        // DİKKAT: Composition (Customer(1) -Order(N))
        return blogCategoryDto;
    }

    // 2- CustomerDto'u CustomerEntity'e  çevir
    public static BlogCategoryEntity BlogCategoryDtoToBlogCategoryEntity(BlogCategoryDto blogCategoryDto){
        // Instance (CustomerEntity)
        BlogCategoryEntity blogCategoryEntity= new BlogCategoryEntity();

        //ID,SYSTEM DATE
        blogCategoryEntity.setCategoryId(blogCategoryDto.getCategoryId());
        blogCategoryEntity.setCategoryName  (blogCategoryDto.getCategoryName());

        // DİKKAT: Composition (Customer(1) -Order(N))
        return blogCategoryEntity;
    } // end BlogCategoryDtoToBlogCategoryEntity
} // end BlogCategoryMapper
