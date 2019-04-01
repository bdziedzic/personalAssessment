package Persistance;

import Model.Books;
import Model.MediaItem;


import java.util.ArrayList;
import java.util.List;

public class Mediatheque {
    private List<MediaItem> mediaItems;

    public Mediatheque() {
        this.mediaItems = new ArrayList<>();
    }

    public void addItem(MediaItem item){
        if(item!=null){
            mediaItems.add(item);
        }

    }

    public void removeItem(MediaItem item){
        if(item!=null) {
            mediaItems.remove(item);
        }
    }

    public List<MediaItem> getMediaItems() {
        return mediaItems;
    }

    public void editMetaData(MediaItem item, String title){
        if(title.length()!=0 && mediaItems.contains(item)){
            item.setTitle(title);
        }
    }

    public void editMetaData(MediaItem item, int length){
        if(length>0 && mediaItems.contains(item)){
            item.setLength(length);
        }
    }
}
