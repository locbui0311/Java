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
public class Pojo_BanKhach {
    private String maban,tenban,trangthai;
    public Pojo_BanKhach()
    {
        this.maban="Bàn chưa có mã";
        this.tenban="Bàn chưa đặt tên";
        this.trangthai="Bàn trống";              
    }
    public Pojo_BanKhach(String maban,String tenban,String trangthai)
    {
        this.maban=maban;
        this.tenban=tenban;
        this.trangthai=trangthai;
    }
    public Pojo_BanKhach(Pojo_BanKhach x)
    {
        this.maban=x.maban;
        this.tenban=x.tenban;
        this.trangthai=x.trangthai;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public String getTenban() {
        return tenban;
    }

    public void setTenban(String tenban) {
        this.tenban = tenban;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
   
}
