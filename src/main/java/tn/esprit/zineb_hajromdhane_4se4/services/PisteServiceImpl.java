package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.repositories.IPisteRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ISkierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PisteServiceImpl implements IPisteServices{
    private IPisteRepository pisteRepository;
    private ISkierRepository skierRepository;
    public Piste addPiste(Piste piste){
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retrieveAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public void deletePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public void assignSkierToPiste(Long numSkier, Long numPiste) {
        Skier skier= skierRepository.findById(numSkier).orElse(null);
        Piste piste=pisteRepository.findById(numPiste).orElse(null);
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }
}
