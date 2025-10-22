import java.util.Scanner;

public class Vidu8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ten cua ban: ");
        String ten = scanner.nextLine().trim();  // trim() để xóa khoảng trắng thừa
        
        int doDai = ten.length();
        
        System.out.println("Ten cua ban la: '" + ten + "'");
        System.out.println("Do dai ten cua ban la: " + doDai + " ky tu");
        
        scanner.close();
    }
}