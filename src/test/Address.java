package test;

import java.io.Serializable;

public class Address implements Serializable{

	   private static final long serialVersionUID = 2L;

	   String street;
	   String country;

	   public void setStreet(String street){
		   this.street = street;
	   }

	   public void setCountry(String country){
		   this.country = country;
	   }

	   public String getStreet(){
		   return this.street;
	   }

	   public String getCountry(){
		   return this.country;
	   }

	   public String toString() {
    	   return " Street : "+ this.street + " Country : "+ this.country;
	   }
}