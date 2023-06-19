package com.example.tuaev.calculyator_kkal.counting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DialMan {

    private int age;
    private int weight;
    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public DialMan() {
    }

    public DialMan(int age, int weight, int height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public List<Integer> dialMan(int age, int weight, int height){

        double fixed = 6.25;
        List<Integer> resultRatio = new ArrayList();
        double[] ratio = {1.2, 1.375, 1.55, 1.725, 1.9};

        double resultDouble = (10 * weight) + (fixed * height) - (5 * age) + 5;
        int resultInt = (int)resultDouble;
        int initial = resultInt;

        for (int countOne = 0; countOne < ratio.length; countOne++){
            resultInt *= ratio[countOne];
            resultInt *= 0.9;
            resultRatio.add(resultInt);
            resultInt = initial;
        }

        return resultRatio;
    }
}
