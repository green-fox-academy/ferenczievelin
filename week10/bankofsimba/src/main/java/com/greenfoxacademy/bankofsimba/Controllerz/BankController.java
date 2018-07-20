package com.greenfoxacademy.bankofsimba.Controllerz;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import com.greenfoxacademy.bankofsimba.Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {
    private final BankService bankService;

    @Autowired
    BankController(BankService bankService) {
        this.bankService = bankService;
    }

    BankAccount firstBankAccount = new BankAccount("Simba", 2000, "lion");

    @GetMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute(firstBankAccount);
        return "show";
    }

    @GetMapping("htmlception")
    public String htmlCeption(Model model) {
        String textPart= "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", textPart);
        return "htmlception";


    }
}
