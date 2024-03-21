package exercise.oop.studentManagement.BuildClass;

public class Student {

    private int id;
    private String name;
    private String email;
    private int age;

    private double pointPow;

    public Student(int id, String name,String email, int age, double pointPow){
        this.id = id;
        this.name = name;
        this.age = age;
        this.pointPow = pointPow;
        this.email = email;
    }

    public double getPointPow(){
        return this.pointPow;
    }

    public String getName(){
        return this.name;
    }

    public void display() {
        System.out.println("Id : " + this.id + " - " +  "Tên :" + this.name + " - " + this.age + " - " + "Email : " + this.email + " - " + "Điểm trung bình : " + this.pointPow);
        System.out.println("------------");
    }

}

