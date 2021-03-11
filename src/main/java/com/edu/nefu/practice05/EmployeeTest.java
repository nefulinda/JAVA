package com.edu.nefu.practice05;

public class EmployeeTest {
    public static void main(String[] args) {
        try {
            Employee employee01 =new Employee(201812,"Tom",22);
            Employee employee02 =new Employee(16000,"450802200003194711");
            employee01.addSalary(10000);
            employee01.minusSalary(9000);
            employee01.shoTotalEmployee();
            employee01.showToalSalary();
            employee02.addSalary(10000);
            employee02.showToalSalary();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("----------------------------");
        }

    }
}
