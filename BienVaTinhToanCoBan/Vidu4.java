import java.util.Scanner;

public class Vidu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập 3 cạnh của tam giác
        System.out.print("Nhap canh thu nhat: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhap canh thu hai: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhap canh thu ba: ");
        double c = scanner.nextDouble();
        
        // Kiểm tra điều kiện tam giác
        if (a + b > c && a + c > b && b + c > a) {
            // Tính chu vi
            double chuVi = a + b + c;
            
            // Tính diện tích theo công thức Heron
            double p = chuVi / 2; // nửa chu vi
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            
            // In kết quả
            System.out.println("Chu vi tam giac: " + chuVi);
            System.out.println("Dien tich tam giac: " + dienTich);
        } else {
            System.out.println("Ba canh vua nhap khong tao thanh mot tam giac hop le!");
        }
        
        scanner.close();
    }
}