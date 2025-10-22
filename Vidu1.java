import java.util.Scanner;

public class Vidu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên từ bàn phím
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen b: ");
        int b = scanner.nextInt();
        
        // Tính toán các phép tính
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        
        // In kết quả
        System.out.println("Tong cua " + a + " va " + b + " la: " + tong);
        System.out.println("Hieu cua " + a + " va " + b + " la: " + hieu);
        System.out.println("Tich cua " + a + " va " + b + " la: " + tich);
        
        // Xử lý phép chia (kiểm tra chia cho 0)
        if (b != 0) {
            double thuong = (double) a / b;
            System.out.println("Thuong cua " + a + " va " + b + " la: " + thuong);
        } else {
            System.out.println("Khong the chia cho 0");
        }
        
        scanner.close();
    }
}