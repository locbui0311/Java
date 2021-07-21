/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_cafe;

/**
 *
 * @author LocBu
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.Vector;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Administrator
 */
public class DAO_Employee {
    ConnectionSQLServer c;
    public DAO_Employee()
    {
        c=new ConnectionSQLServer("DESKTOP-GBR9EL3\\SQLEXPRESS","QuanLyQuanCafe","sa","sa2012");
    }
    public void loadData(Vector vdata)
    {
        try {
            vdata.removeAllElements();
            String sqlStm="select*from Account";
            c.OpenConnection();
            Statement stm=c.getCon().createStatement();
            ResultSet rs=stm.executeQuery(sqlStm);
            while(rs.next())
            {
                Vector<String> v=new Vector<String>();
                String username=rs.getString("Username");
                String displayname=rs.getString("DisplayName");
                String password=rs.getString("Password");
                String type=rs.getString("Type");
                v.add(username);
                v.add(displayname);
                v.add(password);
                v.add(type);
                vdata.add(v);
            }
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addEmployee(Pojo_Employee x) //Button Thêm
    {
        
        try {
            c.OpenConnection();
             String sqlInsert="insert into Account values(?,?,?,?)";
            PreparedStatement ps=c.getCon().prepareStatement(sqlInsert);
            ps.setString(1, x.getUsername());
            ps.setString(2, x.getDisplayName());
            ps.setString(3, x.getPassword());
            ps.setString(4, x.getType());
            int numberRowsAffected=ps.executeUpdate();
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteEmployee(Pojo_Employee x) //Button xóa
    {
        
        try {
            c.OpenConnection();
            String sqlDelete="delete from Account where Username=?";
            PreparedStatement ps=c.getCon().prepareStatement(sqlDelete);
            ps.setString(1, x.getUsername());
            int numberRowsAffected=ps.executeUpdate();
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateEmployee(Pojo_Employee x) //Button uppdate
    {
        
        try {
            c.OpenConnection();
            String sqlUpdate="update Account set DisplayName=?,Password=?,Type=? where Username=?";
            PreparedStatement ps=c.getCon().prepareStatement(sqlUpdate);
            ps.setString(1, x.getDisplayName());
            ps.setString(2, x.getPassword());
            ps.setString(3, x.getType());
            ps.setString(4, x.getUsername());
            
            int numberRowsAffected=ps.executeUpdate();
            c.CloseConnection();
        } catch (SQLException ex) {
            
        }
    }
    public void searchEmployee(String eusername,Vector vdata) //Button search
    {
        try {
            vdata.removeAllElements();
            String sqlSearch="select*from Account where Username=?";
            c.OpenConnection();
            PreparedStatement ps=c.getCon().prepareStatement(sqlSearch);
            ps.setString(1, eusername);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Vector<String> v=new Vector<String>();
                String username=rs.getString("Username");
                String displayname=rs.getString("DisplayName");
                String password=rs.getString("Password");
                String type=rs.getString("Type");
                v.add(username);
                v.add(displayname);
                v.add(password);
                v.add(type);
                vdata.add(v);
            }
            c.CloseConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
