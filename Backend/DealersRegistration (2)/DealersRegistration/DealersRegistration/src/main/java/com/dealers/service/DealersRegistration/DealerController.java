package com.dealers.service.DealersRegistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Dealer")
//@CrossOrigin(origins="http://localhost:3000")

public class DealerController {
	
	
	@Autowired
	
	private DealerService dealerservice;
	
	@GetMapping("/all")
	public List<Dealer> getDealerDetails(){
		return dealerservice.getDealerDetails();
		}

	@PostMapping("/adddealers")
	public Dealer addDealerDetails(@RequestBody Dealer s) {
	   return dealerservice.addDealerDetails(s);
	  }
	
	@PutMapping("/dealer")
	public Dealer updateDealer (@RequestBody Dealer s) {
		return dealerservice.updateDealer(s);
		}
	
	@GetMapping("/dealers/{id}")
	public Object dealerDetails(@PathVariable String id ) {
		return dealerservice.getDealerDetail(id);
	}
	
	@DeleteMapping("/dealers/{id}")
	 public String deleteDealer(@PathVariable String id){
    	dealerservice.deleteDealer(id);
      	return  id;
	}
	
	@GetMapping("/getdetails/{id}")
    public User UserDetails(@PathVariable String id) {
          return dealerservice.getdetails(id);
    }
	
	
	
}
	
