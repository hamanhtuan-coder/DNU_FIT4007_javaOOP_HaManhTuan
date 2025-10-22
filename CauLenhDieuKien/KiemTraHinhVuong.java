import java.util.Scanner;

public class KiemTraHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài và chiều rộng
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = scanner.nextDouble();
        
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = scanner.nextDouble();
        
        // Kiểm tra xem có phải là hình vuông không
        if (chieuDai == chieuRong) {
            System.out.println("Day la hinh vuong");
        } else {
            System.out.println("Day la hinh chu nhat (khong phai hinh vuong)");
        }
        
        scanner.close();
    }
}