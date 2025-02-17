import java.util.Scanner;

public class TinhTheTich {

	public static void main(String[] args) {
		Scanner banPhim = new Scanner(System.in);
		//Nhập độ dài cạnh của khối lập phương
		System.out.print("Nhập độ dài cạnh: ");
		double dodai = banPhim.nextDouble();
		
		//tính thể tích khối lập phương
		double thetich = Math.pow(dodai, 3); //dùng math.pow để tính lũy thừa bậc 3
		
		//Xuất
		System.out.println("Thể tích của khối lập phương: "+ thetich);
		
		banPhim.close();
		
	}

}
