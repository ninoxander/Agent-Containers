package ninoxit.ag.agents;

import jade.core.Agent;
import ninoxit.ag.behaviours.ReceiverBehaviour;
import ninoxit.ag.behaviours.SenderBehaviour;

public class ReceiverAgent extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new ReceiverBehaviour());
    }
}
