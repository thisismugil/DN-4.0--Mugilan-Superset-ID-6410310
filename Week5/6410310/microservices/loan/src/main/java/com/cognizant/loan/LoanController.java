package com.cognizant.loan;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/loans")
public class LoanController {
    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        return new Loan(number, "car", 400000, 3258, 18);
    }
    record Loan(String number, String type, double loan, int emi, int tenure) {}
}
