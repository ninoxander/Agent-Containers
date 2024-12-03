package ninoxit.ag.behaviours;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import ninoxit.ag.AgentList;

public class SenderBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM);
        message.addReceiver(myAgent.getAID(AgentList.AGENTRECEIVER));
        message.setContent("Hello from " + myAgent.getLocalName());
        message.setLanguage("English");

        myAgent.send(message);
    }
}
