package ninoxit.ag.agents;

import jade.core.Agent;
import ninoxit.ag.behaviours.HelloBehaviour;

public class HelloAgent extends Agent {
    @Override
    public void setup() {
        System.out.println("Running Hello Agent!");
        addBehaviour(new HelloBehaviour(5));
    }
}
