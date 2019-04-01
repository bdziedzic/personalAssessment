package Model;

public class Music extends MediaItem implements Listenable  {

    public Music(String title, String author, int length) {
        super(title, author, length);
    }

    @Override
    public void listen() {

    }
}
