package edu.iu.lukemeng.primesservice.controller;

import edu.iu.lukemeng.primesservice.model.Customer;
import edu.iu.lukemeng.primesservice.service.IPrimesService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimeController {
    IPrimesService primesService;

    public PrimeController(IPrimesService primesService) {
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }



}

