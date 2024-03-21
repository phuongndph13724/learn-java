package exercise.oop.studentManagement.BuildClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {

    List<Student> listStudent = new ArrayList<>();

    public void addStudent(Student student) {
        listStudent.add(student);
    }

    public List<Student> getListStudent () {
        return listStudent;
    }

    public List<Student> sortListStudent(){
        List<Student> listStudentNew = new ArrayList<>(listStudent);
        for (int i = 0; i < listStudentNew.size() - 1; i++) {
            for (int j = 0; j < listStudentNew.size() - i - 1; j++) {
                if (listStudentNew.get(j).getPointPow() > listStudentNew.get(j + 1).getPointPow()) {
                    Student temp = listStudentNew.get(j);
                    listStudentNew.set(j, listStudentNew.get(j + 1));
                    listStudentNew.set(j + 1, temp);
                }
            }
        }
//        listStudentNew.sort((o1, o2) -> (int) (o1.getPointPow() - o2.getPointPow()));
        return listStudentNew;
    }

    public void searchStuentByUserName(Scanner scanner){
        System.out.println("Nhập tên sinh viên cần tìm : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Danh sách tìm thấy sinh viên : ");
        for (Student student : listStudent) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                student.display();
            }
        }
        System.out.println("-------------------------------");
    }

}
