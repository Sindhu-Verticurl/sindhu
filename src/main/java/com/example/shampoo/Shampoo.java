package com.example.shampoo;


import lombok.Data;
import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Data
@Entity

public class Shampoo {
	
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Id
	    private Integer shampooId;
	 
	    public Integer getShampooId() {
		return shampooId;
	}
	public void setShampooId(Integer shampooId) {
		this.shampooId = shampooId;
	}
	
	public String getShampooname() {
		return shampooname;
	}
	
	public void setShampooname(String shampooname) {
		this.shampooname = shampooname;
	}
		private String shampooname;

}
