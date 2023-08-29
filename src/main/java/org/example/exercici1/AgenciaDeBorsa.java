package org.example.exercici1;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeBorsa {

    private List<AgentDeBorsa> agentsDeBorsa = new ArrayList<>();

    public void afegirAgent(AgentDeBorsa agent) {
        agentsDeBorsa.add(agent);
    }

    public void notifyAgent() {
        for (AgentDeBorsa agentDeBorsa : agentsDeBorsa) {
            agentDeBorsa.update();
        }
    }

}
