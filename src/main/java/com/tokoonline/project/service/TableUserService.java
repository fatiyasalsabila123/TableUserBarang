package com.tokoonline.project.service;

import com.tokoonline.project.model.TableUser;

public interface TableUserService {

    Object getAllTableUser();

    Object getAlltableBarang();

    TableUser addTableUser(TableUser tableUser);

    Object getTableUser(Long Id);


    TableUser editTableUser(Long id, String username, String email, Integer age, String address, Integer phoneNumber);

    void deleteTableUserById(Long Id);
}
