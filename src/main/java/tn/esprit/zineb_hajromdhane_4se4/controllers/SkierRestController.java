package tn.esprit.zineb_hajromdhane_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.entities.TypeSubscription;
import tn.esprit.zineb_hajromdhane_4se4.services.RegistrationServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.SkierServiceImpl;

import java.util.List;

@RequestMapping("skier")
@Tag(name= "Gestion Skier")
@RestController
@AllArgsConstructor


public class SkierRestController {

    private SkierServiceImpl skierService;


    @Operation(description = "Ajouter un nouveau skieur.")
    @PostMapping("/add")
    public Skier addSkier(@RequestBody Skier skier){
        return skierService.addSkier(skier);
    }


    @Operation(description = "Récupérer un skieur spécifique par son numéro.")
    @GetMapping("get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){
        return skierService.retrieveSkier(numSkier);
    }


    @Operation(description = "Récupérer la liste de tous les skieurs.")
    @GetMapping("/getAll")
    public List<Skier> getAll(){
        return skierService.retrieveAll();
    }


    @Operation(description = "Mettre à jour les informations d'un skieur.")
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierService.updateSkier(skier);
    }


    @Operation(description = "Supprimer un skieur par son numéro.")
    @DeleteMapping("/delete/{numSkier}")
    public void delete(@PathVariable Long numSkier){
        skierService.deleteSkier(numSkier);
    }


    @Operation(description = "Ajouter et assigner un skieur à un cours.")
    @PostMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody  Skier skier, @PathVariable Long numCourse){
        return skierService.addSkierAndAssignToCourse(skier,numCourse);

    }

    @GetMapping("/retrieveSkiersBySubscriptionType/{typeSubscription}")
    public List<Skier> retrieveSkiersBySubscriptionType(@PathVariable TypeSubscription typeSubscription) {
        return skierService.retrieveSkiersBySubscriptionType(typeSubscription);
    }
}
