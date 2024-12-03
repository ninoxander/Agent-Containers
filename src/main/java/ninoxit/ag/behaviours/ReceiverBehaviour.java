package ninoxit.ag.behaviours;

import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;

public class ReceiverBehaviour extends OneShotBehaviour {
    @Override
    public void action() {
        MessageTemplate template = MessageTemplate.and(
                MessageTemplate.MatchPerformative(ACLMessage.INFORM),
                MessageTemplate.MatchLanguage("English")
        );

        ACLMessage message = myAgent.blockingReceive(template);
        if(message != null) {
            System.out.println(message.getSender().getName() + " says -> " + message.getContent());
        } else {
            System.out.println("No message received.");
        }
    }
}
