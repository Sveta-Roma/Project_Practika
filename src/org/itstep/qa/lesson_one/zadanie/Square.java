package org.itstep.qa.lesson_one.zadanie;

public class Square {
    /*Создать класс, описывающий квадрат, который характеризуется стороной L.
      Создать конструкторы:
        1. Для создания экземпляра квадрата с заполненной стороной
        2. Для создания вырожденного квадрата с нулевой длинной стороны
      Создать методы для для работы с полями класса:
        1. Создать метод, который вычисляет площадь квадрата
        2. Создать метод, увеличивающий площадь квадрата в N раз (принимается на вход множитель, метод должен каким-либо
         образом влиять на поля)
    */
    private double l;

    public Square(double l) {
        this.l = l;
    }

    public Square() {
        this.l = 0;
    }

    public double getAreaSquare (){
        double s = l*l;
        return s;
    }

    public void getIncreaseAreaSquare (int n){
        this.l = l*Math.sqrt(n);
    }
}
