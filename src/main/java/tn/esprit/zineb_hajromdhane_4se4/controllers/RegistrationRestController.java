package tn.esprit.zineb_hajromdhane_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.zineb_hajromdhane_4se4.entities.Instructor;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.services.InstructorServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.RegistrationServiceImpl;
@RequestMapping("registration")

@RestController
@AllArgsConstructor
public class RegistrationRestController {

        private RegistrationServiceImpl registrationService;
        @PostMapping("/addR")
        public Registration addRegistration(Registration registration){
            return registrationService.addRegistration(registration);
        }


}
