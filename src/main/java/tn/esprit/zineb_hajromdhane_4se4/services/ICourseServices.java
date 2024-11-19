package tn.esprit.zineb_hajromdhane_4se4.services;

import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.entities.Support;

import java.util.List;

public interface ICourseServices {
    public Course addCourse(Course course);
    public Course retrieveCourse(Long numCourse);
    public List<Course> retrieveAll();
    public void deleteCourse(Long numCourse);
    public Course updateCourse(Course course);
    public Course assignInstructorToCourse(Long numCourse, Long numInstructor);
    public List<Course> retrieveBySupport(Support support);
}
