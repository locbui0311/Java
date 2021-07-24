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
public class Pojo_SanPham {
    private String masp,tensp,madanhmuc;
    private float giasp;
    public Pojo_SanPham()
    {
        this.masp="Sản phẩm chưa có mã";
        this.tensp="Sản phẩm chưa có tên";
        this.madanhmuc="Sản phẩm chưa phân loại";
        this.giasp=0;
    }
    public Pojo_SanPham(String masp,String tensp,String madanhmuc,float giasp)
    {
        this.masp=masp;
        this.tensp=tensp;
        this.madanhmuc=madanhmuc;
        this.giasp=giasp;
    }
     public Pojo_SanPham(Pojo_SanPham x)
    {
        this.masp=x.masp;
        this.tensp=x.tensp;
        this.madanhmuc=x.madanhmuc;
        this.giasp=x.giasp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(String madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public float getGiasp() {
        return giasp;
    }

    public void setGiasp(float giasp) {
        this.giasp = giasp;
    }
    
}
