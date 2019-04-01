package Model;

public class Movies extends MediaItem implements Watchable {


    public Movies(String title, String author, int length) {
        super(title, author, length);
    }

    @Override
    public void watch() {
        System.out.println("watch!");
    }
}
