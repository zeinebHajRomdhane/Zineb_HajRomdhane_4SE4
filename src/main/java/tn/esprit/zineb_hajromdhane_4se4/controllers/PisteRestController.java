package tn.esprit.zineb_hajromdhane_4se4.controllers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.zineb_hajromdhane_4se4.entities.Piste;
import tn.esprit.zineb_hajromdhane_4se4.services.PisteServiceImpl;
@RequestMapping("piste")
@RestController
@RequiredArgsConstructor
public class PisteRestController {
    private final PisteServiceImpl pisteService;
    @PostMapping("/addP")
    public Piste addPiste(@RequestBody Piste piste){
        return pisteService.addPiste(piste);
    }
}
