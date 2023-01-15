package com.example.zadaniedodatkowe1;
import java.util.*;
public class Aplication {

    public static void main(String[] args) {


        class Employee {



            private String firstName;
            private String secondName;
            private int salary;

            public Employee(String firstName, String secondName, int salary)
            {
                this.firstName = firstName;
                this.secondName = secondName;
                this.salary = salary;
            }

            public String getFirstName() {
                return this.firstName;
            }
            public String getSecondName() {
                return this.secondName;
            }
            public double calculateSalary() {
                return this.salary;
            }
        }


        Employee pracownik1 = new Employee("Krzysztof","Krawczyk",2113);
        Employee pracownik2 = new Employee("Mateusz","Morawiecki",10010);
        Employee pracownik3 = new Employee("Sebastian" ,"Kraśko",10050);
        Employee pracownik4 = new Employee("Jan","Kowalski",5500);
        Employee pracownik5 = new Employee("Marek","Nowak",4004);


        LinkedList<Employee> EmployeeList = new LinkedList<Employee>();
        EmployeeList.add(pracownik1);
        EmployeeList.add(pracownik2);
        EmployeeList.add(pracownik3);
        EmployeeList.add(pracownik4);
        EmployeeList.add(pracownik5);


        for( Employee salaryPayout : EmployeeList)
        {
            System.out.println("Imię i Nazwisko pracownika "+ salaryPayout.getFirstName()+ ", "+ salaryPayout.getSecondName()+" Wynagrodzenie: "+ salaryPayout.calculateSalary()+"zł");
        }


    }
}