import java.time.LocalDate;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class Person
{
    private String name,address;
    private int d,m,y,height,weight;
    Person(String name,String address,int d,int m,int y,int height,int weight)
    {
        this.name=name;
        this.address=address;
        this.d=d;
        this.m=m;
        this.y=y;
        this.height=height;
        this.weight=weight;
    }
    String getname()
    {
        return name; 
    }
    String getaddress()
    {
        return address;
    }
    int getd()
    {
        return d;
    }
    int getm()
    {
        return m;
    }
    int gety()
    {
        return y;
    }
    int getheight()
    {
        return height;
    }
    int getweight()
    {
        return weight;
    }
    int calculateAge()
    {
        LocalDate myObj=LocalDate.now();
        int age=myObj.getYear()-y;
        return age;
    }
}

class Student extends Person
{
    int rollno,mark1,mark2,mark3;
    float avg;
    Student(String name,String address,int d,int m,int y,int height,int weight,int rollno,int mark1,int mark2,int mark3)
    {
        super(name,address,d,m,y,height,weight);
        this.rollno=rollno;
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }
    void calculateavg()
    {
        avg=(mark1+mark2+mark3)/3.0f;
    }
    void display()
    {
        System.out.println("Name = "+super.getname());
        System.out.println("Address = "+super.getaddress());
        System.out.println("Birthdate = "+super.getd()+"/"+super.getm()+"/"+super.gety());
        System.out.println("Height = "+super.getheight());
        System.out.println("weight = "+super.getweight());
        System.out.println("marks1 = "+mark1);
        System.out.println("marks2 = "+mark2);
        System.out.println("Marks = "+mark3);
        System.out.println("Average = "+avg);
    }
}

class Employee extends Person
{
    int empid,salary;
    float tax;
    Employee(String name,String address,int d,int m,int y,int height,int weight,int empid,int salary)
    {
        super(name,address,d,m,y,height,weight);
        this.empid=empid;
        this.salary=salary;
    }
    void calculateTax()
    {
            tax=salary*0.18f;
    }
    void display()
    {
        System.out.println("Name = "+super.getname());
        System.out.println("Address = "+super.getaddress());
        System.out.println("Birthdate = "+super.getd()+"/"+super.getm()+"/"+super.gety());
        System.out.println("Height = "+super.getheight());
        System.out.println("weight = "+super.getweight());
        System.out.println("Empid = "+empid);
        System.out.println("Salary = "+salary);
        System.out.println("Tax = "+tax);
        
    }
}

class InheritanceCheck
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name=sc.nextLine();
        System.out.print("Enter Student Address : ");
        String address=sc.nextLine();
        System.out.print("Enter Student birthday : ");
        int d=sc.nextInt();
        int m=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("Enter student height in (cm): ");
        int height=sc.nextInt();
        System.out.print("Enter Student weight : ");
        int weight=sc.nextInt();
        System.out.print("Enter Student Roll No :");
        int rollno=sc.nextInt();
        System.out.print("Enter studeent marks of 3 Subject : ");
        int marks1=sc.nextInt();
        int marks2=sc.nextInt();
        int marks3=sc.nextInt();
        Student s=new Student(name, address, d, m, y, height, weight , rollno, marks1, marks2, marks3);
        s.calculateavg();
        sc.nextLine();
        System.out.print("Enter Employee Name : ");
        name=sc.nextLine();
        System.out.print("Enter Employee Address : ");
        address=sc.nextLine();
        System.out.print("Enter Employee birthday : ");
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        System.out.print("Enter Employee height : ");
        height=sc.nextInt();
        System.out.print("Enter Employee Weight : ");
        weight=sc.nextInt();
        System.out.print("Enter Employee Id : ");
        int empid=sc.nextInt();
        System.out.print("Enter Employee Salary : ");
        int salary=sc.nextInt();
        Employee e=new Employee(name, address, d, marks3, y, height, weight, empid, salary);
        e.calculateTax();
        System.out.println("\nSTUDENT\n");
        s.display();
        System.out.println("\nEMPLOYEE\n");
        e.display();
    }
}