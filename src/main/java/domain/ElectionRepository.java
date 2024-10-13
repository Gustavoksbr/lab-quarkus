package domain;

import domain.Election;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ElectionRepository implements PanacheRepository<Election> {
}
