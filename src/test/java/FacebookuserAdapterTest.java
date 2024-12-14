import org.junit.jupiter.api.Test;

import ua.edu.ucu.com.task1.FacebookUser;
import ua.edu.ucu.com.task1.FacebookuserAdapter;

import static org.junit.jupiter.api.Assertions.*;

class FacebookuserAdapterTest {

    @Test
    void testAdapterMethods() {
        FacebookUser fbUser = new FacebookUser("test@mail.com", "USA", "2024-12-14T10:00:00");
        FacebookuserAdapter adapter = new FacebookuserAdapter(fbUser);

        assertEquals("test@mail.com", adapter.getMail());
        assertEquals("USA", adapter.getCountry());
        assertEquals("2024-12-14T10:00:00", adapter.getActiveTime());
    }

    @Test
    void testToString() {
        FacebookUser fbUser = new FacebookUser("test@mail.com", "USA", "2024-12-14T10:00:00");
        FacebookuserAdapter adapter = new FacebookuserAdapter(fbUser);

        assertEquals("Email: test@mail.com, Country: USA", adapter.toString());
    }
}

