package projects.Camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private float maxCapacity;
    private float usedCapacity;
    private List<File> FileList;

    public SDCard(float maxCapacity, float usedCapacity) {
        this.usedCapacity = usedCapacity;
        this.maxCapacity = maxCapacity;
        this.FileList = new ArrayList<>();

    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public float getUsedCapacity() {
        return usedCapacity;
    }

    public void saveFile(File file) {
        FileList.add(file);
    }

}
