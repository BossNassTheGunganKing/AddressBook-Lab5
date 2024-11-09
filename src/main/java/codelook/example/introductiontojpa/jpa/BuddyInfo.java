package codelook.example.introductiontojpa.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id = null;
    private String name = null;
    private String phoneNumber = null;

    /**
     * Constructor of a buddy
     * @param name the name of the buddy
     * @param phoneNumber the phone number of the buddy
     */
    public BuddyInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Default buddy Constructor
     */
    public BuddyInfo() {}

    /**
     * Returns the name of the buddy
     * @return the buddy's name
     */
    public String getName() {
        return name;
    }

    /**
     *  Returns the phone number of the buddy
     * @return the buddy's phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Returns the buddy's information formated as a string
     * @return the buddy's name and number in a string
     */
    public String toString(){
        return "BuddyInfo [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    /**
     * Returns the id of the Buddy as an Integer
     * @return Integer, returns the id of the Buddy
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id of the Buddy
     * @param id Integer, the Buddy's new id
     */
    public void setId(Long id) {

        this.id = id;
    }

    /**
     * Sets the name of the Buddy
     * @param name String, the Buddy's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the phoneNumber of the Buddy
     * @param phoneNumber String, the Buddy's new phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
