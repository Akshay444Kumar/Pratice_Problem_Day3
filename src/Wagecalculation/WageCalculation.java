package Wagecalculation;


public class WageCalculation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        double emp_check = Math.floor(Math.random()*10)%2;
        if (emp_check ==0)
        {
            System.out.println("Employee is Absent");
        }
        else
        {
            System.out.println("Employee is Present");
        }
    }

}
