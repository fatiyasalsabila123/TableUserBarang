package com.tokoonline.project.service;

import com.tokoonline.project.exception.EmailException;
import com.tokoonline.project.exception.InternalErrorException;
import com.tokoonline.project.exception.NotFoundException;
import com.tokoonline.project.model.Crud;
import com.tokoonline.project.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudServiceImpl implements CrudService{
    @Autowired
    CrudRepository crudRepository;

    public Object getAllCrud() {
        try {
            return crudRepository.findAll();
        } catch (Exception e) {
            return "Kesalahan Memunculkan Data";
        }
    }

    @Override
    public Object getAllcrud() {
        return crudRepository.findAll();
    }

    @Override
    public Crud addCrud(Crud crud) {
        if (crudRepository.findByPemilik(crud.getPemilik()).isPresent()) {
            throw new EmailException("Pemilik Sudah Ada  Digunakan");
        }
        return crudRepository.save(crud);
    }
    @Override
    public Object getCrud(Long Id) {
        var crud = crudRepository.findById(Id).orElseThrow(() -> new NotFoundException(("Id tidak Di Temukan")));
        try {
            return crudRepository.save(crud);
        } catch (Exception e) {
            throw new InternalErrorException("Kesalahan Memunculkan Data");
        }
    }
    @Override
    public Crud editCrud(Long id, String namaBarang, String harga, String pemilik){
        Crud crud = crudRepository.findById(id).get();
        crud.setNamaBarang(namaBarang);
        crud.setHarga(harga);
        return crudRepository.save(crud);

    }
    @Override
    public void deleteCrudById(Long Id) {
        crudRepository.deleteById(Id);
    }
}
