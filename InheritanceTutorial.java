class Shape{
    public void area(){
        System.out.println("display area");
    }

}
class Triangle extends Shape{
    public void area(int l, int h ){
        System.out.println(0.5*l*h);
    }
}
//multilevel inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
//hierarchial inheritance
class Circle extends Shape{
    public void area(double radius){
        System.out.println(3.14*radius*radius);
    }
}

public class InheritanceTutorial {
    public static void main(String[] args) {
        Triangle t1= new Triangle();
        t1.area(5,4);
        EquilateralTriangle t2=new EquilateralTriangle();
        t2.area();

        Circle c1=new Circle();
        c1.area(5);
    }
    
}
