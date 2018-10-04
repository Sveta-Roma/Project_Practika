package org.itstep.qa.zadania;

public class Rabbit {
    /*Создать класс, моделирующий поведение зайца. Зайца характеризуют:
        1. Координаты, где заяц появился в этом бренном мире
        2. Текущие его координаты - х, у
        3. Изменение его координат dx, dy за один прыжок
        4. Количество прыжков, которое он делает, если его напугать

        1.Создать необходимые конструкторы, методы для работы с полями, если они нужны
        2.Создать метод, результатом котором является "прыжок" зайца - текущие координаты зайца изменяются
        согласно условиям прыжка предопределенных в характеристиках зайца
        3.Создать метод "пугающий" зайца, в результате его также изменяется текущее положение зайца
        в пространстве (х, у) согласно "характеристикам" зайца.
        4. Создать метод, возвращающий зайца домой - место его появления
        5. Создать метод, телепортирующий зайца в новое место, при этом считается, что заяц в этом случае
        в новом месте создается наново
     */
    private int a;
    private int b;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int n;

    public Rabbit(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rabbit(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    public Rabbit(int x, int y, int dx, int dy, int n) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.n = n;
    }


    public void getJumpRabbit() {
        this.x = x + dx;
        this.y = y + dy;
    }

    public void scaringRabbit() {
        this.x = x + (n*dx);
        this.y = y + (n*dy);
    }

    public void goBackHomeRabbit() {
        this.x = a;
        this.y = b;
    }

    public void newPlaceRabbit(int a1, int b1) {
        this.a = a1;
        this.b = b1;
    }
}
