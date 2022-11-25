package com.tokoonline.project.repository;

import com.tokoonline.project.model.Crud;
import com.tokoonline.project.model.TableUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CrudRepository extends JpaRepository<Crud, Long> {
    @Query(value = "select * from crud where pemilik = :email", nativeQuery = true)
    Optional<TableUser> findByPemilik(String email);
}
