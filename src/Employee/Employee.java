package Employee;

import ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String id;
    private String Name;
    private int Year;
    private float Rate;
    private float Commission;
    private float Salary;
    private Boolean Status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float rate, float commission, float salary, Boolean status) {
        this.id = id;
        Name = name;
        Year = year;
        Rate = rate;
        Commission = commission;
        Salary = salary;
        Status = status;
    }
    public String getId(){
        return id;
    }
    public void setStatus(String id){
        this.id = id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getYear(){
        return Year;
    }
    public void  setYear(int Year){
        this.Year = Year;
    }
    public float getCommission(){
        return Commission;
    }
    public void setCommission(float commission){
        this.Commission = commission;
    }
    public float getSalary(){
        return Salary;
    }
    public void setSalary(float salary){
        this.Salary = Salary;
    }
    public Boolean getStatus(){
        return Status;
    }
    public void setStatus(Boolean status){
        this.Status = Status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập mã nhân viên: ");
        this.id = scanner.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        this.Name = scanner.nextLine();
        System.out.println("Nhâp hệ số lương nhân viên: ");
        this.Year = scanner.nextInt();
        System.out.println("Nhập hoa hồng của nhân viên hàng tháng: ");
        this.Rate = scanner.nextFloat();
        System.out.println("Nhập lương nhân viên hàng tháng: ");
        this.Commission = scanner.nextFloat();
        System.out.println("Nhập trạng thái nhân viên(true-đang làm việc, false-Nghỉ việc: ");
        this.Status = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee name: " + this.Name);
        System.out.println("Year of birth: " + this.Year);
        System.out.println("Rate: " + this.Rate);
        System.out.println("Commission: " + this.Commission);
        System.out.println("Status: " + this.Status);
    }
    public float calcSalary() {
        this.Salary = IEmployee.BASIC_SALARY * this.Rate + this.Commission;
        return this.Salary;
    }
    public int calSalary() {
        this.Salary = (int) (Rate * BASIC_SALARY + Commission);
        return (int) this.Salary;
    }
}
