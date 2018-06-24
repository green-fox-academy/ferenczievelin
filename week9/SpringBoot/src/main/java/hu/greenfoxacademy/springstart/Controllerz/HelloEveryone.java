package hu.greenfoxacademy.springstart.Controllerz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloEveryone {
    AtomicLong languageind = new AtomicLong(0);
    int fontsize;
    int lang;
    String[] fontColours = {"Black", "Blue", "BlueViolet", "CadetBlue", "Crimson", "DarkMagenta", "DarkOrange", "DarkRed", "DarkSalmon", "DarkSlateGray", "ForestGreen", "Fuchsia", "LightBlue"};

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    @RequestMapping("/web/helloeverybody")
    public String greeting (Model model, Model style) {
        for (int i = 0; i <hellos.length ; i++) {
            Random random = new Random();
            int fontColour = random.nextInt(fontColours.length);
            int fontSize = (int) (12 + Math.random() * 30);
            model.addAttribute("hello",hellos[lang]);
            lang++;
            style.addAttribute("fontSize", fontSize);
            style.addAttribute("fontColour", fontColours[fontColour]);
        }
        return "greeting";
    }
}
