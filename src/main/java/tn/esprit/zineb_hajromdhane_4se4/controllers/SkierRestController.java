package tn.esprit.zineb_hajromdhane_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.services.RegistrationServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.SkierServiceImpl;
@RequestMapping("skier")

@RestController
@AllArgsConstructor
public class SkierRestController {
    private SkierServiceImpl skierService;
    @PostMapping("/addS")
    public Skier addSkier(Skier skier){
        return skierService.addSkier(skier);
    }
}
