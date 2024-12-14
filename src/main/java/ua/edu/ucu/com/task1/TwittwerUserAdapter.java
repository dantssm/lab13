package ua.edu.ucu.com.task1;

public class TwittwerUserAdapter implements User {
    private Twitteruser twitteruser;

    public TwittwerUserAdapter(Twitteruser twitteruser){
        this.twitteruser = twitteruser;
    }

    @Override
    public String getMail() {
        return twitteruser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitteruser.getCountry();
    }

    @Override
    public String getActiveTime() {
        return twitteruser.getLastActiveTime();
    }

    @Override
    public String toString() {
        return twitteruser.toString();
    }
}
