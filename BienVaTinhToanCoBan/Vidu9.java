import java.util.Scanner;

public class Vidu9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số nguyên a và b
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen b (b khac 0): ");
        int b = scanner.nextInt();
        
        // Kiểm tra b khác 0
        if (b == 0) {
            System.out.println("b phai khac 0!");
        } else {
            // Tính kết quả và in ra chỉ với MỘT lệnh println
            double ketQua = (double) a / b;
            System.out.println(a + " / " + b + " = " + ketQua);
        }
        
        scanner.close();
    }
}