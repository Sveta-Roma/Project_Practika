package org.itstep.qa.lesson_one.zadanie;

import java.util.Arrays;
import java.util.Random;

public class Drum {
    /*Создать класс, которые реализует модель барабана из Поля Чудес
     Класс хранит диапазон из 10 значений (100, 500, 750 и т.д.) которые инициализируются в момент создания экземпляра барабана
     Класс имеет два метода:
       1. Метод выводящий список всех значений "барабана"
       2. Метод, возвращающий случайно значений из диапазона значений барабана
    Создать управляющий класс Runner, который создает экземпляр барабана, три раза "крутит барабан" и выводит выпавшее значение в консоль
    */
    private int[] numbers;

    public Drum(int[] numbers) {
        this.numbers = numbers;
    }

    public void getDrumValuesList(){
        System.out.println("Содержащиеся значения: " + Arrays.toString(numbers));
    }

    public int runDrum(){
        Random random = new Random();
        return numbers[random.nextInt(numbers.length-1)];
    }
}
