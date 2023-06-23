package Lesson7.observer;

import java.util.Random;

public class Workless implements Observer{

    private static final Random random = new Random();
    private final String name;

    private double minSalary;

    public Workless(String name) {
        this.name = name;
        minSalary = random.nextDouble(10000, 40000);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary()){
            System.out.printf("Безработный %s (%f) >>> Мне нужна эта работа! [%s - %f, %s]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary(),vacancy.getVacancyType());
            minSalary = vacancy.getSalary();
        }
        else {
            System.out.printf("Безработный %s >>> Я найду работу получше (%f)! [%s - %f, %s]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary(),vacancy.getVacancyType());
        }
    }

}
