package javatechie.lsp;

public abstract class SocialMedia {

    //@Support whatsapp, facebook, Instagram
    public abstract void chatWithFriend();

    //@Support facebook, Instagram
    public abstract void publishPost(Object post);

    //@Support whatsapp, facebook, Instagram
    public abstract void sendPhotosAndVideos();

    //@Support whatsapp, facebook
    public abstract void groupVideoCall();
}
