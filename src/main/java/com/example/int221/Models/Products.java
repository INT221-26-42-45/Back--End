package com.example.int221.Models;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "productid")
    private String productId;

    @Column(name = "productname")
    private String productName;

    @Column(name = "productcode")
    private String productCode;

    @Column(name = "productdescription")
    private String productDescription;

    @Column(name = "producttype")
    private String productType;

    @Column(name = "productsize")
    private String productSize;

    @Column(name = "productprice")
    private Double productPrice;

    @Column(name = "productdate")
    private Date productDate;

    @Column(name = "productimg")
    private String productImg;

    @ManyToOne
    @JoinColumn(name = "brandid")
    private Brands brands;







}
