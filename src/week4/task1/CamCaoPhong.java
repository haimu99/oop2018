package week4.task1;

public class CamCaoPhong extends Cam {
	private String xuatXuCamCP;
	private String mauCamCP;
	public String getXuatXuCamCP() {
		return xuatXuCamCP;
	}
	public void setXuatXuCamCP(String xuatXuCamCP) {
		this.xuatXuCamCP = xuatXuCamCP;
	}
	public String getMauCamCP() {
		return mauCamCP;
	}
	public void setMauCamCP(String mauCamCP) {
		this.mauCamCP = mauCamCP;
	}
	public CamCaoPhong(String vi, boolean coLoi, int giaCam, double soLuongCam, String xuatXuCamCP, String mauCamCP) {
		super(vi, coLoi, giaCam, soLuongCam);
		this.xuatXuCamCP = xuatXuCamCP;
		this.mauCamCP = mauCamCP;
	}
	public void getInfo() {
		System.out.println("Xuat xu cam cao phong: "+getXuatXuCamCP()+"\n");
		System.out.println("Mau cam cao phong: "+getMauCamCP()+"\n");
	}
	public boolean cungMauCamCP(CamCaoPhong qua1) {
		return this.getMauCamCP().equals(qua1.getMauCamCP());
	}
}
