package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.Services.Printer;
import com.greenfoxacademy.springstart.Services.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {
    @Autowired
    SpellChecker checker;

    @Autowired
    Printer printer;

    public static void main(String[] args) {
        SpringApplication.run(SpringstartApplication.class, args);
    }
    @Override
        public void run(String... args) throws Exception {
            checker.checkSpelling();
        }
}
