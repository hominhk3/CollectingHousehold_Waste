/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import common.Algorithms;
import common.Library;
import view.View;

/**
 *
 * @author ACER
 */
public class CollectWaste extends View<String> {

    protected Library library;
    protected Algorithms algorithm;

    public CollectWaste() {
        super("=====Collecting Household Waste=====");
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute() {
        String input = library.getString("Input weight gabage(kg) each station: ");
        int result[] = algorithm.computeTotalGarbage(input);
        double[] timeNTimes = algorithm.computeTimesGoToDump(result);
        System.out.println("Cost: " + algorithm.computeCostSpend(timeNTimes));
    }
}
