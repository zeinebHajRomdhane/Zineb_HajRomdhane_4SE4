package tn.esprit.zineb_hajromdhane_4se4.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.zineb_hajromdhane_4se4.entities.Skier;
import tn.esprit.zineb_hajromdhane_4se4.entities.TypeSubscription;

import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long> {
    List<Skier> findBySubscriptionTypeSub(TypeSubscription typeSubscription);
}
