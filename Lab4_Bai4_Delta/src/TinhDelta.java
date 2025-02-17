import java.util.Scanner;

public class TinhDelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner banPhim = new Scanner(System.in);
		
		//Nhập hệ số a,b,c
		System.out.print("Nhập a: ");
		double a = banPhim.nextDouble();
		System.out.print("Nhập b: ");
		double b = banPhim.nextDouble();
		System.out.print("Nhập c: ");
		double c = banPhim.nextDouble();
		
		//Tính delta
		double delta = b*b-4*a*c;
		System.out.println("Giá trị của delta là: "+ delta);
		
		//kiểm tra và xuất căn delta
		if(delta >= 0) {
			double sqrtDelta = Math.sqrt(delta);
			System.out.println("Căn delta là: "+ sqrtDelta);
		}else {
			System.out.println("Delta âm, không hể tính căn delta.");
		}
		banPhim.close();
	}

}
