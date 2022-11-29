public class BMW extends Car{
     private static final int[] arr5=arr1;
    public int seatHeight;
    public BMW(int gear, int speed,
                 int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue)
    {
        seatHeight = newValue;
        System.out.println(newValue);
        System.out.println("new value "+newValue);
        System.out.println(newValue);
    }
    public int getLength(String[] strings) {

        int length = 0;
        if (strings == null || strings.length == 0) return 0;
        
        for (String str : strings) {
            length += str.length();
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
            System.out.println(str);
        }

        return length;
    }

    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
    
    public boolean getCategoryId() {
        try {
            String txtA = "Category";
            boolean flag = false;
            if (categoryid > 0)
                flag = true;
            return flag;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
