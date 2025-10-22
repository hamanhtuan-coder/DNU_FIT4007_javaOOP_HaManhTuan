import java.util.Scanner;

public class KiemTraSoChinhPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên dương N
        System.out.print("Nhap so nguyen duong N: ");
        int n = scanner.nextInt();
        
        // Kiểm tra số chính phương
        if (n <= 0) {
            System.out.println("N phai la so nguyen duong!");
        } else {
            // Tính căn bậc 2 của N
            double canBacHai = Math.sqrt(n);
            
            // Kiểm tra xem căn bậc 2 có phải là số nguyên không
            if (canBacHai == (int)canBacHai) {
                System.out.println(n + " la so chinh phuong");
                System.out.println("Vi " + n + " = " + (int)canBacHai + "^2");
            } else {
                System.out.println(n + " khong phai la so chinh phuong");
            }
        }
        
        scanner.close();
    }
}