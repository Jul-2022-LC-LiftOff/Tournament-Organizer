package TournamentOrganizer.data;

import TournamentOrganizer.Signup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignupRepository extends CrudRepository<Signup, Integer> {

}
