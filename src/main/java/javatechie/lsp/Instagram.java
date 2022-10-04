package javatechie.lsp;

public class Instagram extends SocialMedia {

    @Override
    public void chatWithFriend() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void publishPost(Object post) {
        System.out.println("publish post");
    }

    @Override
    public void sendPhotosAndVideos() {
        System.out.println("send photos and videos");
    }

    @Override
    public void groupVideoCall() {
        throw new UnsupportedOperationException();
    }
}
