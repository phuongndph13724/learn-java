package exercise.javabasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
            }else {
                if (valueInteger <= 30){
                    System.out.println("Small Even");
                } else if (valueInteger <= 60) {
                    System.out.println("Medium Even");
                } else if (valueInteger <= 100) {
                    System.out.println("Big Even");
                }
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
        System.out.print("Nhập số x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập số y: ");
        int y = scanner.nextInt();
        if (x != 0 && y != 0){
            if (x < 0 && y < 0){
                System.out.println("Quadrant 3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrant 4");
            } else if (x > 0 && y > 0 ) {
                System.out.println("Quadrant 1");
            }else {
                System.out.println("Quadrant 2");
            }
        }else {
            this.importConsoleThree();
        }

    }

    public void importConsoleFour(){
        int index = 0;
        while (index <= 24){
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
        ArrayList<Integer> arrayNumberEven = new ArrayList<>(); // Mảng số chẵn
        ArrayList<Integer> arrayNumberOdd = new ArrayList<>(); // Mảng số lẻ
        int totalNunberOdd = 0;


        for (int index = 0; index < valueLength; index++){
            System.out.print("Nhập vào giá trị các phần tử.: ");
            arrayNumber[index] = scanner.nextInt();
        }
        int valueMax = 0;
        for (int index = 0; index < valueLength; index++){
            if (arrayNumber[index] > valueMax){
                // Tìm số lớn nhất
                valueMax = arrayNumber[index];
            }
            if (arrayNumber[index] % 2 == 0){
                // Tìm các số chẵn
                arrayNumberEven.add(arrayNumber[index]);
            }else if (arrayNumber[index] % 2 != 0 && arrayNumber[index] > 0){
                // Tìm các số lẻ và tính tổng của các số lẻ đo'
                arrayNumberOdd.add(arrayNumber[index]);
                totalNunberOdd += arrayNumber[index];
            }
        }
        System.out.println("Max: " + valueMax);
        System.out.println("Tổng số (đầu + cuối) có giá trị là :" + (arrayNumber[0] + arrayNumber[valueLength - 1]));
        System.out.println("Mảng số chẵn:" + arrayNumberEven.toString());
        System.out.println("Mảng số chẵn:" + arrayNumberOdd.toString());
        System.out.println("Tổng các số lẻ lớn hơn 0 là: " + totalNunberOdd);

        for (int index = 0; index < valueLength; index++){
            for (int k = index + 1; k < valueLength; k++){
                if (arrayNumber[index] > arrayNumber[k]){
                    int temp = arrayNumber[index];
                    arrayNumber[index] = arrayNumber[k];
                    arrayNumber[k] = temp;
                }
            }
        }
        System.out.println("Mảng đã sắp xếp theo thứ tự tăng dần :" + Arrays.toString(arrayNumber));
    }

    public void importConsoleSeven(){
        System.out.print("Nhập vào số hàng : ");
        int row = scanner.nextInt();

        System.out.print("Nhập vào số cột : ");
        int column = scanner.nextInt();

        int[][] arrayNumber = new int[row][column];

        if(row <= 1){
            this.importConsoleSeven();
        }else {
            for(int index = 0; index < row; index++){
                for (int k = 0; k < column; k++){
                    System.out.print("Nhập vào giá trị: ");
                    int value = scanner.nextInt();
                    arrayNumber[index][k] = value;
                }
            }
            // Tính tổng của các phần tử trong mảng hai chiều
            int total = 0;
            int totalDivisible = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    total += arrayNumber[i][j];
                    if (arrayNumber[i][j] % 5 == 0){
                        totalDivisible += arrayNumber[i][j];
                    }
                }
                System.out.println();
            }

            System.out.println("Tổng của các phần tử trong mảng hai chiều : " + total);

            System.out.println("Tổng của các phần tử chia hết cho 5 trong mảng hai chiều : " + totalDivisible);
        }

    }

    public void importConsoleEight(){
        System.out.print("Nhập chuỗi String : ");
        String strValue = scanner.nextLine();
        int numberActiveC = 0;
        int indexFirtsC = 0;
        for (int index = 0; index < strValue.length(); index++){

            if (strValue.charAt(index) == 'c'){
                if (numberActiveC == 0){
                    indexFirtsC = index;
                    numberActiveC += 1;
                }else {
                    numberActiveC += 1;
                }
            }
        }
        System.out.println("Số lần xuất hiện của c là : " + numberActiveC);

        System.out.println("Vị trí xuất hiện đầu tiên của C là : " + indexFirtsC);
        String strValueSort = "";
        for (int index = strValue.length() - 1; index > 0; index--){
            strValueSort += strValue.charAt(index);
        }
        System.out.println("Mảng đã xắp xếp lại là : " + strValueSort);
    }
}
