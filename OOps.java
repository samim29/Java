
class Pen{
    String colour;
    String type; 

    public void write(){
        System.out.println("Writing Something");
    }
    public void printcolor(){
        System.out.println(this.colour);
    }
}

class Student{
    String name;
    int age;
    //parametarized constructor
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    //copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class OOps {

    public static void main(String[] args) {
       Pen pen1=new Pen();
       pen1.colour="blue";
       pen1.type="gel";

       pen1.write();

       Pen pen2=new Pen();
       pen2.colour="black";
       pen2.type="ballpoint";

       pen1.printcolor();
       pen2.printcolor();

       Student s1= new Student("samim",20);
       Student s2=new Student(s1);

       s1.printInfo();
       s2.printInfo();




    }
}

