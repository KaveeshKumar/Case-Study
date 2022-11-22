package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FarmerService {

    @Autowired
    private RestTemplate restTemplate;


    public Boolean checkIsFarmer(String Id){
        return restTemplate.getForObject("http://FarmerService/farmer/check/"+Id,Boolean.class);
       // return true;
    }
}
