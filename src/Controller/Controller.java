package Controller;

import Model.MediaItem;
import Persistance.Mediatheque;
import View.InfoDisplayer;

import java.util.List;

public class Controller {
    private Mediatheque mediatheque;
    private InfoDisplayer infoDisplayer;

    public Mediatheque getMediatheque(){
        return this.mediatheque;
    }


    public Controller(Mediatheque mediatheque, InfoDisplayer infoDisplayer) {
        this.mediatheque = mediatheque;
    }

    public void addItemToDatabase(MediaItem item){
        this.mediatheque.addItem(item);
    }

    public void removeItemFromDatabase(MediaItem item){
        this.mediatheque.removeItem(item);
    }

    public void editItem(MediaItem item, String title){
        this.mediatheque.editMetaData(item, title);
    }

    public void editItem(MediaItem item, int length){
        this.mediatheque.editMetaData(item, length);
    }

    public void printAllItems(List<MediaItem> mediaItems){
        infoDisplayer.printListOfItems(mediaItems);
    }
}
