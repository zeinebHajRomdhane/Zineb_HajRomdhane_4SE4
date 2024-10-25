package tn.esprit.zineb_hajromdhane_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.services.CourseServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.PisteServiceImpl;
@RequestMapping("course")

@RestController
@AllArgsConstructor
public class CourseRestController {
    private CourseServiceImpl courseService;
    @PostMapping("/addC")
    public Course addCourse(Course course){
        return courseService.addCourse(course);
    }
}
