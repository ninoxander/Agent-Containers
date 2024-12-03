package ninoxit.ag;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.instance();

        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.MAIN_HOST, "localhost");
        profile.setParameter(Profile.GUI, "true");

        ContainerController mainContainer = runtime.createMainContainer(profile);

        try {
            AgentController helloAgent = mainContainer.createNewAgent(
                    AgentList.AGENTHELLO,
                    "ninoxit.ag.agents.HelloAgent",
                    null
            );
            AgentController senderAgent = mainContainer.createNewAgent(
                    AgentList.AGENTSENDER,
                    "ninoxit.ag.agents.SenderAgent",
                    null
            );
            AgentController receiverAgent = mainContainer.createNewAgent(
                AgentList.AGENTRECEIVER,
                "ninoxit.ag.agents.ReceiverAgent",
                null
            );

            helloAgent.start();
            senderAgent.start();
            receiverAgent.start();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
