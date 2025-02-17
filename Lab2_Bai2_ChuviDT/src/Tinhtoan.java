import java.util.Scanner;

public class Tinhtoan {

	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		
		//Nhập chiều dài 
		System.out.print("Nhập chiều dài: ");
		double cd = banPhim.nextDouble(); 
		//Nhập chiều rộng
		System.out.print("Nhập chiều rộng: ");
		double cr = banPhim.nextDouble(); 
		
		//tính chu vi
		double cv = (cd + cr) * 2;
		
		//tính diện tích
		double dt = cd * cr;
		
		//tính cạnh nhỏ hơn
		double canhnhohon = Math.min(cv, cr);
		
		//Xuất
		System.out.println("Kết quả tính toán: ");
		System.out.println("Chu vi hình chữ nhật: " + cv);
		System.out.println("Diện tích hình chữ nhật: " + dt);
		System.out.println("Cạnh nhỏ hơn của hình chữ nhật: " + canhnhohon);
		banPhim.close();
	}

}
