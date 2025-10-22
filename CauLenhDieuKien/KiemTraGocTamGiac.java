import java.util.Scanner;

public class KiemTraGocTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập 3 số nguyên a, b, c
        System.out.print("Nhap goc a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap goc b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhap goc c: ");
        int c = scanner.nextInt();
        
        // Kiểm tra 3 số có thể là độ lớn 3 góc của tam giác
        // Điều kiện: cả 3 số dương VÀ tổng bằng 180 độ
        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println(a + ", " + b + ", " + c + " co the la do lon 3 goc cua mot tam giac");
        } else {
            System.out.println(a + ", " + b + ", " + c + " khong the la do lon 3 goc cua mot tam giac");
        }
        
        scanner.close();
    }
}