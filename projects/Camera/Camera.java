package projects.Camera;

import java.util.Random;

public class Camera {
    private int pixel;
    private int weight;
    private SDCard Card;

    public Camera(int pixel, int weight, SDCard Card) {
        this.pixel = pixel;
        this.weight = weight;
        this.Card = Card;
    }

    public void takePicture() {
        for (int i = 0; i <= 10; i++) {
            File picture = new File(1200, "jpg", "picture", (i));
            Card.saveFile(picture);
        }
    }

    public void printAllImages() {

    }
}
