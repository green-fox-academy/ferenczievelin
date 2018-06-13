package com.greenfoxacademy.springstart.Services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
        public String log(String message) {
            System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
            return log(message);
        }


  //  public void log(){
    //    myColor.printMyColor();
    //    System.out.println("hello again");
    //}
}

