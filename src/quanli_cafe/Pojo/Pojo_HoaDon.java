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
public class Pojo_HoaDon {
    private String mahd,ngaytao,manv,makh,maban,trangthai;
    private float tongtien;
    public Pojo_HoaDon()
    {
        this.mahd="";
        this.ngaytao="";
        this.manv="";
        this.makh="";
        this.maban="";
        this.tongtien=0;
        this.trangthai="Hóa đơn trống";
    }
    public Pojo_HoaDon(String mahd,String ngaytao,String manv,String makh,String maban,float tongtien,String trangthai)
    {
        this.mahd=mahd;
        this.ngaytao=ngaytao;
        this.manv=manv;
        this.makh=makh;
        this.maban=maban;
        this.tongtien=tongtien;
        this.trangthai=trangthai;
    }
    public Pojo_HoaDon(Pojo_HoaDon x)
    {
        this.mahd=x.mahd;
        this.ngaytao=x.ngaytao;
        this.manv=x.manv;
        this.makh=x.makh;
        this.maban=x.maban;
        this.tongtien=x.tongtien;
        this.trangthai=x.trangthai;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }
    

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
