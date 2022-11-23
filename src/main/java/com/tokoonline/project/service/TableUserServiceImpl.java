package com.tokoonline.project.service;

import com.tokoonline.project.exception.EmailException;
import com.tokoonline.project.exception.InternalErrorException;
import com.tokoonline.project.exception.NotFoundException;
import com.tokoonline.project.model.TableUser;
import com.tokoonline.project.repository.TableUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableUserServiceImpl implements TableUserService {

    @Autowired
    TableUserRepository tableUserRepository;

    @Autowired
    public Object getAllTableUser() {
        try {
            return tableUserRepository.findAll();
        } catch (Exception e) {
            return "Kesalahan Memunculkan Data";
        }
    }

    @Override
    public Object getAlltableBarang() {
        return tableUserRepository.findAll();
    }

    @Override
    public TableUser addTableUser(TableUser tableUser) {
        if (tableUserRepository.findByEmail(tableUser.getEmail()).isPresent()) {
            throw new EmailException("Email Sudah Digunakan");
        }
        return tableUserRepository.save(tableUser);
    }

    @Override
    public Object getTableUser(Long Id) {
        var tableUser = tableUserRepository.findById(Id).orElseThrow(() -> new NotFoundException(("Id Tidak DiTemukan")));
        try {
            return tableUserRepository.save(tableUser);
        } catch (Exception e) {
            throw new InternalErrorException("Kesalahan Memunculkan Data");
        }
    }

    @Override
    public TableUser editTableUser(Long id, String username, String email, Integer age, String address, Integer phoneNumber) {
        TableUser tableUser = tableUserRepository.findById(id).get();
        tableUser.setUserName(username);
        tableUser.setEmail(email);
        tableUser.setAge(age);
        tableUser.setAddress(address);
        tableUser.setPhoneNumber(phoneNumber);
        return tableUserRepository.save(tableUser);
    }

    @Override
    public void deleteTableUserById(Long Id) {
        tableUserRepository.deleteById(Id);
    }

}
