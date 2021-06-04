package ru.ibs.project.gnm;

public class Developer extends Employee {
    private String language;
    private int count;


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public Developer(int age, String name, String salary, String language, int count) {
        super(age, name, salary);
        this.language = language;
        this.count =  count;
    }

    @Override
    public void sayHello() {
        System.out.println("Всем добрый день" );
    }

    public void seyLanguage (String language){
        System.out.println("Я программирую в основном на" + language + ".");
    }
    public void count (int count){
        System.out.println("Но вообще я знаю " + count + " языков программирования");
    }

    @Override
    public void sayBay() {
        System.out.println("Всем пока, я кодить!" );
    }
}