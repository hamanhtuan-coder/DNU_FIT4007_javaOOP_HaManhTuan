import java.util.Scanner;

public class Vidu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhap ban kinh hinh tron
        System.out.print("Nhap ban kinh hinh tron: ");
        double banKinh = scanner.nextDouble();
        
        // Tinh chu vi va dien tich
        double chuVi = 2 * Math.PI * banKinh;
        double dienTich = Math.PI * banKinh * banKinh;
        
        // In ket qua
        System.out.println("Ban kinh hinh tron: " + banKinh);
        System.out.println("Chu vi hinh tron: " + chuVi);
        System.out.println("Dien tich hinh tron: " + dienTich);
        
        scanner.close();
    }
}