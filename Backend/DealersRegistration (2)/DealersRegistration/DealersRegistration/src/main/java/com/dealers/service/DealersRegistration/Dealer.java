package com.dealers.service.DealersRegistration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Dealers")

@NoArgsConstructor
@AllArgsConstructor
@Data




public class Dealer {
	
	@Transient
	 public static final String SEQUENCE_NAME = "Dealer_sequence";
	
	 
	 
	
	@Id
	
	private String id;	
	private String firstName;
	
	private String  lastName;
	private String password;
	

	}
