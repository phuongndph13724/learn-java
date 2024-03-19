import exercise.javabasic.ExerciseBasic;

public class Router {
    String route;

    public Router(String route){
        this.route = route;
    }

    public void pathRedirection(){
        if (this.route == "one"){
            pathRedirectionOne();
        }
    }

    private void pathRedirectionOne(){
        // Bài tập ngày 18/03/2024 02:13
        ExerciseBasic exerciseBasic = new ExerciseBasic();
        /*
        * 1. Viết chương trình nhập vào từ bàn phím một số nguyên n trong khoảng từ 1 đến 100. Sau đó kiểm tra:
            - Nếu n là số lẻ, in ra màn hình "Odd"
            - Nếu n là số chẵn trong khoảng từ 1 đến 30, in ra màn hình "Small Even"
            - Nếu n là số chẵn trong khoảng từ 31 đến 60, in ra màn hình "Medium Even"
            - Nếu n là số chẵn trong khoảng từ 61 đến 100, in ra màn hình "Big Even"
            Yêu cầu: Chương trình chạy được và bắt hết các trường hợp ngoại lệ
        * */
//        exerciseBasic.importConsoleOne(); // Kết quả bài 1

        /*
         * 2. Viết chương trình nhập vào tên của 2 người, kiểm tra xem tên của 2 người này có giống nhau không.
         * */
//        exerciseBasic.importConsoleTwo(); // Kêt quả bài 2

        /*
         * Cho biến x và y kiểu số nguyên được nhập vào từ bàn phím (cả x và y đều khác 0)..
         * Xác định điểm có tọa độ (x, y) đó nằm ở góc phần tư nào (Hình 1)
         * */
//        exerciseBasic.importConsoleThree(); // Kêt quả bài 3

        /*
         4. Viết chương trình hiển thị ra màn hình các số từ 0 tới 24 giống như sau:
            0 1 2 3 4
            5 6 7 8 9
            10 11 12 13 14
            15 16 17 18 19
            20 21 22 23 24
            Yêu cầu: Không in ra thủ công. VD:
            print(0, 1, 2, 3, 4)
            print(5, 6, 7, 8, 9)
            ...
         */
//        exerciseBasic.importConsoleFour(); // Kêt quả bài 4

        /*
         * Viết chương trình hiển thị ra màn hình các số có số 0 ở cuối từ 1 tới 100 (màn hình sẽ hiển thị lên các số 10, 20, 30, ..., 90, 100)
         * */
//        exerciseBasic.importConsoleFive();// Kêt quả bài 5

        /*
         *6. Cho một mảng các số nguyên n phần tử được nhập từ bàn phím. Viết chương trình hiển thị ra:
            - Phần tử lớn nhất trong mảng.
            - Tổng của phần tử đầu tiên và cuối cùng trong mảng.
            - Những số chẵn trong mảng.
            - Tổng các số lẻ lớn hơn 0 trong mảng.
            - Mảng được sắp xếp theo thứ tự tăng dần.
         * */
//        exerciseBasic.importConsoleSix(); // Kêt quả bài 6

        /*
         *7. Cho một mảng 2 chiều các số nguyên với n hàng m cột (n, m và các phần tử trong mảng được nhập từ bàn phím). Viết chương trình tính:
            - Tổng các phần tử trong mảng.
            - Tổng các phần tử chia hết cho 5.
         * */
//         exerciseBasic.importConsoleSeven();// Kêt quả bài 7

        /*
         *8. Cho chuỗi s và ký tự c được nhập từ bàn phím. Viết chương trình in ra:
            - Số lần xuất hiện của ký tự c trong chuỗi s.
            - Vị trí đầu tiên mà ký tự c xuất hiện trong chuỗi s.
            - Chuỗi s bị đảo ngược.
         * */
         exerciseBasic.importConsoleEight(); // Kêt quả bài 8

    }

}
