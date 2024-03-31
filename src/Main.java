import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int size;
        int mang [];

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print(" Nhập kích thước mảng = ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Nhập mảng nhỏ hơn 20");
        } while (size>20);
        System.out.println();
        mang = new int[size];
        int j = 0;
        while (j < mang.length) {
            System.out.print("Phần thử thứ " + (j + 1) + ": ");
            mang[j] = sc.nextInt();
            j++;
        }
        int min = mang[0];
        int  so = 1;
        for (int i = 0 ; i < mang.length; i++){
            if (mang[i] < min){
                min = mang[i];
                so = i +1;
            }
        }
        System.out.println("Số nhỏ nhất trong mảng là " + min + ", đứng thứ " + so);

    }
}