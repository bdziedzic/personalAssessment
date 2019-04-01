package Test;

import Controller.Controller;
import Model.Books;
import Model.MediaItem;
import Persistance.Mediatheque;
import View.InfoDisplayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class testManager {
    Mediatheque mediatheque = new Mediatheque();
    InfoDisplayer infoDisplayer = new InfoDisplayer();
    Controller controller = new Controller(mediatheque, infoDisplayer);



    @Test
    public final void addItemTest(){
        int length = mediatheque.getMediaItems().size();
        MediaItem mediaItem = new Books("W pustyni i w puszczy", "Henryk Sienkiewicz", 598);
        controller.addItemToDatabase(mediaItem);
        Assert.assertEquals(length+1, controller.getMediatheque().getMediaItems().size());

    }


    @Test
    public  final void checkIfItsSameItemAdded(){
        int length = mediatheque.getMediaItems().size();
        MediaItem mediaItem = new Books("W pustyni i w puszczy", "Henryk Sienkiewicz", 598);
        controller.addItemToDatabase(mediaItem);
        Assert.assertEquals(mediatheque.getMediaItems().get(length), mediaItem);
    }

    @Test
    public final void editItemTitle(){
        MediaItem mediaItem = new Books("W pustyni i w puszczy", "Henryk Sienkiewicz", 598);
        controller.addItemToDatabase(mediaItem);
        controller.editItem(mediaItem, "QuoVadis");
        Assert.assertEquals(mediaItem.getTitle(), "QuoVadis");
    }

    @Test
    public final void editItemLength(){
        MediaItem mediaItem = new Books("W pustyni i w puszczy", "Henryk Sienkiewicz", 598);
        controller.addItemToDatabase(mediaItem);
        controller.editItem(mediaItem, 300);
        Assert.assertEquals(mediaItem.getLength(), 300);
    }

    @Test
    public final void removingItem(){
        MediaItem mediaItem = new Books("W pustyni i w puszczy", "Henryk Sienkiewicz", 598);
        controller.addItemToDatabase(mediaItem);
        controller.removeItemFromDatabase(mediaItem);
        Assert.assertFalse(mediatheque.getMediaItems().contains(mediaItem));
    }
}
