package Home2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void setFood(int newfood){
        this.food = newfood;
    }
    public int getFood(){
        return food;
    }

    public void refill(){
        food = 100;
    }
}
