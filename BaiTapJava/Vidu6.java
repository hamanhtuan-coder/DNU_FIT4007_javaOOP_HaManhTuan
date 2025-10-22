import java.util.Scanner;

public class Vidu6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên N
        System.out.print("Nhap so nguyen N: ");
        int n = scanner.nextInt();
        
        // Lấy chữ số cuối cùng bằng phép chia lấy dư cho 10
        // Dùng Math.abs() để xử lý số âm
        int chuSoCuoi = Math.abs(n) % 10;
        
        // In kết quả
        System.out.println("Chu so cuoi cung cua " + n + " la: " + chuSoCuoi);
        
        scanner.close();
    }
}