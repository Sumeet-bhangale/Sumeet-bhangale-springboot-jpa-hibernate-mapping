package com.Spring_Data_Jpa.Repository;

import com.Spring_Data_Jpa.Entity.AadharCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadharCardRepository extends JpaRepository<AadharCard, Long> {
}
