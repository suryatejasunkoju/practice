package com.practise.surya_practise.LLD.design_patterns.structural.adapter.adaptee;

public class WeightMachineImpl implements WeightMachine
{
    @Override
    public double getWeightInPounds() {
        double weightInPounds = 220.0;
        System.out.println("In WeightMachineImpl, Weight in pounds: " + weightInPounds);
        return weightInPounds;
    }
}
