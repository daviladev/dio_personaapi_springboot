package ale.digitalinovationone.personaapi.repositories;

import ale.digitalinovationone.personaapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
