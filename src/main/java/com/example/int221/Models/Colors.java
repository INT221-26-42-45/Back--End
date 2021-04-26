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
@Table(name = "colors")
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "colorid")
    private String colorId;

    @Column(name = "colorname")
    private String colorName;

}
