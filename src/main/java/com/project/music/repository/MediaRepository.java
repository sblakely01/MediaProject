package com.project.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.music.entity.Media;

@RepositoryRestResource()
@Repository

public interface MediaRepository extends JpaRepository<Media, Integer>, JpaSpecificationExecutor<Media>, QuerydslPredicateExecutor<Media> {}
