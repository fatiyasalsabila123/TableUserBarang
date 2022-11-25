package com.tokoonline.project.service;

import com.tokoonline.project.model.Crud;


public interface CrudService {
    Object getAllcrud();

    Crud addCrud(Crud crud);

    Object getCrud(Long Id);

    Crud editCrud(Long Id, String namaBarang, String harga, String pemilik);

    void deleteCrudById(Long Id);
}
