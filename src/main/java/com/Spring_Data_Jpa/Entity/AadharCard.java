package com.Spring_Data_Jpa.Entity;


import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "aadhar")
public class AadharCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long ID;

    @Column(name = "number")
    private long number;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;




}
