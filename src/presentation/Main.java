package presentation;

import Employee.Employee;

import java.util.Scanner;

public class Main {
    Employee[] epm = new Employee[100];
    int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        do {
            System.out.println("1. Nhập thông tin cho n nhân viên");
            System.out.println("2. Hiển thị thông tin nhân viên");
            System.out.println("3. Tính lương cho các nhân viên");
            System.out.println("4. Tìm kiếm nhân viên theo tên nhân viên");
            System.out.println("5. Cập nhật thông tin nhân viên");
            System.out.println("6. Xóa nhân viên theo mã nhân viên");
            System.out.println("7. Sắp xếp nhân viên theo lương tăng dần (Comparable)");
            System.out.println("8. Sắp xếp nhân viên theo tên nhân viên giảm dần (Comparator)");
            System.out.println("9. Sắp xếp nhân vên theo năm sinh tăng dần (Comparator)\n");
            System.out.println("10. Thoát");
            System.out.println("Nhập lựa chọn:");
            int luachon = Integer.parseInt(sc.nextLine());
            switch (luachon) {
                case 1:
                    main.inputInfor(sc);
                    break;
                case 2:
                    main.displayInfo();
                    break;
                case 3:
                    main.calculateSalaries();
                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.printf("Vui lòng nhập lai 1-10");
            }
        } while (true);
    }

    public void inputInfor(Scanner scanner) {
        System.out.println("Nhập vào số nhân viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            if (index < n) {
                epm[index] = new Employee();
                epm[index].inputData(scanner);
                index++;
            }
        }
    }

    public void displayInfo() {
        System.out.println("Thông tin của nhân viên:");
        for (int i = 0; i < index; i++) {
            epm[i].displayData();
            System.out.println("------------------------------");
        }
    }
    public void calculateSalaries() {
        for (int i = 0; i < index; i++) {
            epm[i].calSalary();
        }
        System.out.println("Đã tính lương cho " + index + " nhân viên.");
    }
}






