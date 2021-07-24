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
public class Pojo_DanhMuc {
    private String madanhmuc,tendanhmuc;
    public Pojo_DanhMuc()
    {
        this.madanhmuc="Danh mục chưa có mã";
        this.tendanhmuc="Danh mục chưa đặt tên";
    }
    public Pojo_DanhMuc(String madanhmuc,String tendanhmuc)
    {
        this.madanhmuc=madanhmuc;
        this.tendanhmuc=tendanhmuc;
    }
    public Pojo_DanhMuc(Pojo_DanhMuc x)
    {
        this.madanhmuc=x.madanhmuc;
        this.tendanhmuc=x.tendanhmuc;
    }

    public String getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(String madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }
    
}
