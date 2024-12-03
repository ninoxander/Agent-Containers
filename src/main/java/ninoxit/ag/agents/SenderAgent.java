package ninoxit.ag.agents;

import jade.core.Agent;
import ninoxit.ag.behaviours.SenderBehaviour;

public class SenderAgent extends Agent {
    @Override
    public void setup() {
        addBehaviour(new SenderBehaviour());
    }
}
