package Home2;
//Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот
//пытается покушать 15-20).

//Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды),
//сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
//наполовину сыт (это сделано для упрощения логики программы).

//Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.

//Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Murzik", 4);
        Cat cat3 = new Cat("Kotan", 8);
        Cat cat4 = new Cat("Baton", 9);
        Cat cat5 = new Cat("Persik", 1);
        Cat cat6 = new Cat("Murka", 2);
        Cat cat7 = new Cat("Busya", 3);
        Cat cat8 = new Cat("Asya", 11);
        Cat cat9 = new Cat("Korona", 35);
        Cat cat0 = new Cat("Princessa", 50);

        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        catList.add(cat4);
        catList.add(cat5);
        catList.add(cat6);
        catList.add(cat7);
        catList.add(cat8);
        catList.add(cat9);
        catList.add(cat0);


        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat: catList) {
            cat.eat(plate);
            cat.getInfo();
            if(plate.getFood()<50) plate.refill();
        }
        plate.info();
    }
}
