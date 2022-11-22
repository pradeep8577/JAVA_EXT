import java.util.Scanner;
class Employee
{
    String fname,lname;
    float salary;
    Employee(String fname,String lname,float salary)
    {
        this.fname=fname;
        this.lname=lname;
        if(salary<0)
        {
            salary=0.0f;
        }
        else
        {
            this.salary=salary;
        }
    }
    String fname()
    {
        return fname;
    }
    String lname()
    {
        return lname;
    }
    float getsalary()
    {
        return salary;
    }
    void increment(float per)
    {
        salary=salary+((salary*per)/100);
    }
    void display()
    {
        System.out.println("First Name = "+this.fname+"\tLast Name = "+this.lname+"\tSalary = "+this.salary+"\tYearly Salary = "+this.salary*12);
    }
}
class EmployeeTest
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name of employee 1 :");
        String fname=sc.nextLine();
        System.out.print("Enter last name of Employee 1 :");
        String lname=sc.nextLine();
        System.out.print("Enter Salary of Employee 1 :");
        float salary=sc.nextFloat();
        sc.nextLine();
        Employee e1=new Employee(fname, lname, salary);
        System.out.print("Enter first name of employee 2 :");
        fname=sc.nextLine();
        System.out.print("Enter last name of Employee 2 :");
        lname=sc.nextLine();
        System.out.print("Enter Salary of Employee 2 :");
        salary=sc.nextFloat();
        System.out.println("Enter percentage to increase salary");
        float per=sc.nextFloat();
        Employee e2=new Employee(fname, lname, salary);
        System.out.println("Employee 1 before salary increment");
        e1.display();
        e1.increment(per);
        System.out.println("Employee 1 After salary increment");
        e1.display();
        System.out.println("Employee 2 before salary increment");
        e2.display();
        e2.increment(per);
        System.out.println("Employee 2 After salary increment");
        e2.display();
    }
}