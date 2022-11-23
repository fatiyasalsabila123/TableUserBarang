package com.tokoonline.project.model;


import javax.persistence.*;

@Entity
@Table(name = "table_barang")
public class TableBarang {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price")
    private Float price;

    @Column(name = "count")
    private Integer count;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "description")
    private String description;

    @Column(name = "publish")
    private Boolean publish;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    @Override
    public String toString() {
        return "TableBarang{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                ", publish=" + publish +
                '}';
    }

}
