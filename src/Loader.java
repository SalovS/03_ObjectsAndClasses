import java.util.Random;

public class Loader
{
    public static void main(String[] args)
    {
        Cat mursic = new Cat();
        Cat musia = new Cat();
        Cat barsic = new Cat();
        Cat pushok = new Cat();
        Cat snegok = new Cat();
        Cat chernish = new Cat();

        System.out.println(mursic.getWeight());
        System.out.println(musia.getWeight());
        System.out.println(barsic.getWeight());
        System.out.println(pushok.getWeight());
        System.out.println(snegok.getWeight());
        System.out.println(chernish.getWeight());

        System.out.println("-------------------------");

        System.out.println(snegok.getWeight());
        System.out.println(chernish.getWeight());

        Random random = new Random();

        System.out.println("feeding cats");
        snegok.feed(25.0 + random.nextDouble()*25);
        snegok.feed(25.0 + random.nextDouble()*25);
        System.out.println(snegok.getWeight());
        System.out.println(chernish.getWeight());

        System.out.println("-------------------------");

        System.out.println("experiments on cats");
        System.out.println("feeding");
        System.out.println(barsic.getWeight());
        System.out.println(barsic.getStatus());
        while(barsic.getStatus()!="Exploded"){
            System.out.println(barsic.getWeight());
            barsic.feed(25.0 + random.nextDouble()*25);
        }
        System.out.println(barsic.getStatus());

        System.out.println("-------------------------");

        System.out.println("ironing service");
        System.out.println(pushok.getStatus());
        while(pushok.getStatus() != "Dead"){
            pushok.meow();
        }
        System.out.println(pushok.getStatus());

        System.out.println("-------------------------");
        Cat kotia = new Cat();

        kotia.feed(150.0);

        kotia.pee();
        kotia.pee();
        kotia.pee();
        kotia.pee();

        System.out.println(kotia.getEatenFood());
    }
}