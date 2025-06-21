package com.hamitmizrak.runner;

import com.hamitmizrak.data.entity.BlogCategoryEntity;
import com.hamitmizrak.data.entity.BlogEntity;
import com.hamitmizrak.data.repository.IBlogCategoryRepository;
import com.hamitmizrak.data.repository.IBlogRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

// LOMBOK
// LOMBOK
@RequiredArgsConstructor
@Log4j2
@Configuration
@Order(2)
public class _2_ProjectDataSet {


    // INJECTION
    // 1.YOL
    private final IBlogCategoryRepository iBlogCategoryRepository;
    private final IBlogRepository iBlogRepository ;

    // FIRST
    public void blogCommandLineRunnerAfterBeanMethod(){
        log.info("blog CommandLineRunner After Bean Method başladı");
        System.out.println("blog CommandLineRunner After Bean Method başladı");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Injection
    // CommandLineRunner Metodunu çağırdım
    @Bean
    public CommandLineRunner blogCommandLineRunnerMethod() {
        // Lambda Expression
        return args -> {
            System.out.println("CommandLineRunner Çalıştı");
            log.info("Category-Blog CommandLineRunner Çalıştı");
            // Kategoriler Oluştur

            // Tekil Kategory
            BlogCategoryEntity computerCategory=new BlogCategoryEntity();
            computerCategory.setCategoryName("Bilgisayar");
            iBlogCategoryRepository.save(computerCategory);

            // Tekil Kategory
            BlogCategoryEntity tabletCategory=new BlogCategoryEntity();
            tabletCategory.setCategoryName("Tablet");
            iBlogCategoryRepository.save(tabletCategory);

            // Blog-1
            BlogEntity blogEntity1=new BlogEntity();
            blogEntity1.getBlogEntityEmbeddable().setHeader("Header-1");
            blogEntity1.getBlogEntityEmbeddable().setContent("Content-1");
            blogEntity1.getBlogEntityEmbeddable().setTitle("Title-1");
            blogEntity1.setRelationCategoryEntity(computerCategory);
            iBlogRepository.save(blogEntity1);

            // Blog-1
            BlogEntity blogEntity2=new BlogEntity();
            blogEntity2.getBlogEntityEmbeddable().setHeader("Header-2");
            blogEntity2.getBlogEntityEmbeddable().setContent("Content-2");
            blogEntity2.getBlogEntityEmbeddable().setTitle("Title-2");
            blogEntity2.setRelationCategoryEntity(computerCategory);
            iBlogRepository.save(blogEntity2);


            // Blog-2
            BlogEntity blogEntity3=new BlogEntity();
            blogEntity3.getBlogEntityEmbeddable().setHeader("Header-3");
            blogEntity3.getBlogEntityEmbeddable().setContent("Content-3");
            blogEntity3.getBlogEntityEmbeddable().setTitle("Title-3");
            blogEntity3.setRelationCategoryEntity(tabletCategory);
            iBlogRepository.save(blogEntity3);
        };
    } //end CommandLineRunner

} // _2_ProjectDataSet
