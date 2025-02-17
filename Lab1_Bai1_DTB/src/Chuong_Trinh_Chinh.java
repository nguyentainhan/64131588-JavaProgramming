import java.util.Scanner;
//Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím sau đó xuất ra màn hình.
public class Chuong_Trinh_Chinh {
	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		//Nhập họ và ên sinh viên
		System.out.print("Mời nhập họ và tên sinh viên: ");
		String hoten = banPhim.nextLine();
		
		//Tính điểm trung bình
		System.out.print("Nhập điểm trung bình: ");
		double dtb = banPhim.nextDouble();
		
		//Xuất thông tin ra màn hình
		System.out.println("Thông tin sinh viên: ");
		System.out.println("Họ và tên: "+ hoten);
		System.out.println("Điểm trung bình: " + dtb);
		
		//Đóng đối tượng scanner
		banPhim.close();
	}

}
