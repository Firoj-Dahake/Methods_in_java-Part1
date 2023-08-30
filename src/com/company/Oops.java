package com.company;

//Custome class ---> Employee
class Employee{
    int id;
    String name;
    int salary;

    public void printdetails(){
        System.out.println("My Id is "+ id);
        System.out.println("My Name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}
public class Oops{
    public void main(String[] args){
        System.out.println("Creating the Custome class");
        Employee firoj = new Employee();
        Employee pranay= new Employee();

        //setting attributs of firoj
         firoj.id=12;
        firoj.name="Fitnesswithfiron";
        firoj.salary=130000;

        //setting attributs of pranay
        pranay.id=20;
        pranay.name="pranayhas shop";
        pranay.salary=100000;

        //printing attributes
        firoj.printdetails();
        pranay.printdetails();

        int salary = pranay.getsalary();
        System.out.println(salary);


    }
}
