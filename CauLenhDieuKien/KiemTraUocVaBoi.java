import java.util.Scanner;

public class KiemTraUocVaBoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập 3 số nguyên dương a, b, c
        System.out.print("Nhap so nguyen duong a: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhap so nguyen duong b: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhap so nguyen duong c: ");
        int c = scanner.nextInt();
        
        // Kiểm tra điều kiện
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Cac so phai la so nguyen duong!");
        } else {
            // Kiểm tra: b là ước của a VÀ b là bội của c
            boolean bLaUocCuaA = (a % b == 0);  // a chia hết cho b
            boolean bLaBoiCuaC = (b % c == 0);  // b chia hết cho c
            
            if (bLaUocCuaA && bLaBoiCuaC) {
                System.out.println("b = " + b + " dong thoi la uoc cua a = " + a + " va la boi cua c = " + c);
            } else {
                System.out.println("b = " + b + " KHONG dong thoi la uoc cua a = " + a + " va boi cua c = " + c);
                
                // In chi tiết lý do
                if (!bLaUocCuaA) {
                    System.out.println("- Vi " + a + " KHONG chia het cho " + b);
                }
                if (!bLaBoiCuaC) {
                    System.out.println("- Vi " + b + " KHONG chia het cho " + c);
                }
            }
        }
        
        scanner.close();
    }
}