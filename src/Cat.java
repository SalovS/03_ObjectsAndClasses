
public class Cat
{
    private double originWeight;
    private double weight;

    private static final double minWeight = 1000.0;
    private static final double maxWeight = 9000.0;
    private static final int numbersOfEyes = 2;

    private double eatenFood;

    private static int count;
    private boolean isAlive;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        eatenFood = 0;
        count++;
        isAlive = true;
    }

    public Cat(double weight)
    {
        this.weight = weight;
        originWeight = weight;
        eatenFood = 0;
        count++;
        isAlive = true;
    }

    public void meow()
    {
        if(alive()) {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }

    private boolean alive(){
        if(!isAlive)
            return false;
        if(weight < minWeight || weight > maxWeight){
            isAlive = false;
            count --;
            return false;
        }
        return true;
    }

    public void feed(Double amount)
    {
        if(alive()) {
            weight = weight + amount;
            eatenFood = +amount;
        }
    }

    public void pee(){
        if(alive()) {
            if (weight > 1000)
                weight -= 50;

            System.out.println("Buries it");
        }
    }

    public void drink(Double amount)
    {
        if(alive()) {
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
            alive();
            return "Exploded";
        }
        else if(!alive()) {
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