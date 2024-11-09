package codelook.example.introductiontojpa.jpa;

import jakarta.persistence.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AddressBookTest {
    private BuddyInfo buddy1,buddy2;
    private AddressBook addressBook;

    @Before
    public void setUp() throws Exception {
        buddy1  = new BuddyInfo("Pablo", "(416)-444 4444");
        buddy2  = new BuddyInfo("Picasso", "(416)-444 4443");
        addressBook = new AddressBook();
    }

    @Test
    public void addBuddy() {
        addressBook.addBuddy(buddy1);
        assertNotEquals(addressBook.getBuddies(), null);
        addressBook.addBuddy(buddy2);
        assertNotEquals(addressBook.getBuddies(), null);
    }

    @Test
    public void removeBuddy() {
        addressBook.addBuddy(buddy1);
        assertNotEquals(addressBook.getBuddies(), null);
        addressBook.removeBuddy(buddy1);
        assertTrue(addressBook.getBuddies().isEmpty());
    }

    @Test
    public void getBuddies() {
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        assertTrue(addressBook.getBuddies().equals(Arrays.asList(buddy1,buddy2)));
        addressBook.removeBuddy(buddy1);
        assertTrue(addressBook.getBuddies().equals(Arrays.asList(buddy2)));
    }

    @Test
    public void toStringTest() {
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);
        assertEquals(addressBook.toString(),"BuddyInfo [id=null, name=Pablo, phoneNumber=(416)-444 4444]\nBuddyInfo [id=null, name=Picasso, phoneNumber=(416)-444 4443]\n");
    }

}