public class Bike {
    public int gear;
    public int speed;

    public Bike(int gear, int speed) throws Exception
    {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -= decrement;
        System.out.println(decrement);
    }

    public void speedUp(int increment)
    {
        speed += increment;
        System.out.println(increment);
    }

    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

