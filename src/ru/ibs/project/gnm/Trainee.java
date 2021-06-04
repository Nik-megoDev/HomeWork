package ru.ibs.project.gnm;

public class Trainee extends Employee {
    private String university;
    private String curator;

    public Trainee(int age, String name, String salary, String university, String curator) {
        super(age, name, salary);
        this.university = university;
        this.curator = curator;

    }

    @Override
    public void sayHello() {
        System.out.println("Всем привет" );
    }

    public void setUniversity (String university){
        System.out.println("Я прошёл к вам из " + university + " давайте дружить.");
    }
    public void setCurator (String university){
        System.out.println("У меня есть куратор");
    }


    @Override
    public void sayBay() {
        System.out.println("Всем пока, я стажероваться!" );
    }
}