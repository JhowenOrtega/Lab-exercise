class Employee extends Person{
    private double salary;
    private String department;

    public void setSalary(double s){
        salary = s;
    }
    public void setDepartment(String d){
        department = d;
    }
    public double getSalary(){
        return salary;
    }
    public String getDepartment(){
        return department;
    }
}