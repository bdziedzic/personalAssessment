package Model;

public class Books extends MediaItem implements Readable{


    public Books(String title, String author, int length) {
        super(title, author, length);
    }

    @Override
    public void read() {
        System.out.println("Read!");
    }

}
