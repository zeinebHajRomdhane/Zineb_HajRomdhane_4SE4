package tn.esprit.zineb_hajromdhane_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Instructor;
import tn.esprit.zineb_hajromdhane_4se4.services.CourseServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.InstructorServiceImpl;
@RequestMapping("instructor")

@RestController
@AllArgsConstructor
public class InstructorRestController {
    private InstructorServiceImpl instructorService;
    @PostMapping("/addC")
    public Instructor addInstructor(Instructor instructor){
        return instructorService.addInstructor(instructor);
    }
}
