package tn.esprit.zineb_hajromdhane_4se4.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.entities.Subscription;
import tn.esprit.zineb_hajromdhane_4se4.entities.TypeSubscription;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ISkierRepository;
import tn.esprit.zineb_hajromdhane_4se4.repositories.ISubscriptionRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SubscriptionServiceImpl implements ISubscriptionServices{
    private ISubscriptionRepository subscriptionRepository;
    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSubscription) {
        return subscriptionRepository.findById(numSubscription).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAll() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void deleteSubscription(Long numSubscription) {
        subscriptionRepository.deleteById(numSubscription);

    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Set<Subscription> getSubscriptionByTypeSub(TypeSubscription typeSubscription) {
        return subscriptionRepository.findByTypeSubOrderByStartDate(typeSubscription);
    }
}
