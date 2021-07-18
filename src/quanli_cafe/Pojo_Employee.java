/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanli_cafe;

/**
 *
 * @author LocBui
 */
public class Pojo_Employee {
    private String username,displayname,password,type;
    public Pojo_Employee()
    {
        username=displayname=password=type=" ";
    }
    public Pojo_Employee(String username,String displayname,String password,String type)
    {
        this.username=username;
        this.displayname=displayname;
        this.password=password;
        this.type=type;
    }
    public Pojo_Employee(Pojo_Employee x)
    {
        this.username=x.username;
        this.displayname=x.displayname;
        this.password=x.password;
        this.type=x.type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayname;
    }

    public void setDisplayName(String displayname) {
        this.displayname = displayname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type= type;
    }
    
    
}
