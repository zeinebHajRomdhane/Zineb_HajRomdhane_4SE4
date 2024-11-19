package tn.esprit.zineb_hajromdhane_4se4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.zineb_hajromdhane_4se4.entities.Subscription;
import tn.esprit.zineb_hajromdhane_4se4.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface ISubscriptionRepository extends CrudRepository<Subscription,Long> {
    Set<Subscription> findByTypeSubOrderByStartDate(TypeSubscription typeSubscription);

}
