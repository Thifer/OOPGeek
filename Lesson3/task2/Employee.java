package Lesson3.task2;



public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surname;
    protected int age;
    protected double salary; // Ставка заработной платы

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname,int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {

        int res = this.getClass().getName().compareTo(o.getClass().getName());
//
        if (res == 0){
            res = surname.compareTo(o.surname);
            if(res == 0){
                res = name.compareTo(o.name);
                if( res == 0){
                    res =  Double.compare(calculateSalary(),o.calculateSalary());
                    if(res == 0 ){
                        res = Integer.compare(age,o.age);
                    }
            }}
        }
        return res;
    }
}
