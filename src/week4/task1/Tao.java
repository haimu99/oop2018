package week4.task1;

public class Tao extends HoaQua{
	private int giaTao;
	private double soLuongTao;
	public int getGiaTao() {
		return giaTao;
	}
	public void setGiaTao(int giaTao) {
		this.giaTao = giaTao;
	}
	public double getSoLuongTao() {
		return soLuongTao;
	}
	public void setSoLuongTao(double soLuongTao) {
		this.soLuongTao = soLuongTao;
	}
	public Tao(String vi, boolean coLoi, int giaTao, double soLuongTao) {
		super(vi, coLoi);
		this.giaTao = giaTao;
		this.soLuongTao = soLuongTao;
	}
	//in thong tin tao
	public void getInfo() {
		System.out.println("Gia tao: "+getGiaTao()+"d/kg\n");
		System.out.println("So luong tao: "+getSoLuongTao()+"kg\n");
	}
	//tong gia tri so tao dang co
	public double giaTriTao() {
		return getGiaTao()*getSoLuongTao();
	}
}
