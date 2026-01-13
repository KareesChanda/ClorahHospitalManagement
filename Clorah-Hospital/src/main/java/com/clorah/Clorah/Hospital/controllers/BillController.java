package com.clorah.Clorah.Hospital.controllers;

import com.clorah.Clorah.Hospital.models.Bill;
import com.clorah.Clorah.Hospital.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {
    //connect to BillService
    @Autowired
    private BillService billService;

    //Generate a Bill
    @PostMapping("/generate-bill")
    public Bill createBill (@RequestBody Bill bill){
        System.out.println("Billing");
        return billService.createBill(bill);
    }

    //List all bills
    @GetMapping
    public List<Bill> getAllBills(){
        System.out.println("Fetching all bills");
        return billService.getAllBills();
    }

    //edit a bill
    @PutMapping("/{id}")
    public void editBill(@PathVariable Long id){
        billService.updateBill(id);
    }

    //get a bill by unique id
    @GetMapping("/{id}")
    public Bill getBillById (@PathVariable Long id) {
        return billService.getBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable Long id){
        billService.deleteBill(id);
    }

}
