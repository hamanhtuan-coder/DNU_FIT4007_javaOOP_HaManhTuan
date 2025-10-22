import java.util.Scanner;

public class Vidu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chiều dài và chiều rộng
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = scanner.nextDouble();
        
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = scanner.nextDouble();
        
        // Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;
        
        // In kết quả
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        
        scanner.close();
    }
}