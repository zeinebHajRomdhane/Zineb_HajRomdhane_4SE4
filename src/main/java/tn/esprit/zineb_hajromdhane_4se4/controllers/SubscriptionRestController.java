package tn.esprit.zineb_hajromdhane_4se4.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.zineb_hajromdhane_4se4.entities.Registration;
import tn.esprit.zineb_hajromdhane_4se4.entities.Subscription;
import tn.esprit.zineb_hajromdhane_4se4.services.RegistrationServiceImpl;
import tn.esprit.zineb_hajromdhane_4se4.services.SubscriptionServiceImpl;
@RequestMapping("subscription")

@RestController
@AllArgsConstructor
public class SubscriptionRestController {
    private SubscriptionServiceImpl subscriptionService;
    @PostMapping("/addSub")
    public Subscription addSubscription(Subscription subscription){
        return subscriptionService.addSubscription(subscription);
    }
}
