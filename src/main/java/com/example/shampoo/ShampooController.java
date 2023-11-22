package com.example.shampoo;

import com.example.shampoo.Shampoo;
import com.example.shampoo.ShampooService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/shampoo")
@RestController

public class ShampooController {
	
	 private ShampooService service;

	    public ShampooController(ShampooService service) {
	        this.service = service;
	    }
	    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public Optional<Shampoo> getShampoo(@PathVariable("id") Integer shampooId) {
	        return service.getShampoo(shampooId);
	    }

	    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public Shampoo updateShampoo(@PathVariable("id") Integer shampooId, @RequestBody Shampoo shampoo) {
	        return service.update(shampooId, shampoo);
	    }
	    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Shampoo> getAll() {
	        return service.getAll();
	    }

	    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public Shampoo createEmployee(@RequestBody Shampoo shampoo) {
	        Shampoo createdShampoo = service.create(shampoo);
	        return createdShampoo;
	    }

}
