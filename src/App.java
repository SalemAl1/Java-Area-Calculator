public class App {
    static String yellow = "\033[0;33m";
    static String blue = "\033[0;34m"; 
    static String cyan = "\033[0;36m"; 
    static String reset = "\033[0m";
    static double totalArea=0;
    public static void main(String[] args){
        int size=Integer.parseInt(args[0]);
        if (size<2){
            System.out.print("Size can\'t be less than 2.");
            return;
        }
        Drawable[] drawable=new Drawable[size];
        int index=1;
        for (int i=0; i<size; i++){
            String shape=args[index];
            double value=Double.parseDouble(args[index+1]);
            drawable[i]=new Drawable(shape, value);
            index+=2;
        }
        index=2;
        for (int i=0; i<size; i++){
            if (drawable[i].getShape().equals("circle") || drawable[i].getShape().equals("Circle")){
                Circle circle=new Circle(Double.parseDouble(args[index]));
                totalArea+=circle.getArea();
            }
            else if (drawable[i].getShape().equals("cube") || drawable[i].getShape().equals("Cube")){
                Cube cube=new Cube();
                cube.setSide(Double.parseDouble(args[index]));
                totalArea+=cube.getArea();
            }
            index+=2;
        }
        System.out.printf("%s %s%.2f%s", "Total area =", blue, totalArea, reset);
    }
}