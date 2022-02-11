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
