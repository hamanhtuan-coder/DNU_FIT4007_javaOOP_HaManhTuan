import java.util.Scanner;

public class TimSoLonHon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        
        // Tìm số lớn hơn bằng câu lệnh điều kiện
        if (a > b) {
            System.out.println("So lon hon la: " + a);
        } else if (b > a) {
            System.out.println("So lon hon la: " + b);
        } else {
            System.out.println("Hai so bang nhau: " + a + " = " + b);
        }
        
        scanner.close();
    }
}