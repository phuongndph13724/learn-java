package exercise.oop.studentManagement.UseClass;

import exercise.oop.studentManagement.BuildClass.Student;
import exercise.oop.studentManagement.BuildClass.StudentManagement;

import java.util.List;
import java.util.Scanner;

public class MainUserManagement {
    Scanner scanner = new Scanner(System.in);
    int id = 1;
    public void run() {
        StudentManagement studentManagement = new StudentManagement();
        int index = 0;
        do {
            System.out.println("Chức năng 1 : Thêm danh sách sinh viên");
            System.out.println("Chức năng 2 : Hiển thị danh sách sinh viên");
            System.out.println("Chức năng 3 : Sắp xếp danh sách sinh viên theo thứ tự tăng dần của điểm trung bình");
            System.out.println("Chức năng 4 : TÌm kiếm sinh viên theo tên");
            System.out.print("Nhập vào chức năng muốn thực hiện : ");
            index = scanner.nextInt();
            if (index < 1 || index > 4){
                continue;
            }
            switch (index){
                case 1:
                    this.addStudent(studentManagement);
                    break;
                case 2:
                    this.listStudent(studentManagement);
                    break;
                case 3:
                    this.sortListStudent(studentManagement);
                    break;
                case 4:
                    this.searchStuentByUserName(studentManagement);
                    break;
                default:
                    break;
            }
        }while (index <= 4);
    }

    void addStudent(StudentManagement studentManagement){
        System.out.println("Nhập vào số sinh viên cần thêm : ");
        int numberStudent = scanner.nextInt();
        for (int index = 0; index < numberStudent; index++ ){
            System.out.println("------- Thông tin sinh viên ----------");
            System.out.println("Nhập vào tên sinh viên : ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Nhập vào email sinh viên : ");
            String email = scanner.nextLine();
            System.out.println("Nhập vào tuổi sinh viên : ");
            int age = scanner.nextInt();
            System.out.println("Nhập vào điểm trung bình sinh viên : ");
            double pointPow = scanner.nextDouble();
            Student student = new Student(id,name,email,age,pointPow);
            studentManagement.addStudent(student);
            this.id = id + 1;
        }
        System.out.println("Đã thêm thành công!");
    }

    void listStudent(StudentManagement studentManagement) {
        List<Student>  listStudent =  studentManagement.getListStudent();
        for (Student student: listStudent) {
            student.display();
        }
    }

    void sortListStudent(StudentManagement studentManagement){
        List<Student>  listStudent =  studentManagement.sortListStudent();
        for (Student student: listStudent) {
            student.display();
        }
    }

    void searchStuentByUserName(StudentManagement studentManagement){
        studentManagement.searchStuentByUserName(scanner);
    }
}
