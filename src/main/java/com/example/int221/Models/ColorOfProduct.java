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
public class ColorOfProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String colorOfproduct;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Products productId;

    @ManyToOne
    @JoinColumn(name = "colorId")
    private Colors colorId;

}
