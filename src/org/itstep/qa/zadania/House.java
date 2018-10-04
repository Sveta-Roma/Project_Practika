package org.itstep.qa.zadania;

public class House {
    /*Создать класс описывающий дом. Дом характеризуется расположением (широта и долгота) и названием (шалаш, котэдж и т.д.)
        1. Создать конструктор, который инициализует при создании все необходимые поля
        2. Создать методы для работы с полями
        3. Создать метод, который перемещает дом в другую географическую точку
        4. Создать метод, выводщий сводную информацию о доме в консоль - назавние и его географические координаты
      Создать управляющий класс Runner, в нем создать три разных дома. Вывести сводную информацию о них. Переместить
      дома в новое место и вывести обновленные данные
    */
    private double latitude;
    private  double longitude;
    private String name;

    public House(double latitude, double longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }


    public void getInfoHouse(){
        System.out.println("Имя дома: " + name + ", Широта: " + latitude + ", Долгота: " + longitude);
    }

    public void getMove(int dx, int dy){
        this.latitude = latitude + dx;
        this.longitude = longitude + dy;
    }
}
