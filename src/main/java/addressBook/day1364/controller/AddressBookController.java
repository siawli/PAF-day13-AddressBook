package addressBook.day1364.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import addressBook.day1364.model.Contact;
import addressBook.day1364.repository.AddressBookRepo;

@Controller
public class AddressBookController {

    @Autowired
    private AddressBookRepo addressBookR;

    @GetMapping("/")
    public String showContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        model.addAttribute("errorMsg", "");
        return "mainPage";
    }

    @PostMapping("/contact")
    public String mainPage(@ModelAttribute Contact contact, Model model) {
        Boolean result = addressBookR.saveNewDetails(contact);

        String errorMsg = "";
        if (result) {
            errorMsg = "User added!";
        } else {
            errorMsg = "User already exist!";
        }

        //System.out.println(">>> errorMsg: " + errorMsg);
        model.addAttribute("errorMsg", errorMsg);
        return "mainPage";
    }
    
}
