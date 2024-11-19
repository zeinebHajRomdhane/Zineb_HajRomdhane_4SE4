package tn.esprit.zineb_hajromdhane_4se4.services;

import tn.esprit.zineb_hajromdhane_4se4.entities.Subscription;
import tn.esprit.zineb_hajromdhane_4se4.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionServices {
    public Subscription addSubscription(Subscription subscription);
    public Subscription retrieveSubscription(Long numSubscription);
    public List<Subscription> retrieveAll();
    public void deleteSubscription(Long numSubscription);
    public Subscription updateSubscription(Subscription subscription);

    Set<Subscription> getSubscriptionByTypeSub(TypeSubscription typeSubscription);
}
