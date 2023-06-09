package Lesson3.task2;



/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.);%s лет",
                surname, name, calculateSalary(),age);
    }
}
