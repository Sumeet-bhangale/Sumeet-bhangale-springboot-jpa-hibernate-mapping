package com.Spring_Data_Jpa.Entity;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="mobile_phone")
public class MobilePhone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "mobileNumber")
    private long mobileNumber;



    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
