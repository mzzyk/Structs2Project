package com;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction  extends ActionSupport{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
     
    public String execute() 
    
    {
    	System.out.println("sdfasdfasdf");
        if(getUsername().equals("tom") && getPassword().equals("111111")){
            return "success";
        }else{
            return "error" ;
        }
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
     
     
     
}