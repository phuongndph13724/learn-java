package exercise.javabasic;

import java.util.Scanner;

public class ExerciseBasic {

    int valueInteger = 0;
    Scanner scanner = new Scanner(System.in);

    public void importConsoleOne(){
//        Bài 1
        System.out.print("Nhập số: ");
        valueInteger = scanner.nextInt();
        if (valueInteger >= 1 && valueInteger <= 100){
            System.out.println(valueInteger);
            if ( valueInteger % 2 != 0){
                System.out.println("Odd");
            }
            if (valueInteger <= 30){
                System.out.println("Small Even");
            } else if (valueInteger <= 60) {
                System.out.println("Medium Even");
            } else if (valueInteger <= 100) {
                System.out.println("Big Even");
            }
        }else {
            System.out.println("Số không lớn hơn hoặc bằng 1 và không nhỏ hơn hoặc bằng 100");
            this.importConsoleOne();
        }
    }

    public void importConsoleTwo(){
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là: " + name);
        System.out.print("Nhập tên của người khác: ");
        String nameOther = scanner.nextLine();
        System.out.println("Tên của bạn là: " + nameOther);
        if (name.equals(nameOther)){
            System.out.println("Giống nhau");
        }else {
            System.out.println("Không giống nhau");
        }
    }

    public void importConsoleThree(){
        System.out.print("Nhập số: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số: ");
        int y = scanner.nextInt();
        if (x != 0 && y != 0){
            if (x < 0 && y < 0){
                System.out.println("Quadrant 4");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrant 2");
            } else if (x > 0 && y > 0 ) {
                System.out.println("Quadrant 1");
            }else {
                System.out.println("Quadrant 3");
            }
        }else {
            this.importConsoleThree();
        }

    }

    public void importConsoleFour(){
        int index = 0;
        while (index < 24){
            System.out.print(index + " ");
            if ((index + 1) % 5 == 0){
                System.out.println();
            }
            index++;
        }
    }

    public void importConsoleFive(){
        int valueCheck = 1;
        System.out.print("Nhập vào số kết thúc : ");
        int maxNunber = scanner.nextInt();

        if (maxNunber > 0 && maxNunber <= 100){
            while (valueCheck <= maxNunber){
                if (valueCheck % 10 == 0){
                    System.out.println(valueCheck);
                }
                valueCheck++;
            }
        }else {
            this.importConsoleFive();
        }
    }

    public void importConsoleSix(){
        int valueLength = 0;
        System.out.print("Nhập số lượng phần tử tron mảng: ");
        valueLength = scanner.nextInt();
        int[] arrayNumber = new int[valueLength];
//        int[] arrayNumberEven = new int[];

        for (int index = 0; index < valueLength; index++){
            System.out.print("Nhập vào giá trị các phần tử.: ");
            arrayNumber[index] = scanner.nextInt();
        }
        int valueMax = 0;
        int valueSum = 0;
        for (int index = 0; index < valueLength; index++){
            if (arrayNumber[index] > valueMax){
                valueMax = arrayNumber[index];
            }
            if (arrayNumber[index] % 2 == 0){
                System.out.println(arrayNumber[index]);
            }
        }
        System.out.println("Max.: " + valueMax);
        System.out.println("Tổng số đầu + cuối có giá trị là :" + (arrayNumber[0] + arrayNumber[valueLength - 1]));
    }
}
