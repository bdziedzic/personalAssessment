package Model;


import Controller.Controller;

import java.util.List;

public class User extends AbstractUser {
    private List<MediaItem> rentedItems;

    public User(List<MediaItem> mediaItems, Controller controller) {
        super(mediaItems, controller);
    }

    void rent(MediaItem item){};

    void returnItem(MediaItem item){};

    MediaItem searchItem(String title){
        return null;
    }

    void checkIfAvailable(){};

    void reserveAnItem(MediaItem item){};

    void preview(){};

}
