package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.Course;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ICourseRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IRegistrationRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ISkierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationServiceImpl implements IRegistrationServices{
    private IRegistrationRepository registrationRepository;
    private ISkierRepository skierRepository;
    private ICourseRepository courseRepository;
    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public List<Registration> retrieveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);

    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override

    public Registration addAndAssignToSkier(Registration reg, Long numSkier) {
        Skier skier= skierRepository.findById(numSkier).orElse(null);
        reg.setSkier(skier);
        return registrationRepository.save(reg);


    }

    @Override
    public Registration addAndAssignToCourse(Long numRegistration, Long numCourse) {
        Course course= courseRepository.findById(numCourse).orElse(null);
        Registration registration = registrationRepository.findById(numRegistration).orElse(null);
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }


}
