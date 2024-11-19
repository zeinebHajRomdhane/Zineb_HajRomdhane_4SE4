package tn.esprit.zineb_hajromdhane_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.zineb_hajromdhane_4se4.entities.Instructor;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.services.InstructorServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.RegistrationServiceImpl;

import java.util.List;

@RequestMapping("registration")
@Tag(name= "Gestion Registration")
@RestController
@AllArgsConstructor


public class RegistrationRestController {

        private RegistrationServiceImpl registrationService;

        @Operation(description = "Ajouter une nouvelle inscription.")
        @PostMapping("/addR")
        public Registration addRegistration(@RequestBody Registration registration){
            return registrationService.addRegistration(registration);
        }


        @Operation(description = "Récupérer une inscription spécifique par son numéro.")
        @GetMapping("get/{numRegistration}")
        public Registration getRegistration(@PathVariable Long numRegistration){
        return registrationService.retrieveRegistration(numRegistration);
        }


        @Operation(description = "Récupérer la liste de toutes les inscriptions.")
        @GetMapping("/getAll")
        public List<Registration> getAll(){
        return registrationService.retrieveAll();
    }


        @Operation(description = "Mettre à jour les informations d'une inscription.")
        @PutMapping("/update")
        public Registration updateRegistration(@RequestBody Registration registration){
        return registrationService.updateRegistration(registration);
        }


        @Operation(description = "Supprimer une inscription par son numéro.")
        @DeleteMapping("/delete/{numRegistration}")
        public void delete(@PathVariable Long numRegistration){
        registrationService.deleteRegistration(numRegistration);
         }


        @Operation(description = "Ajouter une inscription et l'assigner à un skieur.")
        @PutMapping("/addAndAssignToSkier/{reg}/{numSkier}")
        public void addAndAssignToSkier(@PathVariable Registration reg, @PathVariable Long numSkier){
            registrationService.addAndAssignToSkier(reg,numSkier);
        }


        @Operation(description = "Assigner un cours spécifique à une inscription.")
        @PutMapping("/AssignCourseToRegistration/{numRegistration}/{numCourse}")
        public void assignCourseToRegistration(@PathVariable Long numRegistration, @PathVariable Long numCourse){
            registrationService.addAndAssignToCourse(numRegistration,numCourse);
        }
}
