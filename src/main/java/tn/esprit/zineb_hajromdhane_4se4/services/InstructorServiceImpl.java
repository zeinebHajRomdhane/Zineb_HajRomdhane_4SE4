package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Instructor;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ICourseRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IInstructorRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements IInstructorServices{
    private IInstructorRepository instructorRepository;
    private ICourseRepository courseRepository;
    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);

    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor addAndAssignToCourses(Instructor ins, Set<Long> numCourses) {
        List<Course> courseSet= (List<Course>) courseRepository.findAllById(numCourses);
        Set<Course> courses=new HashSet<>(courseSet);
        //for(Course course:courseSet){
            //courses.add(course);
        //}
        ins.setCourses(courses);
        return instructorRepository.save(ins);
    }
}
