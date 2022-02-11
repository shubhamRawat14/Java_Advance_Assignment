/*
Q9. Create a class TwoDim which contains private members as x and y coordinates in package P1. Define the default constructor, 
a parameterized constructor and override toString() method to display the coordinates. Now reuse this class and in package P2 
create another class ThreeDim, adding a new dimension as z as its private member. Define the constructors for the subclass and 
override toString() method in the subclass also. Write appropriate methods to show dynamic method dispatch. The main() function 
should be in a package P.
*/
class Main {
    public static void main(String[] args) {
        TwoDim reference;           // obtain a reference of type TwoDim
        reference = new TwoDim(1,5);   // object of type TwoDim
        System.out.println(reference);

        // // object of type ThreeDim
        reference =new ThreeDim(2,4,6);
        System.out.println(reference.toString());
    }
}

public class TwoDim {
    private int xCoordinate, yCoordinate;
    public TwoDim() {
    }
    public TwoDim(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    @Override
    public String toString() {
        return "X = " + xCoordinate +
                ", Y = " + yCoordinate;
    }
}
