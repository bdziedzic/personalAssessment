import Controller.Controller;
import Model.MediaItem;
import Model.Music;
import Persistance.Mediatheque;
import View.InfoDisplayer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        InfoDisplayer display = new InfoDisplayer();
        Mediatheque mediatheque = new Mediatheque();
        Controller controller = new Controller(mediatheque, display);
        controller.addItemToDatabase(new Music("title", "author", 240));

    }
}
