import java.util.Scanner;

public class KiemTraSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên N
        System.out.print("Nhap so nguyen N: ");
        int n = scanner.nextInt();
        
        // Kiểm tra số chẵn bằng phép chia lấy dư cho 2
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
        
        scanner.close();
    }
}