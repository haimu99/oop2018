package week4.task1;

/**
 * Package bài làm cho Câu 1 TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu.
 * 1 file chỉ khai báo 1 class TODO: Mô tả các quan hệ giữa các class và thêm
 * thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc
 * tính) TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây
 * (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * 
 * @author cuong
 * @version 0.1
 */

public class HoaQua {
	private String vi;
	private boolean coLoi;

	public String getVi() {
		return vi;
	}

	public void setVi(String vi) {
		this.vi = vi;
	}

	public boolean isCoLoi() {
		return coLoi;
	}

	public void setCoLoi(boolean coLoi) {
		this.coLoi = coLoi;
	}

	public HoaQua(String vi, boolean coLoi) {
		this.vi = vi;
		this.coLoi = coLoi;
	}

	public void getInfo() {
		//in thong tin hoa qua
		System.out.println("Qua co vi: " + getVi() + "\n");
		System.out.println("Qua co loi hay khong: " + isCoLoi() + "\n");
	}
	// 2 hoa qua co cung vi khong?
	public boolean equalsTaste(HoaQua h1) {
		return this.getVi().equals(h1.getVi());
	}
}
