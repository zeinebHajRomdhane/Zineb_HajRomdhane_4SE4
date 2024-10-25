package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IRegistrationRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ISkierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SkierServiceImpl implements ISkierServices{
    private ISkierRepository skierRepository;
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
}
