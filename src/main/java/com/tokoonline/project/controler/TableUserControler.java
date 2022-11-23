package com.tokoonline.project.controler;

import com.tokoonline.project.model.TableUser;
import com.tokoonline.project.response.CommonResponse;
import com.tokoonline.project.response.ResponseHelper;
import com.tokoonline.project.service.TableUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tableUser")
public class TableUserControler {

    @Autowired
    private TableUserService tableUserService;

    @GetMapping("/all")
    public Object getAllTableUser() {
        return ResponseHelper.ok(tableUserService.getAllTableUser());
    }

    @GetMapping("/{Id}")
    public Object getTableUser(@PathVariable("Id")Long Id) {
        return ResponseHelper.ok(tableUserService.getTableUser(Id));
    }
    @PostMapping
    public ResponseEntity<CommonResponse<TableUser>> addTableUser(@RequestBody TableUser tableUser) {
        return ResponseHelper.ok (tableUserService.addTableUser(tableUser));
    }
    @PutMapping("/{Id}")
    public ResponseEntity<CommonResponse<TableUser>> editTableUserById(@PathVariable("Id") Long Id, @RequestBody TableUser tableUser) {
        return ResponseHelper.ok (tableUserService.editTableUser(Id, tableUser.getUsername(), tableUser.getEmail(), tableUser.getAge(), tableUser.getAddress(), tableUser.getPhoneNumber()));
    }

    @DeleteMapping("/{Id}")
    public void deletTableUserById(@PathVariable("Id") Long Id) {
        tableUserService.deleteTableUserById(Id);
    }
}
