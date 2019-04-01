package Model;

import Controller.Controller;

import java.util.List;

abstract class AbstractUser {
    private final Controller controller;
    private List<MediaItem> mediaItems;

    public AbstractUser(List<MediaItem> mediaItems, Controller controller) {
        this.mediaItems = mediaItems;
        this.controller = controller;
    }


    public Controller getController() {
        return controller;
    }
}
