public class Cube extends ThreeDShape{
    private double side;
    Cube(){}
    Cube(String color){
        setColor(color);
    }
    Cube(String color, double side){
        setColor(color);
        this.side=side;
    }
    void setSide(double side) {
        this.side=side;
    }
    double getSide(){
        return side;
    }
    public String toString(){
        String output=String.format("%s %f%n","Shape is Cube, side =", side);
        return output;
    }
    double getVolume() {
        double volume=Math.pow(side, 3);
        return volume;
    }
    double getArea(){
        double area=6*side*side;
        return area;
    }
    double getPerimeter(){
        double perimeter=12*side;
        return perimeter;
    }
}
