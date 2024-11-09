package codelook.example.introductiontojpa.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BuddyInfoRepo extends CrudRepository<BuddyInfo, Integer> {
    List<BuddyInfo> findByName(String name);

    BuddyInfo findById(Long id);
}
