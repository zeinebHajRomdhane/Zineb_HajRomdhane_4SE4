package tn.esprit.zineb_hajromdhane_4se4.services;

import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Instructor;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;

import java.util.List;
import java.util.Set;

public interface IInstructorServices {
    public Instructor addInstructor(Instructor instructor);
    public Instructor retrieveInstructor(Long numInstructor);
    public List<Instructor> retrieveAll();
    public void deleteInstructor(Long numInstructor);
    public Instructor updateInstructor(Instructor instructor);
    public Instructor addAndAssignToCourses(Instructor ins, Set<Long> numCourses);
}
