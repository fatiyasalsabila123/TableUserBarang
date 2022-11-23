package com.tokoonline.project.service;

import com.tokoonline.project.model.TableBarang;

public interface TableBarangService {
    Object getAlltableBarang();

    TableBarang addTableBarang(TableBarang tableBarang);

    Object getTableBarang(Long Id);

    TableBarang editTableBarang(Long id, String name, Float price, Integer count, Integer rating, String description, Boolean publish);

    void deleteTableBarangById(Long Id);

}
