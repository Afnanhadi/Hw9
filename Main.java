public class Main {
    public static void main(String[] args) {
        System.out.println("SHAPE: ");
         Shape S1=new Shape("Green  ",true);
         System.out.println(S1.toString()+"\n");
         System.out.println("CIRCLE:\n  ");
         Circle C=new Circle(1,"red",true);
         System.out.println("Area of Circle:"+C.getArea());
         System.out.println("Perimeter Circle: "+C.getPerimeter()+"\n");
         System.out.println(C.toString()+"\n");
         System.out.println("RECTANGLE:\n  ");
         System.out.println(C.toString());
         Rectangle R=new Rectangle(100,100,"black",true);
         System.out.println("Area of Rectangle: "+R.getArea());
         System.out.println("Rectangle Perimeter : "+R.getPerimeter()+"\n");
         System.out.println("SQUARE:\n ");
         Square square =new Square(10,"red ",true);
         System.out.println("Square Side:  "+square.getSide());
         System.out.println(square.toString());
         System.out.println("Square Area:  "+square.getArea());
         System.out.println("Square Perimeter: "+square.getPerimeter());

    }
}