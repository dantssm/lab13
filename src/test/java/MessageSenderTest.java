import org.junit.jupiter.api.Test;

import ua.edu.ucu.com.task1.FacebookUser;
import ua.edu.ucu.com.task1.FacebookuserAdapter;
import ua.edu.ucu.com.task1.MessageSender;

class MessageSenderTest {

    @Test
    void testSendMessage() {
        FacebookUser fbUser = new FacebookUser("test@mail.com", "USA", "2024-12-14T10:00:00");
        FacebookuserAdapter adapter = new FacebookuserAdapter(fbUser);

        MessageSender sender = new MessageSender();
        sender.send(adapter, "Test message");
    }
}

