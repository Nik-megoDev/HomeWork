package ru.ibs.project.gnm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer(31, "Олег", "65000", "Java", 3);
        Employee trainee = new Trainee(20, "Васёк", "15000", "ПГТУ", null);
        Employee boss = new Boss(43, "Виктор Андреевич", "120000", "Java", 15);

        HashSet<Employee> emp = new HashSet<>();
        emp.add(dev);
        emp.add(trainee);
        emp.add(boss);

        for (Employee employee : emp) {
            System.out.println(employee.getName());
        }

        ArrayList<Employee> people = new ArrayList<>();
        people.addAll(0, emp);

        System.out.println("Команда состоит из " + people.size() + " человек");

        System.out.println();

        System.out.println("Первая домашняя работа заканчивается тут, дальше идёт вторая");

        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(new Boss(43, "Виктор Андреевич", "120000", "Testing", 15));
        employeeHashSet.add(new Boss(27, "Михаил", "100000", "Analyses", 3));
        employeeHashSet.add(new Boss(31, "Анна", "85000", "HR", 7));
        employeeHashSet.add(new Developer(31, "Вася", "75000", "Java", 3));
        employeeHashSet.add(new Developer(30, "Олег", "65000", "С++", 2));
        employeeHashSet.add(new Developer(31, "Петя", "55000", "Java", 1));
        employeeHashSet.add(new Trainee(20, "Васёк", "15000", "ПГТУ", null));
        employeeHashSet.add(new Trainee(18, "Петька", "15000", "МГУ", null));
        employeeHashSet.add(new Trainee(33, "Валерка", "15000", "ПГУ", "Михаил"));
        employeeHashSet.add(new Trainee(25, "Игорёк", "15000", "ПНИПУ", null));
        employeeHashSet.add(new Boss(41, "BigBoss", "1200000", "Boss", 3));
        employeeHashSet.add(new Developer(28, "Стивин", "150000", "Piton", 8));

        List<Employee> employeeList = new ArrayList<>(employeeHashSet);

        List<Employee> sortedList = employeeList
                .stream().sorted((employee1, employee2) -> employee1.getName().length() - employee2.getName().length())
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("Фильтр по возрасту");
        employeeList
                .stream().filter(employee -> employee.getAge() > 30)
                .collect(Collectors.toList())
                .stream().map(employee -> employee.getName())
                .forEach(System.out::println);
    }
}





