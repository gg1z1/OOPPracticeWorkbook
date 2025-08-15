package com.stepup.mains;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainReflectionApiCheck {

    public static void main(String[] args) {

        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));

        Class<?> dogClass = cat.getClass();

        Field[] fields = dogClass.getDeclaredFields();

        for (Field field : fields) {
            try {
                // Делаем поле доступным
                field.setAccessible(true);

                // Получаем значение до изменения
                Object valueBefore;
                valueBefore = field.get(cat);

                // Проверяем тип поля

                    // Сохраняем текущее значение
                    System.out.println(
                            String.format(
                                    """
                                    Проверка поля %s!
                                    Класс: %s
                                    Тип поля: %s
                                    Значение до: %s""",
                                    field.getName(),
                                    field.getDeclaringClass().getSimpleName(),
                                    field.getType(),
                                    valueBefore
                            )
                    );

                    // Присваиваем null
                    if (!field.getType().isPrimitive()) field.set(cat, null);
                    // Получаем значение после изменения
                    Object valueAfter = field.get(cat);

                    System.out.printf(
                            """
                                    Значение после: %s
                                    %n""",
                            valueAfter
                    );

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Cat {
        private static String breed = "Persian"; // порода
        public String name;
        private int age;
        private List<String> friendsName = new ArrayList<>();

        public Cat(String name, int age, List<String> friendsName) {
            this.name = name;
            this.age = age;
            this.friendsName = friendsName;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", friendsName=" + friendsName +
                    '}';
        }
    }
}
