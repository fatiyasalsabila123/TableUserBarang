package com.tokoonline.project.repository;

import com.tokoonline.project.model.Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Long> {
}