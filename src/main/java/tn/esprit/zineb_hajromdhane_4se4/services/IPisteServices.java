package tn.esprit.zineb_hajromdhane_4se4.services;

import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;

import java.util.List;

public interface IPisteServices {
    public Piste addPiste(Piste piste);
    public Piste retrievePiste(Long numPiste);
    public List<Piste> retrieveAll();
    public void deletePiste(Long numPiste);
    public Piste updatePiste(Piste piste);
}
