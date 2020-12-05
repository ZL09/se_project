package models;
import java.util.Date;

public class PhanQuaModel {
    private int ID;
    private int idDsQua;
    private int idNguoiNhan;
    private int giaTriQua;
    private String tenPhanQua;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGiaTriQua() {
        return giaTriQua;
    }

    public void setGiaTriQua(int giaTriQua) {
        this.giaTriQua = giaTriQua;
    }

    public String getTenPhanQua() {
        return tenPhanQua;
    }

    public void setTenPhanQua(String tenPhanQua) {
        this.tenPhanQua = tenPhanQua;
    }

    public int getIdDsQua() {
        return idDsQua;
    }

    public void setIdDsQua(int idDsQua) {
        this.idDsQua = idDsQua;
    }

    public int getIdNguoiNhan() {
        return idNguoiNhan;
    }

    public void setIdNguoiNhan(int idNguoiNhan) {
        this.idNguoiNhan = idNguoiNhan;
    }
}
