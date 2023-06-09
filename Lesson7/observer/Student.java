package Lesson7.observer;

import java.util.Random;

public class Student implements Observer {

    private static final Random random = new Random();
    private final String name;

    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 4000);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()&&vacancy.getVacancyType()!=VacancyType.Handyman){
            System.out.printf("Студент %s (%f) >>> Мне нужна эта работа! [%s - %f, %s]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary(),vacancy.getVacancyType());
            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Студент %s >>> Я найду работу получше (%f)! [%s - %f, %s]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary(),vacancy.getVacancyType());
        }
    }
}
