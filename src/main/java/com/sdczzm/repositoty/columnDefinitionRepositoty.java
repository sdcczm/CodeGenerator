package com.sdczzm.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sdczzm.model.ColumnDefinition;


@RepositoryRestResource
public interface columnDefinitionRepositoty extends JpaRepository<ColumnDefinition, Integer> {

}
