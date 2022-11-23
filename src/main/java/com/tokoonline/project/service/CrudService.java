package com.tokoonline.project.service;

import com.tokoonline.project.model.Crud;

import java.util.Date;

public interface CrudService {
    Object getAllcrud();

    Crud addCrud(Crud crud);

    Object getCrud(Long Id);

    Crud editCrud(Long Id, String namaBarang, Double harga, String pemilik);

    void deleteCrudById(Long Id);
}
