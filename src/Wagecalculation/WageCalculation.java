package Wagecalculation;


public class WageCalculation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int emp_check = (int) Math.floor(Math.random()*10)%3;
        double wage_perhour = 20;
        double full_day = 8;
        double part_time = 4;
        switch (emp_check) {
            case 0:
                System.out.println("Employee is Present");
                System.out.println("Monthly Wage of the Employee = " + wage_perhour * full_day * 20);
                break;
            case 1:
                System.out.println("Employee is present but is working part-time");
                System.out.println("Monthly Wage of the Part-time Employee = " + part_time * wage_perhour * 20);
                break;
            default:
                System.out.println("Employee is Absent");
                System.out.println("Monthly Wage of the Employee = 0");
                break;
        }




    }

}
