package com.tokoonline.project.controler;

import com.tokoonline.project.model.TableBarang;
import com.tokoonline.project.response.CommonResponse;
import com.tokoonline.project.response.ResponseHelper;
import com.tokoonline.project.service.TableBarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tableBarang")
public class TableBarangControler {
    @Autowired
    private TableBarangService tableBarangService;

    @GetMapping("/all")
    public Object getAllTableBarang() {
        return ResponseHelper.ok(tableBarangService.getAlltableBarang());
    }

    @GetMapping("/{Id}")
    public Object getTableBarang(@PathVariable("Id")Long Id) {
        return ResponseHelper.ok(tableBarangService.getTableBarang(Id));
    }
    @PostMapping
    public ResponseEntity<CommonResponse<TableBarang>> addTableBarang(@RequestBody TableBarang tableBarang) {
        return ResponseHelper.ok (tableBarangService.addTableBarang(tableBarang));
    }
    @PutMapping("/{Id}")
    public ResponseEntity<CommonResponse<TableBarang>> editTableBarangById(@PathVariable("Id") Long Id, @RequestBody TableBarang tableBarang) {
        return ResponseHelper.ok (tableBarangService.editTableBarang(Id, tableBarang.getName(), tableBarang.getPrice(), tableBarang.getCount(), tableBarang.getRating(), tableBarang.getDescription(), tableBarang.getPublish()));
    }

    @DeleteMapping("/{Id}")
    public void deleteTableBarangById(@PathVariable("Id") Long Id) {
        tableBarangService.deleteTableBarangById(Id);
    }

}
