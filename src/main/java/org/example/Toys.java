package org.example;


public class Toys{
    private int id_toy;
    private string name_toy;

    private int count_toy;
    private int chance;

    public Toys(int id_toy, string name_toy, int count_toy, int chance) {
        this.id_toy = id_toy;
        this.name_toy = name_toy;
        this.count_toy = count_toy;
        this.chance = chance;
    }

    public int getId_toy() {
        return id_toy;
    }

    public void setId_toy(int id_toy) {
        this.id_toy = id_toy;
    }

    public string getName_toy() {
        return name_toy;
    }

    public void setName_toy(string name_toy) {
        this.name_toy = name_toy;
    }

    public int getCount_toy() {
        return count_toy;
    }

    public void setCount_toy(int count_toy) {
        this.count_toy = count_toy;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Toys{" +
                "id_toy=" + id_toy +
                ", name_toy=" + name_toy +
                ", count_toy=" + count_toy +
                ", chance=" + chance +
                '}';
    }
}