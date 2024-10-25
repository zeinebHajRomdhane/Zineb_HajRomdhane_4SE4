package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ICourseRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IPisteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements ICourseServices{
    private ICourseRepository courseRepository;
    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public void deleteCourse(Long numCourse) {
        courseRepository.deleteById(numCourse);

    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }
}
