package TournamentOrganizer.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id; //will this be how items are retrieved from the database?

    public int getId() {
        return id;
    }
}
