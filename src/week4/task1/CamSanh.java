package week4.task1;

public class CamSanh extends Cam{
	private String xuatXuCamSanh;
	private String mauCamSanh;
	public String getXuatXuCamSanh() {
		return xuatXuCamSanh;
	}
	public void setXuatXuCamSanh(String xuatXuCamSanh) {
		this.xuatXuCamSanh = xuatXuCamSanh;
	}
	public String getMauCamSanh() {
		return mauCamSanh;
	}
	public void setMauCamSanh(String mauCamSanh) {
		this.mauCamSanh = mauCamSanh;
	}

	public CamSanh(String vi, boolean coLoi, int giaCam, double soLuongCam, String xuatXuCamSanh, String mauCamSanh) {
		super(vi, coLoi, giaCam, soLuongCam);
		this.xuatXuCamSanh = xuatXuCamSanh;
		this.mauCamSanh = mauCamSanh;
	}
	// in thong in cam sanh
	public void getInfo() {
		System.out.println("Xuat xu cam sanh: "+getXuatXuCamSanh()+"\n");
		System.out.println("Mau cam sanh: "+getMauCamSanh()+"\n");
	}
	//2 loai cam sanh co cung mau ko?
	public boolean cungMauCamSanh(CamSanh qua1) {
		return this.getMauCamSanh().equals(qua1.getMauCamSanh());
	}
}
