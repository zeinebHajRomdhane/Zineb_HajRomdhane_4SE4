package tn.esprit.zineb_hajromdhane_4se4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Support;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface ICourseRepository extends CrudRepository<Course,Long> {
    List<Course> findBySupport(Support support);


}
