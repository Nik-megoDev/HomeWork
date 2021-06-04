package ru.ibs.project.gnm;

public abstract class Employee {
    private int age;
    private String name;
    private String salary;

    public abstract void sayHello();

    public abstract void sayBay();

    public void seyAge(int age) {
        System.out.println("Мне " + age + " лет.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void  setSalary(String salary) {
        this.salary = salary;
    }


    public  Employee(int age, String name, String salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}




