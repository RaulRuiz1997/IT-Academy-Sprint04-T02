package org.example.exercici1;

public class AgentDeBorsa {

    private String name;
    private AgenciaDeBorsa agenciaDeBorsa = new AgenciaDeBorsa();

    public AgentDeBorsa(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Hey " + name + ", la borsa puja / baixa");
    }

}
