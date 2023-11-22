package com.example.shampoo;

import com.example.shampoo.Shampoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShampooRepo extends JpaRepository<Shampoo, Integer>{

}
