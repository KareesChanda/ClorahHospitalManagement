package com.clorah.Clorah.Hospital.service;

import com.clorah.Clorah.Hospital.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BillService {
    //Logger is important to manage errors as the application complexity grows
    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    public Bill createBill(Bill bill){
        //logic to now create the patient into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while creating a bill: {}", e.getMessage());
            return null;
        }
    }

    public Bill getBillById (Long id){
        try{
            return null;
        }catch (Exception e) {
            logger.error("An error occurred while getting a bill with id {}: {}", id, e.getMessage());
            return null;
        }
    }
    public List<Bill> getAllBills(){
        try{
            System.out.println("into service layer");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while getting all bills: {}", e.getMessage());
            return null;
        }
    }


    public Bill updateBill(Long id, @RequestBody Bill bill){
        try{
            System.out.println("patient updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while updating a bill with id {}: {}",id, e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id){
        try{
            System.out.println("patient deleting");

        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            logger.error("An error occurred while deleting the bill with id {}: {}", id, e.getMessage());

        }
    }

}
