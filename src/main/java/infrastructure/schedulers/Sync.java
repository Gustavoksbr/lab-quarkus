package infrastructure.schedulers;

import domain.ElectionRepository;



import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@jakarta.enterprise.context.ApplicationScoped
public class Sync {

    private final ElectionRepository repository;

    public Sync(ElectionRepository repository) {
        this.repository = repository;
    }

    @Scheduled(cron = "*/10 * * * * ?")
    void syncWorker() {
    }
}


