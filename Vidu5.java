import java.util.Scanner;

public class Vidu5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập tuổi của sinh viên
        System.out.print("Nhap tuoi cua sinh vien (tinh den nam 2023): ");
        int tuoi = scanner.nextInt();
        
        // Tính năm sinh
        int namHienTai = 2023;
        int namSinh = namHienTai - tuoi;
        
        // In kết quả
        System.out.println("Tuoi cua sinh vien: " + tuoi);
        System.out.println("Nam sinh cua sinh vien: " + namSinh);
        
        scanner.close();
    }
}