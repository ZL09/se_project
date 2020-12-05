package models;
import java.util.Date;

public class PhanThuongModel{
    private int ID;
    private int idDsThuong;
    private int idNguoiNhan;
    private String tenPhanThuong;
    private String thanhTich;
    private int giaTriPhanThuong;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenPhanThuong() {
        return tenPhanThuong;
    }

    public void setTenPhanThuong(String tenPhanThuong) {
        this.tenPhanThuong = tenPhanThuong;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    public int getGiaTriPhanThuong() {
        return giaTriPhanThuong;
    }

    public void setGiaTriPhanThuong(int giaTriPhanThuong) {
        this.giaTriPhanThuong = giaTriPhanThuong;
    }

    public int getIdDsThuong() {
        return idDsThuong;
    }

    public void setIdDsThuong(int idDsThuong) {
        this.idDsThuong = idDsThuong;
    }

    public int getIdNguoiNhan() {
        return idNguoiNhan;
    }

    public void setIdNguoiNhan(int idNguoiNhan) {
        this.idNguoiNhan = idNguoiNhan;
    }
}