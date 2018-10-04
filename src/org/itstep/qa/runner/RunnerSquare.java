package org.itstep.qa.runner;

import org.itstep.qa.zadania.Square;

public class RunnerSquare {
    public static void main(String[] args) {
        Square squareOne = new Square(2);
        Square squareTwo = new Square();

        System.out.println(squareOne.getAreaSquare());
        squareOne.getIncreaseAreaSquare(9);
        System.out.println(squareOne.getAreaSquare());
    }
}
