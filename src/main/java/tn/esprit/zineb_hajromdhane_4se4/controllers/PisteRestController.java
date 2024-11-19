package tn.esprit.zineb_hajromdhane_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.services.PisteServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.SkierServiceImpl;

import java.util.List;
@Tag(name= "Gestion Piste")
@RequestMapping("piste")
@RestController
@RequiredArgsConstructor


public class PisteRestController {

    private final PisteServiceImpl pisteService;


    @Operation(description = "Ajouter une nouvelle piste.")
    @PostMapping("/addP")
    public Piste addPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }


    @Operation(description = "Récupérer une piste spécifique par son numéro.")
    @GetMapping("get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste){
        return pisteService.retrievePiste(numPiste);
    }


    @Operation(description = "Récupérer la liste de toutes les pistes.")
    @GetMapping("/getAll")
    public List<Piste> getAll(){
        return pisteService.retrieveAll();
    }


    @Operation(description = "Mettre à jour les informations d'une piste.")
    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteService.updatePiste(piste);
    }


    @Operation(description = "Supprimer une piste par son numéro.")
    @DeleteMapping("/delete/{numPiste}")
    public void delete(@PathVariable Long numPiste){
        pisteService.deletePiste(numPiste);
    }


    @Operation(description = "Assigner un skieur à une piste spécifique.")
    @PutMapping("assignToPiste/{numSkier}/{numPiste}")
    public void assignSkierToPiste(Long numSkier, Long numPiste){
        pisteService.assignSkierToPiste(numSkier,numPiste);
    }
}
