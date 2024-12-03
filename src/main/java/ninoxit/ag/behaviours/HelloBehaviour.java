package ninoxit.ag.behaviours;

import jade.core.behaviours.OneShotBehaviour;

public class HelloBehaviour extends OneShotBehaviour {
    private int times = 0;
    public HelloBehaviour(int times) {
        this.times = times;
    }
    @Override
    public void action() {
        for(int i = 0; i <= this.times; i++){
            System.out.println("Hello world!");
        }
    }
}
