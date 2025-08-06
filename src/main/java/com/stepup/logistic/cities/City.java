package com.stepup.logistic.cities;

import java.util.*;

// Класс, представляющий город на карте
public class City {
    private String name; // Название города
    private Map<City, Integer> connections; // Связи с другими городами
    private Set<City> visited = new HashSet<>();

    // Конструктор с названием города
    public City(String name) {
        this.name = name;
        this.connections = new HashMap<>();
    }

    // Конструктор с предустановленными связями
    public City(String name, Map<City, Integer> connections) {
        this.name = name;
        this.connections = connections;
    }

    // Добавление нового пути в другой город
    public void addConnection(City destination, int cost) {
        connections.put(destination, cost);
    }

    // Метод для очистки всех связей
    public void clearConnections() {
        connections.clear();
    }

    // Метод для установки новых связей
    public void setConnections(Map<City, Integer> newConnections) {
        this.connections = newConnections;
    }

    // Получение текстового представления города и его связей
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Город: ").append(name).append("\n");
        result.append("Доступные пути:\n");

        for (Map.Entry<City, Integer> entry : connections.entrySet()) {
            result.append("- ")
                    .append(entry.getKey().name)
                    .append(" (стоимость: ")
                    .append(entry.getValue())
                    .append(")\n");
        }

        return result.toString();

    }

    // Метод путешествия с отслеживанием посещённых городов
    public City travelBy(int n) {
        return travelByHelper(n, new HashSet<>());
    }

    private City travelByHelper(int steps, Set<City> path) {
        if (steps <= 1) return this;

        // Добавляем текущий город в путь
        path.add(this);

        Iterator<City> iterator = connections.keySet().iterator();

        //проходимся
        while (iterator.hasNext()) {
            City nextCity = iterator.next();

            // Проверяем, не были ли мы уже в этом городе
            if (path.contains(nextCity)) {
                continue;
            }

            City result = nextCity.travelByHelper(steps - 1, new HashSet<>(path));
            if (result != null) {
                return result;
            }
        }

        // Тупик или зацикливание
        return null;
    }

}
