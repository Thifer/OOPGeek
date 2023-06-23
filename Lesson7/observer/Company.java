package Lesson7.observer;

import java.util.Random;

public class Company {

    private static final Random random = new Random();
    private final double maxSalary;
    private Vacancy vacancy;
    private final String companyName;
    private final Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType vacancyType) {
        double salary = random.nextDouble(3000, maxSalary);
        vacancy = new Vacancy(companyName, vacancyType, salary);
        jobAgency.sendOffer(vacancy);
    }


}
