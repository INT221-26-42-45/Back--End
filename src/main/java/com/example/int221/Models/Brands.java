package com.example.int221.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "brands")
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "brandid")
    private String brandId;

    @Column(name = "brandname")
    private String brandName;

}
