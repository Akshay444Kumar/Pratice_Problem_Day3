package Wagecalculation;


public class WageCalculation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        double emp_check = Math.floor(Math.random()*10)%3;
        double wage_perhour = 20;
        double full_day = 8;
        double part_time = 4;
        if (emp_check ==0)
        {
            System.out.println("Employee is Absent");
            System.out.println("Daily Wage of the Employee = 0");
        } else if (emp_check == 1) {
            System.out.println("Employee is present but is working part-time");
            System.out.println("Daily Wage of the Part-time Employee = " + part_time * wage_perhour);

        } else
        {
            System.out.println("Employee is Present");
            System.out.println("Daily Wage of the Employee = " + wage_perhour * full_day);
        }

    }

}
