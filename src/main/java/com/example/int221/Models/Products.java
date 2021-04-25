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

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;

    private String productName;

    private String productCode;

    private String productDescription;

    private String productType;

    private String productSize;

    private Double productPrice;

    private Date productDate;

    private String productImg;

    @ManyToOne
    @JoinColumn(name = "brandId")
    private Brands brandId;







}
