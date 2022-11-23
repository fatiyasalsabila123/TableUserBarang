package com.tokoonline.project.controler;

import com.tokoonline.project.auditing.CrudAuditable;
import com.tokoonline.project.model.Crud;
import com.tokoonline.project.response.CommonResponse;
import com.tokoonline.project.response.ResponseHelper;
import com.tokoonline.project.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud")
public class CrudControler extends CrudAuditable {

    @Autowired
    private CrudService crudService;

    @GetMapping("/all")
    public Object getAllCrud(){
        return ResponseHelper.ok(crudService.getAllcrud());
    }

    @GetMapping("/{Id}")
    public Object getCrud(@PathVariable("Id")Long Id){
        return ResponseHelper.ok(crudService.getCrud(Id));
    }

    @PostMapping
    public ResponseEntity<CommonResponse<Crud>> addCrud(@RequestBody Crud crud) {
        return ResponseHelper.ok(crudService.addCrud(crud));
    }

    @PutMapping("/{Id}")
    public ResponseEntity<CommonResponse<Crud>> editCrudById(@PathVariable("Id")Long Id, @RequestBody Crud crud) {
        return ResponseHelper.ok(crudService.editCrud(Id, crud.getNamaBarang(), crud.getHarga(),crud.getPemilik()));
    }

    @DeleteMapping("/{Id}")
    public void deleteCrudById(@PathVariable("Id")Long Id) {
        crudService.deleteCrudById(Id);
    }
}
