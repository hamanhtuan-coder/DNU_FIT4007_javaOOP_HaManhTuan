import java.util.Scanner;

public class Vidu11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        
        // In giá trị ban đầu
        System.out.println("Truoc khi hoan doi: a = " + a + ", b = " + b);
        
        // Hoán đổi giá trị sử dụng biến tạm c
        int c = a;  // Lưu giá trị của a vào biến tạm c
        a = b;      // Gán giá trị của b cho a
        b = c;      // Gán giá trị cũ của a (đang lưu trong c) cho b
        
        // In giá trị sau khi hoán đổi
        System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}