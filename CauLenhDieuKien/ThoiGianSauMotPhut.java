import java.util.Scanner;

public class ThoiGianSauMotPhut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập giờ và phút
        System.out.print("Nhap gio h (0 <= h < 24): ");
        int h = scanner.nextInt();
        
        System.out.print("Nhap phut m (0 <= m < 60): ");
        int m = scanner.nextInt();
        
        // Kiểm tra tính hợp lệ của giờ và phút
        if (h < 0 || h >= 24 || m < 0 || m >= 60) {
            System.out.println("Gio hoac phut khong hop le!");
        } else {
            // In thời gian hiện tại
            System.out.printf("Thoi gian hien tai: %02d:%02d\n", h, m);
            
            // Tính thời gian sau 1 phút
            m = m + 1;  // Tăng thêm 1 phút
            
            // Xử lý trường hợp phút vượt quá 59
            if (m >= 60) {
                m = 0;      // Reset phút về 0
                h = h + 1;  // Tăng giờ lên 1
                
                // Xử lý trường hợp giờ vượt quá 23
                if (h >= 24) {
                    h = 0;  // Reset giờ về 0 (nửa đêm)
                }
            }
            
            // In thời gian sau 1 phút
            System.out.printf("Thoi gian sau 1 phut: %02d:%02d\n", h, m);
        }
        
        scanner.close();
    }
}