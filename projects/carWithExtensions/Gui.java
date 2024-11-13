package projects.carWithExtensions;

import projects.carWithExtensions.exceptions.CarException;
import projects.carWithExtensions.exceptions.EngineException;

public class Gui {
    public static void main(String[] args) {
        Engine e1 = new Engine();
        Car c1 = new Car("green", e1);

        try {
            c1.startEngine();
        } catch (NullPointerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (CarException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
