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
public class Pojo_KhachHang {
    private String makh,tenkh;
    public Pojo_KhachHang()
    {
        this.makh="Khách hàng chưa có mã";
        this.tenkh="Khách hàng chưa có tên";
    }
    public Pojo_KhachHang(String makh,String tenkh)
    {
        this.makh=makh;
        this.tenkh=tenkh;
    }
    public Pojo_KhachHang(Pojo_KhachHang x)
    {
        this.makh=x.makh;
        this.tenkh=x.tenkh;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
    
}
