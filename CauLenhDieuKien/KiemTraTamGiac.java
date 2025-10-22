    import java.util.Scanner;

public class KiemTraTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập 3 số nguyên a, b, c
        System.out.print("Nhap canh a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap canh b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhap canh c: ");
        int c = scanner.nextInt();
        
        // Kiểm tra 3 số có thể là độ dài 3 cạnh của tam giác
        // Điều kiện: cả 3 số dương VÀ tổng 2 cạnh bất kỳ lớn hơn cạnh còn lại
        if (a > 0 && b > 0 && c > 0 && 
            a + b > c && 
            a + c > b && 
            b + c > a) {
            System.out.println(a + ", " + b + ", " + c + " co the la do dai 3 canh cua mot tam giac");
        } else {
            System.out.println(a + ", " + b + ", " + c + " khong the la do dai 3 canh cua mot tam giac");
        }
        
        scanner.close();
    }
}