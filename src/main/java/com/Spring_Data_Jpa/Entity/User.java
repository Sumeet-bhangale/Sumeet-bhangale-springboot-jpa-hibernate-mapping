package com.Spring_Data_Jpa.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long ID;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private AadharCard aadharCard;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<MobilePhone> mobilePhones;

}
