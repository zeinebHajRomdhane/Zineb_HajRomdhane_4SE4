package tn.esprit.zineb_hajromdhane_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.entities.Subscription;
import tn.esprit.zineb_hajromdhane_4se4.entities.TypeSubscription;
import tn.esprit.zineb_hajromdhane_4se4.services.RegistrationServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.SubscriptionServiceImpl;

import java.util.List;
import java.util.Set;

@RequestMapping("subscription")
@Tag(name= "Gestion Subscription")
@RestController
@AllArgsConstructor


public class SubscriptionRestController {

    private SubscriptionServiceImpl subscriptionService;


    @Operation(description = "Ajouter une nouvelle souscription.")
    @PostMapping("/addSub")
    public Subscription addSubscription( @RequestBody Subscription subscription){
        return subscriptionService.addSubscription(subscription);
    }


    @Operation(description = "Récupérer une souscription spécifique par son numéro.")
    @GetMapping("get/{numSubscription}")
    public Subscription getSubscription(@PathVariable Long numSubscription){
        return subscriptionService.retrieveSubscription(numSubscription);
    }


    @Operation(description = "Récupérer la liste de toutes les souscriptions.")
    @GetMapping("/getAll")
    public List<Subscription> getAll(){
        return subscriptionService.retrieveAll();
    }


    @Operation(description = "Mettre à jour les informations d'une souscription.")
    @PutMapping("/update")
    public Subscription updateSubscription(@RequestBody Subscription subscription){
        return subscriptionService.updateSubscription(subscription);
    }


    @Operation(description = "Supprimer une souscription par son numéro.")
    @DeleteMapping("/delete/{numSubscription}")
    public void delete(@PathVariable Long numSubscription){
        subscriptionService.deleteSubscription(numSubscription);
    }


    @Operation(description = "Trouver une souscription par type")
    @GetMapping("/getSubscriptionByTypeSub/{typeSubscription}")
    public Set<Subscription> getSubscriptionByTypeSub(@PathVariable TypeSubscription typeSubscription){
        return subscriptionService.getSubscriptionByTypeSub(typeSubscription);
    }
}
