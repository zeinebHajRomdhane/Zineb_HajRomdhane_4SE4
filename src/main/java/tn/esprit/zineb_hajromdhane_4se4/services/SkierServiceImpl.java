package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.*;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ICourseRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IPisteRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IRegistrationRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ISkierRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierServices{
    private ISkierRepository skierRepository;
    private ICourseRepository courseRepository;
    private IRegistrationRepository registrationRepository;
    private IRegistrationServices registrationServices;
    private IPisteRepository pisteRepository;
    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void deleteSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);

    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse) {
        Course course = courseRepository.findById(numCourse).orElse(null);
        skierRepository.save(skier);
        Registration registration = new Registration();
        registration.setCourse(course);
        registration.setSkier(skier);
        registrationRepository.save(registration);
        skier.getRegistrations().add(registration);
        return skierRepository.save(skier);
    }

    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscriptionTypeSub(typeSubscription);
    }


}
