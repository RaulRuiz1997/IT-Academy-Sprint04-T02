package org.example;

import org.example.exercici1.AgenciaDeBorsa;
import org.example.exercici1.AgentDeBorsa;

public class Main {

    public static void main(String[] args) {

        AgenciaDeBorsa agenciaDeBorsa = new AgenciaDeBorsa();

        AgentDeBorsa agentDeBorsa1 = new AgentDeBorsa("Raul");
        AgentDeBorsa agentDeBorsa2 = new AgentDeBorsa("Pepe");
        AgentDeBorsa agentDeBorsa3 = new AgentDeBorsa("Ramon");

        agenciaDeBorsa.afegirAgent(agentDeBorsa1);
        agenciaDeBorsa.afegirAgent(agentDeBorsa2);
        agenciaDeBorsa.afegirAgent(agentDeBorsa3);

        agenciaDeBorsa.notifyAgent();

    }

}