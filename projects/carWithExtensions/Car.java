package projects.carWithExtensions;

import java.util.Random;

import projects.carWithExtensions.exceptions.CarException;
import projects.carWithExtensions.exceptions.EngineException;

public class Car {
    private String colour;
    private Engine engine;

    public Car(String colour, Engine engine) {
        this.engine = engine;
        this.colour = colour;
    }

    public void startEngine() throws CarException, NullPointerException {

        Random r = new Random();
        if (r.nextBoolean()) {
            throw new CarException("Car has a problem");
        }
        if (r.nextBoolean()) {
            throw new NullPointerException();
        }

        try {
            engine.start();
        } catch (EngineException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public Engine getEngine() {
        return engine;
    }
}
