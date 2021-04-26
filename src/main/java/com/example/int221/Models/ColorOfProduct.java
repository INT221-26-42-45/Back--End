package com.example.int221.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "colorofproduct")
public class ColorOfProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "colorofproductid")
    private String colorOfproductId;

    @ManyToOne
    @JoinColumn(name = "productid")
    private Products products;

    @ManyToOne
    @JoinColumn(name = "colorid")
    private Colors colors;

}
