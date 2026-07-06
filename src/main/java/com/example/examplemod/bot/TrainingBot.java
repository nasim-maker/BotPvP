package com.example.examplemod.bot;

public class TrainingBot {

    private String name;

    public TrainingBot() {
        this.name = "Training Bot";
        System.out.println("TrainingBot created!");
    }

    public void spawn() {
        System.out.println(name + " spawned!");
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
