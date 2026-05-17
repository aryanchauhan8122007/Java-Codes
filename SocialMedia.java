class SocialMedia {
    void post() {
        System.out.println("Posting on social media...");
    }
}

class Instagram extends SocialMedia {
    @Override
    void post() {
        System.out.println("Posting a photo on Instagram 📸");
    }
}

class Twitter extends SocialMedia {
    @Override
    void post() {
        System.out.println("Posting a tweet on Twitter 🐦");
    }
}

class YouTube extends SocialMedia {
    @Override
    void post() {
        System.out.println("Uploading a video on YouTube 🎥");
    }
}

public class Code8_SocialMedia {
    public static void main(String[] args) {

        SocialMedia s1 = new Instagram();
        SocialMedia s2 = new Twitter();
        SocialMedia s3 = new YouTube();

        s1.post();
        s2.post();
        s3.post();
    }
}
