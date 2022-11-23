package com.tokoonline.project.repository;

import com.tokoonline.project.model.TableUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TableUserRepository extends JpaRepository<TableUser, Long> {

    @Query(value = "select * from table_user where email = :email", nativeQuery = true)
    Optional<TableUser> findByEmail(String email);
}
