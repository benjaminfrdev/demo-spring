package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    @Id
//    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // mapping thong tin
    @Column(name = "hp")
    private int hp;

    @Column(name = "stamina")
    private int statima;


    // neu khong co Column annotation thi se tu dong mapping theo ten bien

    private int atk;
    private int def;
    private int agi;

//    public Long getId() {
//        return id;
////    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
