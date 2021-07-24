/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_cafe.Pojo;

/**
 *
 * @author Administrator
 */
public class Pojo_NhanVien {
    private String manv,tennv,ngaysinh,dienthoai,diachi;
    public Pojo_NhanVien()
    {
        this.manv="Nhân viên chưa có mã";
        this.tennv="Nhân viên chưa có tên";
        this.ngaysinh="Nhân viên chưa có ngày sinh";
        this.dienthoai="Trống";
        this.diachi="Nhân viên chưa có địa chỉ";
    }
    public Pojo_NhanVien(String manv,String tennv,String ngaysinh,String dienthoai,String diachi)
    {
        this.manv=manv;
        this.tennv=tennv;
        this.ngaysinh=ngaysinh;
        this.dienthoai=dienthoai;
        this.diachi=diachi;
    }
    public Pojo_NhanVien(Pojo_NhanVien x)
    {
        this.manv=x.manv;
        this.tennv=x.tennv;
        this.ngaysinh=x.ngaysinh;
        this.dienthoai=x.dienthoai;
        this.diachi=x.diachi;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
