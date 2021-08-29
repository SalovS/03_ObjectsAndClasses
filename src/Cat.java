
public class Cat
{
    private double originWeight;
    private double weight;

    private static final double minWeight = 1000.0;
    private static final double maxWeight = 9000.0;
    private static final int numbersOfEyes = 2;

    private double eatenFood;

    private static int count;
    private boolean alive;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        eatenFood = 0;
        count++;
        alive = true;
    }

    public Cat(double weight)
    {
        this.weight = weight;
        originWeight = weight;
        eatenFood = 0;
        count++;
        alive = true;
    }
    public Cat(double wight, double eatenFood, boolean alive){
        this.weight = wight;
        this.eatenFood = eatenFood;
        this.alive = alive;
        originWeight = weight;
        if(alive)
            count++;
    }

    public void meow()
    {
        if(isAlive()) {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }

    public boolean isAlive(){
        if(!alive)
            return false;
        if(weight < minWeight || weight > maxWeight){
            alive = false;
            count --;
            return false;
        }
        return true;
    }

    public void feed(Double amount)
    {
        if(isAlive()) {
            weight = weight + amount;
            eatenFood = +amount;
        }
    }

    public void pee(){
        if(isAlive()) {
            if (weight > 1000)
                weight -= 50;

            System.out.println("Buries it");
        }
    }

    public void drink(Double amount)
    {
        if(isAlive()) {
            weight = weight + amount;
        }
    }

    public Double getEatenFood(){
        return eatenFood;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight > maxWeight) {
            isAlive();
            return "Exploded";
        }
        else if(!isAlive()) {
            return "Dead";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public int getCount(){
        return count;
    }
}