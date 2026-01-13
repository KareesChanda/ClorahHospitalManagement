package com.clorah.Clorah.Hospital.controllers;

import com.clorah.Clorah.Hospital.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    //Generate a Bill
    @PostMapping("/generate-bill")
    public Bill createBill (@RequestBody Bill bill){
        System.out.println("Bill generated");
        return null;
    }

    //edit a bill
    @PutMapping("/{id}")
    public void editBill(@PathVariable Long id){
        System.out.println("Edit a bill");
    }

    //get a bill by unique id
    @GetMapping("/{id}")
    public Bill getBillById (@PathVariable Long id) {
        return null;
    }

    //List all bills
    @GetMapping
    public List<Bill> getAllBills(){
        System.out.println("Fetching all bills");
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){

    }

}
