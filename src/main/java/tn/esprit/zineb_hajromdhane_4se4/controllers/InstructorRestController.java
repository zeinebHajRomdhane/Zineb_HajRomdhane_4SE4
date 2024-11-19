package tn.esprit.zineb_hajromdhane_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Instructor;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.services.CourseServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.InstructorServiceImpl;

import java.util.List;
import java.util.Set;

@RequestMapping("instructor")
@Tag(name= "Gestion Instructor")
@RestController
@AllArgsConstructor


public class InstructorRestController {

    private InstructorServiceImpl instructorService;


    @Operation(description = "Ajouter un nouvel instructeur.")
    @PostMapping("/addI")
    public Instructor addInstructor(@RequestBody  Instructor instructor){
        return instructorService.addInstructor(instructor);
    }


    @Operation(description = "Récupérer un instructeur spécifique par son numéro.")
    @GetMapping("get/{numInstructor}")
    public Instructor getInstructor(@PathVariable Long numInstructor){
        return instructorService.retrieveInstructor(numInstructor);
    }


    @Operation(description = "Récupérer la liste de tous les instructeurs.")
    @GetMapping("/getAll")
    public List<Instructor> getAll(){
        return instructorService.retrieveAll();
    }


    @Operation(description = "Mettre à jour les informations d'un instructeur.")
    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorService.updateInstructor(instructor);
    }


    @Operation(description = "Supprimer un instructeur par son numéro.")
    @DeleteMapping("/delete/{numInstructor}")
    public void delete(@PathVariable Long numInstructor){
        instructorService.deleteInstructor(numInstructor);
    }


    @Operation(description = "Ajouter un instructeur et l'assigner à plusieurs cours.")
    @PostMapping("/AssignToCourses/{numCourses}")
    public Instructor assignToCourse(@RequestBody Instructor ins, @PathVariable Set<Long> numCourses){
        return instructorService.addAndAssignToCourses(ins,numCourses);
    }
}
