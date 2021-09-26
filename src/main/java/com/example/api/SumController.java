package com.example.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/sum")
    public String sum(@RequestParam(value = "input", defaultValue = "0" ) String input) {
        String[] numbers = input.split(" ");
        Integer sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum.toString();
    }
}
