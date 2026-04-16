public class Circle extends Shape{
    private double radius;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(String color, double radius){
        setColor(color);
        this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    public String toString(){
        String output=String.format("%s %f%n","Shape is Circle, radius =", radius);
        return output;
    }
    public double getArea() {
        double area=Math.PI*radius*radius;
        return area;
    }
    double getPerimeter(){
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
}