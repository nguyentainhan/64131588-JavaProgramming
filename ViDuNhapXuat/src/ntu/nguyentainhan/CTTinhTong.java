package ntu.nguyentainhan;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		//In ra 1 dòng tiêu đề app
		System.out.print("CT TINH TONG \n");
		//Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		//In dong huong dan moi nhap A
		System.out.println("Mời nhập a: ");
		double a = banPhim.nextDouble();
		System.out.println("Mời nhập b: ");
		double b = banPhim.nextDouble();
		//Tính toán
		double tong = a + b;
		//Xuất
		System.out.print("Tổng là: ");
		System.out.print(tong);
	}

}
