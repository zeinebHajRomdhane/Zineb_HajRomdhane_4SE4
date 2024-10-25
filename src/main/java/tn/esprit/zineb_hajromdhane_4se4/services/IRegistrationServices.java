package tn.esprit.zineb_hajromdhane_4se4.services;

import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;

import java.util.List;

public interface IRegistrationServices {
    public Registration addRegistration(Registration registration);
    public Registration retrieveRegistration(Long numRegistration);
    public List<Registration> retrieveAll();
    public void deleteRegistration(Long numRegistration);
    public Registration updateRegistration(Registration registration);
}
