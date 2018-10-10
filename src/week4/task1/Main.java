package week4.task1;

public class Main {
	public static void main(String[] args) {
		
	HoaQua quaXau= new HoaQua("chua", true);
	HoaQua quaOt= new HoaQua("dang", true);
	Cam camTau= new Cam("nhat", false, 5000, 100);
	Tao taoTau=new Tao("nhat", false, 6000, 100);
	CamCaoPhong camCP1=new CamCaoPhong("ngot", true, 20000, 40,"Hoa Binh", "vang nhat");
	CamCaoPhong camCP2=new CamCaoPhong("ngot", false, 18000, 100,"Trung Quoc", "vang nhat");
	CamSanh camSanh1=new CamSanh("chua", true, 15000, 80, "Tay Nam Bo","xanh dam");
	CamSanh camSanh2=new CamSanh("chua", true, 25000, 120, "Tay Bac", "xanh anh vang");
	System.out.println(quaOt.equalsTaste(quaXau));
	System.out.println(camCP1.cungMauCamCP(camCP2));
	System.out.println(camSanh1.cungMauCamSanh(camSanh2));
	camTau.getInfo();
	System.out.println(taoTau.giaTriTao());
	}
}
	
	
	
