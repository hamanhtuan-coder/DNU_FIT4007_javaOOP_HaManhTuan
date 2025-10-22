import java.util.Scanner;

public class Vidu7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên N
        System.out.print("Nhap so nguyen N (co it nhat 2 chu so): ");
        int n = scanner.nextInt();
        
        // Kiểm tra số có ít nhất 2 chữ số không
        if (Math.abs(n) < 10) {
            System.out.println("So phai co it nhat 2 chu so!");
        } else {
            // Lấy giá trị tuyệt đối để xử lý số âm
            int soDuong = Math.abs(n);
            
            // Loại bỏ chữ số cuối cùng bằng cách chia cho 10
            int soSauKhiBoChuSoCuoi = soDuong / 10;
            
            // Lấy chữ số cuối cùng của số mới (chính là chữ số gần cuối của số ban đầu)
            int chuSoGanCuoi = soSauKhiBoChuSoCuoi % 10;
            
            // In kết quả
            System.out.println("Chu so gan cuoi cua " + n + " la: " + chuSoGanCuoi);
        }
        
        scanner.close();
    }
}