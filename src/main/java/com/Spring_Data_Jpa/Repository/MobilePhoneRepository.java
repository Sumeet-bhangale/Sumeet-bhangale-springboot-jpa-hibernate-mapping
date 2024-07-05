package com.Spring_Data_Jpa.Repository;

import com.Spring_Data_Jpa.Entity.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone,Long > {
}
