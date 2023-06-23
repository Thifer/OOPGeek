package Lesson7.observer;

import java.util.Random;

public class Master implements Observer {

    private static final Random random = new Random();

    private final String name;

    private double minSalary;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (minSalary <= vacancy.getSalary() && vacancy.getVacancyType() != VacancyType.Handyman && vacancy.getVacancyType() != VacancyType.TemporaryStaff) {
            System.out.printf("Рабочий %s (%f) >>> Мне нужна эта работа! [%s - %f, %s]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getVacancyType());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf("Рабочий %s >>> Я найду работу получше (%f)! [%s - %f, %s]\n",
                    name, minSalary, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getVacancyType());
        }
    }
}
