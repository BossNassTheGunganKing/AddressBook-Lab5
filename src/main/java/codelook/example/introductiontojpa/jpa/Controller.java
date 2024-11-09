package codelook.example.introductiontojpa.jpa;

import com.sun.jdi.IntegerValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired BuddyInfoRepo buddyInfoRepo;
    @Autowired AddressBookRepo addressBookRepo;

    @GetMapping("/buddyInfoes")
    public String buddyInfoes(Model model) {
        model.addAttribute("buddies", buddyInfoRepo.findAll());
        return "buddyInfoes";
    }

    @PostMapping("/buddyInfoes/createBuddy")
    public String addBuddyInfo(@RequestBody BuddyInfo buddyInfo) {
        buddyInfoRepo.save(buddyInfo);
        return "buddyInfoes";
    }

    @GetMapping("/addressBooks")
    public String addressBooks(Model model) {
        model.addAttribute("addressBooks", addressBookRepo.findAll());
        return "addressBooks";
    }

    @GetMapping("/addressBooks/{id}")
    public String addressBook(Model model, @PathVariable int id) {
        model.addAttribute("addressBook", addressBookRepo.findById(id).get());
        model.addAttribute("buddies", buddyInfoRepo.findAll());
        return "addressBook";
    }

    @GetMapping("/buddyInfoes/{id}")
    public String buddyInfo(Model model, @PathVariable int id) {
        model.addAttribute("buddy", buddyInfoRepo.findById(id).get());
        return "buddyInfo";
    }

    @PatchMapping(value = "/addressBooks/{id}/{buddyID}")
    public String addBuddy(@PathVariable int id, @PathVariable int buddyID) {
        AddressBook addressBook = addressBookRepo.findById(id).get();
        addressBook.addBuddy(buddyInfoRepo.findById(buddyID).get());
        addressBookRepo.save(addressBook);

        return "addressBooks";
    }

    @DeleteMapping(value = "/addressBooks/{id}/{buddyID}")
    public String removeBuddy(@PathVariable int id, @PathVariable int buddyID) {
        AddressBook addressBook = addressBookRepo.findById(id).get();
        addressBook.removeBuddy(buddyInfoRepo.findById(buddyID).get());
        addressBookRepo.save(addressBook);
       return "addressBooks";
    }

    @GetMapping("/createBuddy")
    public String buddyForm(Model model) {
        model.addAttribute("newBuddy", new BuddyInfo());
        return "createBuddy";
    }

    @PostMapping("/createBuddy")
    public String buddySubmit(@ModelAttribute BuddyInfo buddyInfo, Model model) {
        buddyInfoRepo.save(buddyInfo);
        model.addAttribute("buddies", buddyInfoRepo.findAll());
        return "buddyInfoes";
    }

    @GetMapping("/createAddressBook")
    public String addressBookForm(Model model) {
        model.addAttribute("newAddressBook", new AddressBook());
        return "createAddressBook";
    }

    @PostMapping("/createAddressBook")
    public String addressBookSubmit(@ModelAttribute AddressBook addressBook, Model model) {
        addressBookRepo.save(addressBook);
        model.addAttribute("addressBooks", addressBookRepo.findAll());
        return "addressBooks";
    }

    @PostMapping(value = "/addressBooks/addBuddy")
    public String addBuddyToCurrent(@ModelAttribute AddressBook addressBook, @RequestParam int AddyID,@RequestParam int BuddyID,  Model model) {
        System.out.println(AddyID);
        BuddyInfo buddyInfo = buddyInfoRepo.findById(BuddyID).get();
        AddressBook a = addressBookRepo.findById(AddyID).get();
        System.out.println(buddyInfo);
        System.out.println(a);
        a.addBuddy(buddyInfo);
        System.out.println(a);
        System.out.println("=========================");
        addressBookRepo.save(a);

        return "/addressBooks/{id}";
    }

}
