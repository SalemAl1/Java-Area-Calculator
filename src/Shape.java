import java.util.Date;
abstract public class Shape {
    private Date dateCreated=new Date();
    private String color;
    Shape(){}
    Shape(String color){
        this.color=color;
    }
    Date getDateCreated(){
        return dateCreated;
    }
    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return color;
    }
    abstract double getArea();
    abstract double getPerimeter();
}
