package ru.ibs.project.gnm;

public class Boss extends Employee  {
    private String dep;
    private int experience;

    public Boss(int age, String name, String salary, String dep, int experience) {
        super(age, name, salary);
        this.dep = dep;
        this.experience = experience;
    }

    @Override
    public void sayHello() {
        System.out.println("Здарова" );
    }

    public void seyDep (String dep){
        System.out.println("Я руководитель департамента" + dep + ".");
    }
    public void seyExperience (int experience){
        System.out.println("Я имею стаж руководства" + experience + " лет");
    }

    @Override
    public void sayBay() {
        System.out.println("Всем работать!" );
    }
}