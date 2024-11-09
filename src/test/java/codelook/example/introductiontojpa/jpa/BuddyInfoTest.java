package codelook.example.introductiontojpa.jpa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuddyInfoTest {
    private BuddyInfo buddy1,buddy2;

    @Before
    public void setUp() throws Exception {
        buddy1  = new BuddyInfo("Pablo", "(416)-444 4444");
        buddy2  = new BuddyInfo("Picasso", "(416)-444 4443");
    }

    @Test
    public void getName() {
        assertEquals(buddy1.getName(),"Pablo");
        assertEquals(buddy2.getName(),"Picasso");
    }

    @Test
    public void getPhoneNumber() {
        assertEquals(buddy1.getPhoneNumber(),"(416)-444 4444");
        assertEquals(buddy2.getPhoneNumber(),"(416)-444 4443");
    }

    @Test
    public void toStringTest() {
        assertEquals(buddy1.toString(),"BuddyInfo [id=null, name=Pablo, phoneNumber=(416)-444 4444]");
        assertEquals(buddy2.toString(),"BuddyInfo [id=null, name=Picasso, phoneNumber=(416)-444 4443]");
    }

}