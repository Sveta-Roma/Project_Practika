package org.itstep.qa.lesson_two.zadanie;

import java.util.Random;

public class Mouse {
    /*Игровое поле ограничено размерами 100х100 (координаты по х и у от 0 до 99)
      На игровом поле будет бегать мышь. Мышь характеризуют:
       1. Начальные координаты.
       2. Текущие координаты
       3. Имя мыши
       4. Цвет мыши (в момент появления все мыши появляются белого цвета)
     Мышь умеет "бежать": изменяются ее текущие координаты на +1. Но на игровом поле дует ветер и мышь может
     дополнительно за каждый шаг убегать вперед на приращение ветра (случайное значение от 0 до 2). Ветер влияет
     на приращение как по х, так и по у.

     Мышь умеет "рыть тоннели": тогда ее координаты меняются сразу на +5, ветер в тоннелях мыши не мешает.

     Также на игровом поле имеется куст (несколько кустов). Каждый куст характеризуют координаты, в которых
     он находится и цвет (случайный).
     Процесс "игры". На игровом поле в случайных местах появляются 18 кустов. Также в случайных местах появлются ДВЕ мыши.
     Мыши начинают бежать, на каждой итерации цикла каждая мышь выполняет одну команду "бежать". Если мышь добегает
     до границы игрового поля, она разворачивается в противоположную сторону от той границы, куда она добежала и
     продолжает бежать вперед. Игра продолжается до тех пор, пока какая-нибудь мышь не найдет куст. В этом случае
     мыши мыши останавливаются, мышь, которая нашла куст становиться такого цвета, какого был куст. При этом в
     командную строку выводится запись вида "Победила мышь Апокалиптина, она нашла куст в координатах ХХ:УУ и
     перекрасилась в цвет Баклажановый""
    */
    private final int FORCE_WIND = 2;

    private int a;
    private int b;
    private int x;
    private int y;
    private String name;
    private String color;

    private int dXRun;
    private int dYRun;

    private int dXDig;
    private int dYDig;

    private int sizeField;

    public Mouse(int a, int b, String name, int sizeField) {
        this.a = a;
        this.b = b;
        this.x = a;
        this.y = b;
        this.name = name;
        this.color = "Белая";
        dXRun = 1;
        dYRun = 1;
        dXDig = 5;
        dYDig = 5;
        this.sizeField = sizeField;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mouseToRun (){
        Random random = new Random();
        int windX = random.nextInt(FORCE_WIND);
        int windY = random.nextInt(FORCE_WIND);
        dXRun = controlMouse(x, dXRun, windX*dXRun);
        dYRun = controlMouse(y, dYRun, windY*dYRun);
        x  = x + dXRun + windX*dXRun;
        y  = y + dYRun + windY*dYRun;
    }

    public void toDigTunnelMouse(){
        dXDig = controlMouse(x, dXDig, 0);
        dYDig = controlMouse(y, dYDig, 0);
        x = x + dXDig;
        y = y + dYDig;
    }

    private int controlMouse (int current, int d, int wind){ // параметры: текущая координата и приращение,
                                            // нужен этот метод для того чтобы проверить не выбежила ли мышь за пределы
        Random random = new Random();
        int temp = current + d + wind;
        if (temp >= sizeField || temp < 0){
                d = -d;
            }
        return d;
    }
}
