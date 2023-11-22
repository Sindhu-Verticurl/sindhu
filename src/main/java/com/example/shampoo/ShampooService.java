package com.example.shampoo;

import com.example.shampoo.Shampoo;
import com.example.shampoo.ShampooRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ShampooService {
	
  private ShampooRepo repository;
  
  public ShampooService(ShampooRepo repository) {
	  this.repository = repository;
	  
	  
  }
  
  public Shampoo create(Shampoo shampoo)
  {
	  return repository.save(shampoo);
			  
  }
  public Optional<Shampoo> getShampoo(Integer shampooId) {
	  Optional<Shampoo> optionalShampoo = repository.findById(shampooId);
	  return optionalShampoo;
  }
  public List<Shampoo> getAll() {
      List<Shampoo> shampoos = null;
      //try {
          shampoos = repository.findAll();
          /* }
 catch (Exception e) {
          System.out.println("STackTrace: " + Arrays.toString(e.getStackTrace()));
          System.out.println("Caught an Exception....");
          shampoos = new ArrayList<>();
      } */
      return shampoos;
  }
  public Shampoo update(Integer shampooId, Shampoo shampoo) {
      if (shampooId != shampoo.getShampooId()) {
          //throw new ShampooValidationException("Mismatch in EmployeeId");
      }
      Optional<Shampoo> shampooOptional = repository.findById(shampooId);
      if (shampooOptional.isPresent()) {
          return repository.save(shampoo);
      }
      else {
          //throw new ShampooNotFoundException("Shampoo Not found: " + shampooId);
    	  return null;
      }
  }
}
