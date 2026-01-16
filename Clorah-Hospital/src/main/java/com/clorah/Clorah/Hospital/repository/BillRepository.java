package com.clorah.Clorah.Hospital.repository;

import com.clorah.Clorah.Hospital.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository  extends JpaRepository<Bill, Long> {
}
