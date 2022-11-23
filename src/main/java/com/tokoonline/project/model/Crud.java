package com.tokoonline.project.model;

import com.tokoonline.project.auditing.CrudAuditable;

import javax.persistence.*;

@Entity
@Table(name = "cruds")
public class Crud extends CrudAuditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nama_barang")
    private String namaBarang;

    @Column(name = "harga", nullable = false)
    private Double harga;

    @Column(name = "pemilik")
    private String pemilik;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }


    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    public String toString() {
        return "Crud{" +
                "Id=" + Id +
                ", namaBarang='" + namaBarang + '\'' +
                ", harga=" + harga +
                ", pemilik='" + pemilik + '\'' +
                '}';
    }
}
