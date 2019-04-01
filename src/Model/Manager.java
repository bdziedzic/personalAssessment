package Model;

import Controller.Controller;
import Persistance.Mediatheque;

import java.util.List;

public class Manager extends AbstractUser{

    public Manager(List<MediaItem> mediaItems, Controller controller) {
        super(mediaItems, controller);
    }

    private void addNewItem(MediaItem item){
        super.getController().addItemToDatabase(item);
    }

    public void removeAnItem(MediaItem item){
        super.getController().removeItemFromDatabase(item);
    }

    public void editItemData(MediaItem item, String title){
        super.getController().editItem(item, title);
    }

    public void editItemData(MediaItem item, int length){
        super.getController().editItem(item, length);
    }
}
