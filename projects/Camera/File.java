package projects.Camera;

public class File {
    private float size;
    private String extension;
    private String name;
    private int ID;

    public File(float size, String extension, String name, int ID) {
        this.size = size;
        this.extension = extension;
        this.name = name;
        this.ID = ID;
    }

    public float getSize() {
        return size;
    }

}
