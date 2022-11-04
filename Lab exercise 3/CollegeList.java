import java.util.Scanner;

public class CollegeList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student stud = new Student();
        Employee emp = new Employee();
        Faculty fac = new Faculty();
        System.out.print("Press E for Employee, S for student, F for faculty:  ");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("E")) {
            System.out.println("Type employee's name, contact number, salary, department");
            System.out.println("Press Enter every input");
            emp.setName(scan.nextLine());
            emp.setContactNum(scan.nextLine());
            emp.setSalary(scan.nextDouble());
            emp.setDepartment(scan.next());
            System.out.println("----------------------------------------");
            System.out.println("Name: "+ emp.getName());
            System.out.println("Contact Number: "+emp.getContactNum());
            System.out.println("Salary: "+emp.getSalary());
            System.out.println("Department: "+emp.getDepartment());
        } else if (input.equalsIgnoreCase("F")) {
            System.out.println("Type Faculty's name, contact number, salary, department");
            System.out.println("Press Enter every input");
            fac.setName(scan.nextLine());
            fac.setContactNum(scan.nextLine());
            fac.setSalary(scan.nextDouble());
            fac.setDepartment(scan.next());
            System.out.println("Press Y if regular press N if not");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("Y")) {
                fac.isRegular(true);
                System.out.println("----------------------------------------");
                System.out.println("Name: "+ fac.getName());
                System.out.println("Contact Number: "+fac.getContactNum());
                System.out.println("Salary: "+fac.getSalary());
                System.out.println("Department: "+fac.getDepartment());
                System.out.println("Faculty is Regular");
            } else if (choice.equalsIgnoreCase("N")) {
                fac.isRegular(false);
                System.out.println("----------------------------------------");
                System.out.println("Name: "+ fac.getName());
                System.out.println("Contact Number: "+fac.getContactNum());
                System.out.println("Salary: "+fac.getSalary());
                System.out.println("Department: "+fac.getDepartment());
                System.out.println("Faculty is not Regular");
            } else {
                System.out.println("Invalid Input!");
            }
        } else if (input.equalsIgnoreCase("S")) {
            System.out.println("Type Student's name, contact number, Enrolled Program, Year level");
            System.out.println("Press Enter every input");
            stud.setName(scan.nextLine());
            stud.setContactNum(scan.nextLine());
            stud.setProgram(scan.nextLine());
            int yearLevel = scan.nextInt();
            if (yearLevel<=4&&yearLevel>0) {
                stud.setYearLevel(yearLevel);
                System.out.println("----------------------------------------");
                System.out.println("Name: "+ stud.getName());
                System.out.println("Contact Number: "+stud.getContactNum());
                System.out.println("Program: "+stud.getProgram());
                System.out.println("Year Level: "+stud.getYearLevel());
            } else{
                System.out.println("Try again! 1-4 year level only");
            }     
        } else{
            System.out.println("Invalid Input! ");
        }
        scan.close();
    }
}