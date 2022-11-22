package com.dealers.service.DealersRegistration;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class DealerService  {

	@Autowired
	private DealerRepos dealerRepos;

	@Autowired
	private SequenceGenerator service;

	public List<Dealer> getDealerDetails(){
		return dealerRepos.findAll();
	}

	public Dealer getDealerDetail(String id ){
		return dealerRepos.findById(id).get();
	}

	public Dealer addDealerDetails(Dealer s) {
		 s.setPassword(new BCryptPasswordEncoder().encode(s.getPassword()));
		s.setId("D"+ service.getSequenceNumber("Dealer_sequence"));
		
		return dealerRepos.save(s);
	}

	public Dealer updateDealer (Dealer s) {
		s.setPassword(new BCryptPasswordEncoder().encode(s.getPassword()));
		
		return dealerRepos.save(s);
	}
	public User getdetails(String id){
		Dealer f = dealerRepos.findById(id).get();
	       return new User(f.getId(),f.getPassword(),"Dealer");
	  }

	public String deleteDealer(String id){
		dealerRepos.deleteById(id);
      	return id;
    }






}











