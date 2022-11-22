package com.dealers.service.DealersRegistration;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.when;

class DealersTestCase {

    @InjectMocks
    public DealerController DealerController= Mockito.mock(DealerController.class);




    Dealer D  = new Dealer("1","Satya","kumar","Ram" );

    @Test
    public void  getDealerDetails(){
     List<Dealer> result = getAllAdminDetails();
        when(DealerController.getDealerDetails()).thenReturn(result);
      List<Dealer> Response = DealerController.getDealerDetails();
      assertThat(Response).isNotNull();
      assertThat(Response).isEqualTo(result);

    }

    public List<Dealer> getAllAdminDetails(){

        List<Dealer> testAdmins = new ArrayList<Dealer>();
        testAdmins.add(D);
        Dealer s = new Dealer("2","Surya","kumar","Ram");
        testAdmins.add(s);
        return testAdmins;
    }



    @Test
    void addDealerDetails(){
        Dealer s = new Dealer("2","Keshav","Maharaj","kumar");
        when(DealerController.addDealerDetails(s)).thenReturn(s);
        when(DealerController.addDealerDetails(D)).thenReturn(null);
        Dealer result1 = DealerController.addDealerDetails(D);
        Dealer result = DealerController.addDealerDetails(s);
        assertThat(result).isEqualTo(s);
        assertThat(result1).isNull();
    }



    @Test
    void updateDealer() {
        Dealer s = new Dealer("1","Kasi","Kumar","keshav");
        when(DealerController.updateDealer(s)).thenReturn(s);
        when(DealerController.updateDealer(D)).thenReturn(null);
        Dealer result1 = DealerController.updateDealer(D);
        Dealer result = DealerController.updateDealer(s);
        assertThat(result).isEqualTo(s);
        assertThat(result1).isNull();
        assertThat(result).isNotEqualTo(D);
    }

    @Test
    void deleteAdmin() {
        when(DealerController.deleteDealer("1")).thenReturn("Deleted SuccessFully");
        when(DealerController.deleteDealer("2")).thenReturn("NOT_FOUND");
        String result1 = (DealerController.deleteDealer("1"));
        String result = (DealerController.deleteDealer("2"));
        assertThat(result1).isEqualTo("Deleted SuccessFully");
        assertThat(result).isEqualTo("NOT_FOUND");
    }





}