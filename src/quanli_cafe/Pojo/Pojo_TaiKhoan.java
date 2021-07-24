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
public class Pojo_TaiKhoan {
    private String tentk,tenhienthi,matkhau,loaitk;
    public Pojo_TaiKhoan()
    {
        this.tentk="Tên tài khoản";
        this.tenhienthi="Tên hiển thị";
        this.matkhau="Mật khẩu";
        this.loaitk="Tài khoản chưa phân loại";
    }
    public Pojo_TaiKhoan(String tentk,String tenhienthi,String matkhau,String loaitk)
    {
        this.tentk=tentk;
        this.tenhienthi=tenhienthi;
        this.matkhau=matkhau;
        this.loaitk=loaitk;
    }
    public Pojo_TaiKhoan(Pojo_TaiKhoan x)
    {
        this.tentk=x.tentk;
        this.tenhienthi=x.tenhienthi;
        this.matkhau=x.matkhau;
        this.loaitk=x.loaitk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public String getTenhienthi() {
        return tenhienthi;
    }

    public void setTenhienthi(String tenhienthi) {
        this.tenhienthi = tenhienthi;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getLoaitk() {
        return loaitk;
    }

    public void setLoaitk(String loaitk) {
        this.loaitk = loaitk;
    }
   
}
