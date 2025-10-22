import java.util.Scanner;

public class Vidu10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ky tu thuong (tu 'a' den 'z'): ");
        char ch = scanner.next().charAt(0);
        
        if (ch >= 'a' && ch < 'z') {
            char kyTuLienSau = (char)(ch + 1);
            System.out.println("Ky tu lien sau '" + ch + "' la: '" + kyTuLienSau + "'");
        } else if (ch == 'z') {
            System.out.println("'z' la ky tu cuoi cung, khong co ky tu lien sau!");
        } else {
            System.out.println("Ky tu nhap vao khong hop le!");
        }
        
        scanner.close();
    }
}