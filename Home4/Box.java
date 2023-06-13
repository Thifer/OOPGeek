package Home4;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private final ArrayList<T> fruits;

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public float getWeight(){
        if(fruits.size()>0){
            return fruits.size()* fruits.get(0).getWeight();
        }
        return 0;
    }

    public void addFruid(T fruit){
        fruits.add(fruit);
    }

    public boolean compare(Box box){
        return this.getWeight()== box.getWeight();
    }

    public void sprinkle(Box<T> box){
        fruits.addAll(box.getFruits());
        box.fruits.clear();
    }

}
