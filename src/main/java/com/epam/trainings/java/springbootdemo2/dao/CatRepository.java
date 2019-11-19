package com.epam.trainings.java.springbootdemo2.dao;

import com.epam.trainings.java.springbootdemo2.model.Cat;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CatRepository extends JpaRepository<Cat, UUID> {


}
