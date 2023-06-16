package Lesson3.task2;

import java.util.Arrays;
import java.util.Random;
public class Program {

    static Random random = new Random();

    /**
     *  Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int[] ages = new int[]{18,20,35,19,24,32,22};
        Employee emp = null;
        return switch (random.nextInt(2)) {
            case 0 ->
                    new Worker(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], ages[random.nextInt(ages.length)], 20000 + random.nextInt(80000));
            case 1 ->
                    new Freelancer(names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], ages[random.nextInt(ages.length)], 20000 + random.nextInt(80000));
            default -> emp;
        };
    }


    /**
     *  Придумать новые состояния для наших сотрудников
     *   Придумать несколько Comparator'ов для сортировки сотрудников
     *   по фамилии + имени или по возрасту + уровню зп.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
        {
            employees[i] = generateEmployee();
        }

        Arrays.sort(employees);

        for (Employee employee: employees) {
            System.out.println(employee);
        }



    }

}
