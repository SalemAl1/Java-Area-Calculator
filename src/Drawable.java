public class Drawable{
    private String shape;
    private double value;
    public Drawable(String shape, double value){
        this.shape=shape;
        this.value=value;
    }
    String getShape(){
        return shape;
    }
    double getValue(){
        return value;
    }
}