import org.junit.jupiter.api.Test;

import ua.edu.ucu.com.task1.Twitteruser;
import ua.edu.ucu.com.task1.TwittwerUserAdapter;

import static org.junit.jupiter.api.Assertions.*;

class TwittwerUserAdapterTest {

    @Test
    void testAdapterMethods() {
        Twitteruser twUser = new Twitteruser("twitter@mail.com", "Ukraine", "2024-12-13T10:00:00");
        TwittwerUserAdapter adapter = new TwittwerUserAdapter(twUser);

        assertEquals("twitter@mail.com", adapter.getMail());
        assertEquals("Ukraine", adapter.getCountry());
        assertEquals("2024-12-13T10:00:00", adapter.getActiveTime());
    }

    @Test
    void testToString() {
        Twitteruser twUser = new Twitteruser("twitter@mail.com", "Ukraine", "2024-12-13T10:00:00");
        TwittwerUserAdapter adapter = new TwittwerUserAdapter(twUser);

        assertEquals("Twitteruser(userMail=twitter@mail.com, country=Ukraine, lastActiveTime=2024-12-13T10:00:00)", adapter.toString());
    }
}
