package javatechie.lsp;

public class Facebook extends SocialMedia {

    @Override
    public void chatWithFriend() {
        System.out.println("chat with friend");
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
        System.out.println("group video call");
    }
}

