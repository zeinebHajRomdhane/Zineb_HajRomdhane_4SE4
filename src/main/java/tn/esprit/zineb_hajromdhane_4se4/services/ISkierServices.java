package tn.esprit.zineb_hajromdhane_4se4.services;

import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;

import java.util.List;

public interface ISkierServices {
    public Skier addSkier(Skier skier);
    public Skier retrieveSkier(Long numSkier);
    public List<Skier> retrieveAll();
    public void deleteSkier(Long numSkier);
    public Skier updateSkier(Skier skier);
}
