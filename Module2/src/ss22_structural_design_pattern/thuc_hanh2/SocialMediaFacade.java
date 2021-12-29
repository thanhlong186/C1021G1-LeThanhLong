package ss22_structural_design_pattern.thuc_hanh2;

public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private Linkedln linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, Linkedln linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }
    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.facebook.share();
    }
}
