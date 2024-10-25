package tn.esprit.zineb_hajromdhane_4se4.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    private LocalDate birthDate;
    private String city;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Subscription subscription;

    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;

    @ManyToMany(mappedBy = "skiers" , fetch = FetchType.EAGER)
    Set<Piste> pistes;
}
