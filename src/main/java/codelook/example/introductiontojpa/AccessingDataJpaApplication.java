package codelook.example.introductiontojpa;

import codelook.example.introductiontojpa.jpa.AddressBook;
import codelook.example.introductiontojpa.jpa.AddressBookRepo;
import codelook.example.introductiontojpa.jpa.BuddyInfo;
import codelook.example.introductiontojpa.jpa.BuddyInfoRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJpaApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingDataJpaApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(BuddyInfoRepo repository, AddressBookRepo addressBookRepo) {
//        return (args) -> {
//            // save a few Buddies
//            BuddyInfo buddyInfo1 = new BuddyInfo("Jack", "4167777777");
//            BuddyInfo buddyInfo2 = new BuddyInfo("Jill", "4168888888");
//            BuddyInfo buddyInfo3 = new BuddyInfo("Hill", "4169999999");
//
//
//            AddressBook addressBook1 = new AddressBook();
//            AddressBook addressBook2 = new AddressBook();
//
//            addressBook1.addBuddy(buddyInfo1);
//            addressBook1.addBuddy(buddyInfo2);
//
//            addressBook2.addBuddy(buddyInfo3);
//
//            addressBookRepo.save(addressBook1);
//            addressBookRepo.save(addressBook2);
//
//
////            // fetch all Buddies
////            log.info("Buddies found with findAll():");
////            log.info("-------------------------------");
////            repository.findAll().forEach(buddy -> {
////                log.info(buddy.toString());
////            });
////            log.info("");
////
////            // fetch an individual Buddy by ID
////            BuddyInfo buddy = repository.findById(1L);
////            log.info("Customer found with findById(1L):");
////            log.info("--------------------------------");
////            log.info(buddy.toString());
////            log.info("");
////
////            // fetch customers by last name
////            log.info("Customer found with findByName('Jill'):");
////            log.info("--------------------------------------------");
////            repository.findByName("Jill").forEach(Jill -> {
////                log.info(Jill.toString());
////            });
////            log.info("");
////
////            // fetch all AddressBooks
////
////            log.info("AddressBooks found with findAll():");
////            log.info("-------------------------------");
////            addressBookRepo.findAll().forEach(addressBook -> {
////                log.info(addressBook.toString());
////            });
////            log.info("");
//        };
//    }

}