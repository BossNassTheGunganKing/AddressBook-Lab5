package codelook.example.introductiontojpa.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AddressBookRepo extends CrudRepository<AddressBook, Integer> {

}
