package com.hamitmizrak.data.mapper;


import com.hamitmizrak.business.dto.BlogDto;

import com.hamitmizrak.data.entity.BlogEntity;

// Blog(N)  - BlogCategory(N)**FK

public class BlogMapper {

    // 1- BlogEntity'i BlogDto'a çevir
    public static BlogDto BlogEntityToBlogDto(BlogEntity blogEntity) {
        // Instance(BlogDto)
        BlogDto blogDto = new BlogDto();

        // Field
        blogDto.setBlogId(blogEntity.getBlogId());
        blogDto.setHeader(blogEntity.getHeader());
        blogDto.setTitle(blogEntity.getTitle());
        blogDto.setContent(blogEntity.getContent());

        // DİKKAT: Composition (Blog(N)- BlogCategory(1))
        if (blogEntity.getBlogCategoryBlogEntity() != null) {
            blogDto.setBlogCategoryDto(BlogCategoryMapper.BlogCategoryEntityToBlogCategoryDto(blogEntity.getBlogCategoryBlogEntity()));
        }
        return blogDto;
    }

    // 2- BlogDto'u BlogEntity'e  çevir
    public static BlogEntity BlogDtoToBlogEntity(BlogDto blogDto) {
        // Instance(BlogEntity)
        BlogEntity blogEntity = new BlogEntity();

        // Field
        blogEntity.setBlogId(blogDto.getBlogId());
        blogEntity.setHeader(blogDto.getHeader());
        blogEntity.setTitle(blogDto.getTitle());
        blogEntity.setContent(blogDto.getContent());

        // DİKKAT: Composition (Order(N)- Customer(1))
        if (blogDto.getBlogCategoryDto() != null) {
            blogEntity.setBlogCategoryBlogEntity(BlogCategoryMapper.BlogCategoryDtoToBlogCategoryEntity(blogDto.getBlogCategoryDto()));
        }
        return blogEntity;
    }
}
