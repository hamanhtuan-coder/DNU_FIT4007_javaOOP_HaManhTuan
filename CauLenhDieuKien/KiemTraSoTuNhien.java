import java.util.Scanner;

public class KiemTraSoTuNhien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên N
        System.out.print("Nhap so nguyen N: ");
        int n = scanner.nextInt();
        
        // Kiểm tra xem N có phải là số tự nhiên không
        // Số tự nhiên là các số >= 0
        if (n >= 0) {
            System.out.println(n + " la so tu nhien");
        } else {
            System.out.println(n + " khong phai la so tu nhien");
        }
        
        scanner.close();
    }
}