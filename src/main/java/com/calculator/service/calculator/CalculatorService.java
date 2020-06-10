package com.calculator.service.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
    @GetMapping("/add/{x}/{y}")
    public Response add(@PathVariable int x, @PathVariable int y)
    {
        return new Response(x, y, x+y);
    }
}
