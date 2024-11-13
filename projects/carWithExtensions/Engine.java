package projects.carWithExtensions;

import projects.carWithExtensions.exceptions.EngineException;

public class Engine {
    public void start() throws EngineException {
        System.out.println("engine started");
        boolean hasError = true;

        if (hasError) {
            throw new EngineException("engine Error");
        }
    }
}
