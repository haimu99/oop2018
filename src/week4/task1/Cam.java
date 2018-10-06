/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Minh1082QN
 */
public class Cam extends HoaQua{
    private int gia;
    private double soLuong;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public Cam(int gia, double soLuong, String loaiQua, String vi, boolean coLoi) {
        super(loaiQua, vi, coLoi);
        this.gia = gia;
        this.soLuong = soLuong;
    }
    
}
