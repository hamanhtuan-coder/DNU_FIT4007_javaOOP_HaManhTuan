import java.util.Scanner;

public class KiemTraChuThuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập một ký tự
        System.out.print("Nhap mot ky tu: ");
        char ch = scanner.next().charAt(0);
        
        // Kiểm tra xem ch có phải là chữ cái in thường không
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("'" + ch + "' la chu cai in thuong");
        } else {
            System.out.println("'" + ch + "' khong phai la chu cai in thuong");
        }
        
        scanner.close();
    }
}