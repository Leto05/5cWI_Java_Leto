package projects.Camera;

public class Main {
    public static void main(String[] args) {
        SDCard SD1 = new SDCard(200, 0);
        Camera c1 = new Camera(1200, 20, SD1);

        c1.takePicture();
        c1.printAllImages();
        System.out.println("Test");
    }
}
