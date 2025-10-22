import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số thực
        System.out.print("Nhap so thuc: ");
        double number = scanner.nextDouble();
        
        // Kiểm tra xem số thực có phải là số nguyên không
        // Bằng cách so sánh số thực với phần nguyên của nó
        if (number == (int)number) {
            System.out.println(number + " la so nguyen");
        } else {
            System.out.println(number + " khong phai la so nguyen");
        }
        
        scanner.close();
    }
}