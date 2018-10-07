package org.itstep.qa.lesson_one.runner;

import org.itstep.qa.lesson_one.zadanie.Square;

public class RunnerSquare {
    public static void main(String[] args) {
        Square squareOne = new Square(2);
        Square squareTwo = new Square();

        System.out.println(squareOne.getAreaSquare());
        squareOne.getIncreaseAreaSquare(9);
        System.out.println(squareOne.getAreaSquare());
    }
}
