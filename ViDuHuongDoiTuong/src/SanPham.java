
public class SanPham {
		//Định nghĩa các thuộc tính
		int maSp;
		String tenSP;
		String loaiSP;
		String anhSP; //ten file ảnh
		//hàm tạo
		public SanPham() {
			//khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
			
		}
//		public SanPham(int _maSp, String _tenSP, String  _loaiSP, String _anhSP ) {
//			//khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
//			maSp = _maSp;
//			tenSP = _tenSP;
//			loaiSP = _loaiSP;
//			anhSP = _anhSP; 
//		}
		public SanPham(int maSp, String tenSP, String loaiSP, String anhSP) {
			//khởi tạo giá trị ban đầu cho các thuộc tính nếu có ở đây
			this.maSp = maSp;
			this.tenSP = tenSP;
			this.loaiSP = loaiSP;
			this.anhSP = anhSP; 
		}
		//các getter và setter
	

}
