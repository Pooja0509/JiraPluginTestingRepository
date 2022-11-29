public class Car {
    public int gear;
    public int speed;

    public Car(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed; 
    }     
    public Car(){}

    public void applyBrake(int decrement)
    {
        speed -= decrement;
        System.out.println("decrement is " + decrement);
         System.out.println("decrement is " + decrement);
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
    
    public void speedUp(int increment)
    {
        increment = increment/0;
    }
    
    public void process1() {
        try {
            FileInputStream fis = new FileInputStream("/tmp/bugger");
            } catch (IOException ioe) {
        }
    }
    protected void finalize() 
{

}
    
  
}
