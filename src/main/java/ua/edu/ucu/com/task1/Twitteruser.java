package ua.edu.ucu.com.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Twitteruser {
    private String userMail;
    private String country;
    private String lastActiveTime;

    public String getUserMail() {
        return userMail;
    }

    public String getCountry() {
        return country;
    }

    public String getLastActiveTime() {
        return lastActiveTime;
    }
}
