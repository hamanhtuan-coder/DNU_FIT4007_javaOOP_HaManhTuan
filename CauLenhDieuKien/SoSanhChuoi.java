import java.util.Scanner;

public class SoSanhChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap chuoi a: ");
        String a = scanner.nextLine();
        
        System.out.print("Nhap chuoi b: ");
        String b = scanner.nextLine();
        
        // So sánh bằng equals (phân biệt hoa thường)
        if (a.equals(b)) {
            System.out.println("Hai chuoi GIONG nhau hoan toan");
        } else {
            System.out.println("Hai chuoi KHAC nhau");
            
            // So sánh không phân biệt hoa thường
            if (a.equalsIgnoreCase(b)) {
                System.out.println("Nhung giong nhau khi khong phan biet hoa thuong");
            }
            
            // So sánh độ dài
            if (a.length() == b.length()) {
                System.out.println("Hai chuoi co cung do dai: " + a.length() + " ky tu");
            } else {
                System.out.println("Do dai khac nhau: a = " + a.length() + ", b = " + b.length());
            }
        }
        
        scanner.close();
    }
}