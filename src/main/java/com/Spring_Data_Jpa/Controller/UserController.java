package com.Spring_Data_Jpa.Controller;

import com.Spring_Data_Jpa.Entity.AadharCard;
import com.Spring_Data_Jpa.Entity.MobilePhone;
import com.Spring_Data_Jpa.Entity.User;
import com.Spring_Data_Jpa.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
public class UserController {


    @Autowired
    UserRepository userRepository;


    @PostMapping("/addUser")
    public String addUser(@RequestBody User user, AadharCard aadharCard) {


        if (user.getAadharCard() != null) {
            aadharCard = user.getAadharCard();
            aadharCard.setUser(user); // Set the user in the AadharCard
        }

        // Saving Mobile Numbers
        if (user.getMobilePhones() != null) {
            for (MobilePhone mobilePhone : user.getMobilePhones()) {
                mobilePhone.setUser(user); // Set the user in each MobilePhone
            }
        }
        userRepository.save(user);
        return "User and AadharCard saved successfully!";
    }



}


