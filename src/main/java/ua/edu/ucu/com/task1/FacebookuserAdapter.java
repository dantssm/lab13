package ua.edu.ucu.com.task1;

public class FacebookuserAdapter implements User {

    private FacebookUser facebookUser;

    public FacebookuserAdapter(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getMail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public String getActiveTime() {
        return facebookUser.getUserActiveTime();
    }

    @Override
    public String toString() {
        return "Email: " + getMail() + ", " + "Country: " + getCountry();
    }
    
}
