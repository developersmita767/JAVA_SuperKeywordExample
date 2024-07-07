import java.time.*;
class Person{
     String name;
     int age;
     Person(String name,int age){
        System.out.println("Inside the Person constructor");
        this.name=name;
        this.age=age;
     }
}
class Teacher extends Person{
    int empId;
    LocalDate doj;
    Teacher(int empId,String name,int age,LocalDate doj){
        super(name,age);
        System.out.println("Inside the Teacher constructor");
        this.empId=empId;
        this.doj=doj;
    }
}
class Student extends Person{
    int rollNum;
    Student(int rollNum,String name,int age){
       super(name,age);
        System.out.println("Inside Student constructor");
        this.rollNum=rollNum;
    }
    
}
public class TestSuper{
    public static void main(String[] ar){
        LocalDate date = LocalDate.of(2017, 1, 13);  
        Teacher t=new Teacher(20,"Biju",38,date);
        Student s=new Student(1,"Ram",10);
        System.out.println("Teacher name:"+t.name);
        System.out.println("Teacher joining date:"+t.doj);
        System.out.println("Student name:"+s.name);
    }
}