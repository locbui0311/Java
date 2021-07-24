
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
public class Pojo_Tra extends Pojo_SanPham{
     public Pojo_Tra()
    {
        super();
    }
    public Pojo_Tra(String masp,String tensp,String madanhmuc,float giasp)
    {
        super(masp,tensp,madanhmuc,giasp);
    }
    @Override
    public String getMasp() {
        return super.getMasp(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMasp(String masp) {
        super.setMasp(masp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTensp() {
        return super.getTensp(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTensp(String tensp) {
        super.setTensp(tensp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMadanhmuc() {
        return super.getMadanhmuc(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMadanhmuc(String madanhmuc) {
        super.setMadanhmuc(madanhmuc); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getGiasp() {
        return super.getGiasp(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGiasp(float giasp) {
        super.setGiasp(giasp); //To change body of generated methods, choose Tools | Templates.
    }
    
}
