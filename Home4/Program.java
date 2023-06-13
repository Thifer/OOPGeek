package Home4;

import java.util.ArrayList;

public class Program {

    /**Домашняя работа, задача:
     ========================
     //TODO: a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit; DONE
     //TODO: b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,поэтому в одну коробку нельзя сложить и яблоки, и апельсины; DONE
     //TODO: c. Для хранения фруктов внутри коробки можно использовать ArrayList; DONE
     //TODO: d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны); DONE
     //TODO: e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами; DONE
     //TODO: f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой; DONE
     //TODO: g. Не забываем про метод добавления фрукта в коробку. DONE
    */
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Orange> oranges = new ArrayList<>();
        ArrayList<Apple> apples2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i < 5; i++) {
            apples2.add(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }

        Box<Apple> appleBox = new Box<>(apples);
        Box<Orange> orangeBox = new Box<>(oranges);
        Box<Apple> appleBox2 = new Box<>(apples2);

        System.out.println(appleBox.compare(orangeBox));
        appleBox.sprinkle(appleBox2);
        System.out.println(orangeBox.compare(appleBox));
    }

}
