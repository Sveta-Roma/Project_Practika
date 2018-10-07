package org.itstep.qa.lesson_one.runner;

import org.itstep.qa.lesson_one.zadanie.House;

public class Runner {
    public static void main(String[] args) {
        House houseOne = new House(5.2,2.3, "Котедж");
        House houseTwo = new House(10.5,7.3, "Шалаш");
        House houseThree = new House(41.8,22.3, "Пентхаус");

        System.out.println("Текущее положение домов: ");
        houseOne.getInfoHouse();
        houseTwo.getInfoHouse();
        houseThree.getInfoHouse();

        System.out.println("Измененное положение домов: ");
        houseOne.getMove(2,3);
        houseOne.getInfoHouse();
        houseTwo.getMove(5,3);
        houseTwo.getInfoHouse();
        houseThree.getMove(7,7);
        houseThree.getInfoHouse();
    }
}
