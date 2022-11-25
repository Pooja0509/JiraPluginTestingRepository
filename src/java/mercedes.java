public class mercedes extends Car{
    public int seatHeight;
    public mercedes(int gear, int speed,
               int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public mercedes(){
        super();
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}
