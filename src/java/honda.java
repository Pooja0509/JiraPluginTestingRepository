public class honda extends Bike {
    public int seatHeight;
    public honda(int gear, int speed,
                        int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
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
