package Lesson7.observer;

public class Vacancy {
    private final String companyName;
    private final double salary;
    private final VacancyType vacancyType;

    public Vacancy(String companyName, VacancyType vacancyType, double salary) {
        this.companyName = companyName;
        this.vacancyType = vacancyType;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }
}
