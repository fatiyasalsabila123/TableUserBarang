package com.tokoonline.project.service;

import com.tokoonline.project.exception.InternalErrorException;
import com.tokoonline.project.exception.NotFoundException;
import com.tokoonline.project.model.TableBarang;
import com.tokoonline.project.repository.TableBarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableBarangServiceImpl implements TableBarangService{

    @Autowired
    TableBarangRepository tableBarangRepository;

    public Object getAllTableBarang() {
        try {
            return tableBarangRepository.findAll();
        } catch (Exception e) {
            return "Kesalahan Memunculkan Data";
        }
    }

    @Override
    public Object getAlltableBarang() {
        return tableBarangRepository.findAll();
    }

    @Override
    public TableBarang addTableBarang(TableBarang tableBarang) {
            return tableBarangRepository.save(tableBarang);

    }
    @Override
    public Object getTableBarang(Long Id) {
        var tableBarang = tableBarangRepository.findById(Id).orElseThrow(() -> new NotFoundException(("Id tidak Di Temukan")));
        try {
            return tableBarangRepository.save(tableBarang);
        } catch (Exception e) {
            throw new InternalErrorException("Kesalahan Memunculkan Data");
        }
    }

    @Override
    public TableBarang editTableBarang(Long id, String name, Float price, Integer count, Integer rating, String description, Boolean publish)
    {
        TableBarang tableBarang = tableBarangRepository.findById(id).get();
        tableBarang.setName(name);
        tableBarang.setPrice(Float.valueOf(price));
        tableBarang.setCount(Integer.valueOf(count));
        tableBarang.setRating(Integer.valueOf(rating));
        tableBarang.setDescription(description);
        tableBarang.setPublish(Boolean.valueOf(publish));
        return tableBarangRepository.save(tableBarang);
    }


    @Override
    public void deleteTableBarangById(Long Id) {
        tableBarangRepository.deleteById(Id);
    }

}
