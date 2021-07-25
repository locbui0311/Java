/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_cafe.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanli_cafe.ConnectionSQLServer;
import quanli_cafe.Pojo.Pojo_NhanVien;




/**
 *
 * @author LocBui
 */
public class DAO_NhanVien {
     ConnectionSQLServer c;
public DAO_NhanVien()
    {
        c=new ConnectionSQLServer("DESKTOP-GBR9EL3\\SQLEXPRESS","QL_Coffee","sa","sa2012");
    }
    public void loadData(Vector vdata)
    {
        try {
            vdata.removeAllElements();
            String sqlStm="select*from NHANVIEN";
            c.OpenConnection();
            Statement stm=c.getCon().createStatement();
            ResultSet rs=stm.executeQuery(sqlStm);
            while(rs.next())
            {
                Vector<String> v=new Vector<String>();
                String manv=rs.getString("MANV");
                String tennv=rs.getString("TENNV");
                String ngaysinh=rs.getString("NGAYSINH");
                String dienthoai=rs.getString("DIENTHOAI");
                String diachi=rs.getString("DIACHI");
                v.add(manv);
                v.add(tennv);
                v.add(ngaysinh);
                v.add(dienthoai);
                v.add(diachi);
                vdata.add(v);
            }
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addEmployee(Pojo_NhanVien x)
    {
        
        try {
            c.OpenConnection();
             String sqlInsert="insert into NHANVIEN values(?,?,?,?,?)";
            PreparedStatement ps=c.getCon().prepareStatement(sqlInsert);
            ps.setString(1, x.getManv());
            ps.setString(2, x.getTennv());
            ps.setString(3, x.getNgaysinh());
            ps.setString(4, x.getDienthoai());
            ps.setString(5, x.getDiachi());
            
            int numberRowsAffected=ps.executeUpdate();
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteEmployee(Pojo_NhanVien x)
    {
        
        try {
            c.OpenConnection();
            String sqlDelete="delete from NHANVIEN where MANV=?";
            PreparedStatement ps=c.getCon().prepareStatement(sqlDelete);
            ps.setString(1, x.getManv());
            int numberRowsAffected=ps.executeUpdate();
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateEmployee(Pojo_NhanVien x)
    {
        
        try {
            c.OpenConnection();
            String sqlUpdate="update NHANVIEN set TENNV=?,MATKHAU=?,NGAYSINH=?,DIACHI=? where MANV=?";
            PreparedStatement ps=c.getCon().prepareStatement(sqlUpdate);
            ps.setString(1, x.getManv());
            ps.setString(2, x.getTennv());
            ps.setString(3, x.getNgaysinh());
            ps.setString(4, x.getDienthoai());
            ps.setString(5, x.getDiachi());
            
            int numberRowsAffected=ps.executeUpdate();
            c.CloseConnection();
        } catch (SQLException ex) {
            
        }
    }
    public void searchEmployee(String emanv,Vector vdata)
    {
        try {
            vdata.removeAllElements();
            String sqlSearch="select*from NHANVIEN where MANV=?";
            c.OpenConnection();
            PreparedStatement ps=c.getCon().prepareStatement(sqlSearch);
            ps.setString(1, emanv);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector<String> v=new Vector<String>();
                String manv=rs.getString("MANV");
                String tennv=rs.getString("TENNV");
                String ngaysinh=rs.getString("NGAYSINH");
                String dienthoai=rs.getString("DIENTHOAI");
                String diachi=rs.getString("DIACHI");
                v.add(manv);
                v.add(tennv);
                v.add(ngaysinh);
                v.add(dienthoai);
                v.add(diachi);
                vdata.add(v);
            }
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

    

