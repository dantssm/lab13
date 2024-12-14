package ua.edu.ucu.com.task1;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AuthMethod authMethod = AuthMethod.FACEBOOK;

        User user = null;

        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser(
                    "facebook_email", 
                    "Ukraine", 
                    LocalDateTime.now().toString());
                user = new FacebookuserAdapter(facebookUser);
                break;
            
            case TWITTER:
                Twitteruser twitteruser = new Twitteruser(
                    "twiiter_email",
                    "USA",
                    LocalDateTime.now().minusDays(1).toString());
                user = new TwittwerUserAdapter(twitteruser);
        
            default:
                break;
        }

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "Hello!");
    }
}