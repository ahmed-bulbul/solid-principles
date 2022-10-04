package javatechie.lsp;

public class WhatsApp extends SocialMedia {

    @Override
    public void chatWithFriend() {
        System.out.println("chat with friend");
    }

    @Override
    public void publishPost(Object post) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("send photos and videos");
    }

    @Override
    public void groupVideoCall() {
        System.out.println("group video call");
    }
}
