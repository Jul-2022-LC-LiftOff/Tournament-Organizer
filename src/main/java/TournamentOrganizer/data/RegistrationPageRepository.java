package TournamentOrganizer.data;

import TournamentOrganizer.Registration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface RegistrationPageRepository extends CrudRepository<Registration, Integer>{

}
