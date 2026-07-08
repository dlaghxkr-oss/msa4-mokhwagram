package com.msa4mokhwagram.global.config.jpa;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueryDSLConfig {
    // JPA에서 DB와 상호작용을 하기위한 객체인 EntityManager를 Spring Context에 자동으로 주입하는 annotation
    @PersistenceContext
    private EntityManager entityManager;
    // Entity의 영속성 관리를 담당하는 JPA의 핵심 interface
    // CRUD작업, Query실행 등 DB와의 상호작용을 담당

    @Bean
    public JPAQueryFactory jpaQueryFactory () {
        // QueryDSL을 사용하기 위해 필요한 객체
        return new JPAQueryFactory(entityManager);
    }
}
