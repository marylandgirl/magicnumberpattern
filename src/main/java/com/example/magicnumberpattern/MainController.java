package com.example.magicnumberpattern;

/*
Week 1 Challenge: Java Bootcamp
Kim Levin 1/26/2018
Receive user input of positive integer. If integer is even divide by 2. If integer is odd multiply it by 3 and add 1.
    no matter where the value it will eventually reach 1.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String printNums(@RequestParam int number){
        StringBuilder rpt = new StringBuilder();
        String retStr = "";
        int submitNum = 0;
        while ( number > 1) {
            submitNum = (number%2 == 0)?number/2:(number*3 + 1);
            rpt.append(Integer.toString(submitNum));
            number = -1;
        }
        retStr = rpt.toString();
        return retStr;
    }
}
