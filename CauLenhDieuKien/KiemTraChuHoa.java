import java.util.Scanner;

public class KiemTraChuHoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập một ký tự
        System.out.print("Nhap mot ky tu: ");
        char ch = scanner.next().charAt(0);
        
        // Kiểm tra xem ch có phải là chữ cái in hoa không
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("'" + ch + "' la chu cai in hoa");
        } else {
            System.out.println("'" + ch + "' khong phai la chu cai in hoa");
        }
        
        scanner.close();
    }
}