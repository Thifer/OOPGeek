package Home2;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public int getAppetite() {return appetite;}

    public boolean getSatiety(){return satiety;}
    public void eat(Plate plate) {
        if(plate.getFood()>appetite){
            plate.setFood(plate.getFood()-this.getAppetite());
            satiety = true;
        }
    }

    public void getInfo(){
        if(getSatiety()) System.out.println(name + " сыт");
        else System.out.println(name+ " голоден");
    }

}
