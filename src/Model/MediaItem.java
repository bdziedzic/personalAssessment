package Model;

public abstract class MediaItem {
    private String title;
    private String author;
    private boolean isAvailable;

    public int getLength() {
        return length;
    }

    private int length;


    public MediaItem(String title, String author, int length) {
        this.title = title;
        this.author = author;
        this.length = length;
        this.isAvailable = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
