package com.clorah.Clorah.Hospital.service;

import com.clorah.Clorah.Hospital.models.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    public Bill createBill(Bill bill){
        //logic to now create the patient into the db
        try{
            return null;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public Bill getBillById (Long id){
        try{
            return null;
        }catch (Exception e) {
            return null;
        }
    }
    public List<Bill> getAllBills(){
        try{
            System.out.println("into service layer");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }


    public Bill updateBill(Long id){
        try{
            System.out.println("patient updating");
            return null;
        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());
            return null;
        }
    }

    public void deleteBill(Long id){
        try{
            System.out.println("patient deleting");

        }catch(Exception e){
            System.out.println("Error Message: " + e.getMessage());

        }
    }

}
