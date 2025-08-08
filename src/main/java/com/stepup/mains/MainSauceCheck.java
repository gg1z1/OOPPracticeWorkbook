package com.stepup.mains;

import com.stepup.cooking.components.HotnessLevel;
import com.stepup.cooking.components.Sauce;

public class MainSauceCheck {
    public static void main(String[] args) {
        // Создаем объекты соуса
        Sauce veryHotSauce = new Sauce("Чили", HotnessLevel.VERY_HOT);
        Sauce hotSauce = new Sauce("Чесночный", HotnessLevel.HOT);
        Sauce notHotSauce = new Sauce("Томатный", HotnessLevel.NOT_HOT);

        // Выводим информацию
        System.out.println(veryHotSauce);    // Соус Чили: очень острый
        System.out.println(hotSauce);   // Соус Чесночный: острый
        System.out.println(notHotSauce);   // Соус Томатный: не острый

        // Попытка создать соус с некорректной остротой приведет к ошибке
        // Sauce invalidSauce = new Sauce("Неправильный", "Очень острый"); // Ошибка компиляции
    }
}
