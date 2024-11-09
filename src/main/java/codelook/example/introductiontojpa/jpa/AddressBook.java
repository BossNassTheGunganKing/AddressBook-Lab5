package codelook.example.introductiontojpa.jpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id =  null;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<BuddyInfo> buddies;



    /**
     * Constructor of an address book
     */
    public AddressBook() {
        this.buddies = new ArrayList<>();
    }

    /**
     * Adds a buddy to the address book
     * @param buddy, the buddy that will be added to the address book's list of buddies
     */
    public void addBuddy(BuddyInfo buddy){
        buddies.add(buddy);
    }

    /**
     * Removes a buddy from the address book
     * @param buddy, the buddy that will be removed from the address book's list of buddies
     */
    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    /**
     *  Returns the list of buddies
     * @return the list of buddies present in the address book
     */
    public List<BuddyInfo> getBuddies(){
        return this.buddies;
    }

    /**
     * Returns the addressbook's information formated as a string
     * @return the addressbook's contents of buddies in a string format
     */
    public String toString(){
        String temp = "AddressBook id = " + this.id + ", Contains the Buddies \n";
        for(int i =0; i < buddies.size(); i++){
            temp = temp + buddies.get(i).toString() + '\n';
        }
        return temp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

