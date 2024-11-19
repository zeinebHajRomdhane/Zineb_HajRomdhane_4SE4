package tn.esprit.zineb_hajromdhane_4se4.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.entities.Support;
import tn.esprit.zineb_hajromdhane_4se4.services.CourseServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.PisteServiceImpl;

import java.util.List;

@RequestMapping("course")
@Tag(name= "Gestion Cours")
@RestController
@AllArgsConstructor


public class CourseRestController {

    private CourseServiceImpl courseService;


    @Operation(description = "Ajouter un nouveau cours.")
    @PostMapping("/addC")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }


    @Operation(description = "Récupérer un cours spécifique par son numéro.")
    @GetMapping("get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse){
        return courseService.retrieveCourse(numCourse);
    }


    @Operation(description = "Récupérer la liste de tous les cours.")
    @GetMapping("/getAll")
    public List<Course> getAll(){
        return courseService.retrieveAll();
    }


    @Operation(description = "Mettre à jour les informations d'un cours.")
    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }


    @Operation(description = "Supprimer un cours par son numéro.")
    @DeleteMapping("/delete/{numCourse}")
    public void delete(@PathVariable Long numCourse){
        courseService.deleteCourse(numCourse);
    }


    @Operation(description = "Récupérer les cours selon le type de support.")
    @GetMapping("/getBySupport/{support}")
    public List<Course> getBySupport(@PathVariable  Support support){
        return  courseService.retrieveBySupport(support);
    }

}
