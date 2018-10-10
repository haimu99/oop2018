package week4.task1;

public class Cam extends HoaQua{
	private int giaCam;
    private double soLuongCam;

    public int getGiaCam() {
        return giaCam;
    }

    public void setGiaCam(int giaCam) {
        this.giaCam = giaCam;
    }

    public double getSoLuongCam() {
        return soLuongCam;
    }

    public void setSoLuongCam(double soLuongCam) {
        this.soLuongCam = soLuongCam;
    }

	public Cam(String vi, boolean coLoi, int giaCam, double soLuongCam) {
		super(vi, coLoi);
		this.giaCam = giaCam;
		this.soLuongCam = soLuongCam;
	}    
	public void getInfo() {
		System.out.println("Gia cam: "+getGiaCam()+" d/kg\n");
		System.out.println("So luong cam: "+getSoLuongCam()+" kg\n");
	}
	public double giaTriCam()
	{
		return getGiaCam()*getSoLuongCam();
	}
}
