import java.util.Scanner;

public class Vidu12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        
        // In giá trị ban đầu
        System.out.println("Truoc khi hoan doi: a = " + a + ", b = " + b);
        
        // Hoán đổi giá trị KHÔNG dùng biến phụ
        a = a + b;  // Bước 1: a bây giờ là tổng của a và b
        b = a - b;  // Bước 2: b = (a + b) - b = a (giá trị ban đầu của a)
        a = a - b;  // Bước 3: a = (a + b) - a = b (giá trị ban đầu của b)
        
        // In giá trị sau khi hoán đổi
        System.out.println("Sau khi hoan doi: a = " + a + ", b = " + b);
        
        scanner.close();
    }
}