package com.greenfoxacademy.springstart.Services;

import org.springframework.stereotype.Service;

@Service
public class SpellChecker {
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor." );
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}


