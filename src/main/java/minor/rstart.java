/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author HP
 */
@Controller

public class rstart
{
    @RequestMapping("/home")
    public String index()
    {
//        System.out.println("Hello");
        return "index";
    } 
@RequestMapping(value = "/start", method = RequestMethod.GET)
    public String start() {
        return "final_start";
    }    
    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String login() {
        return "login";
    }  
    
    @RequestMapping(value = "/sign", method = RequestMethod.GET)
    public String register() {
        return "Registration";
    } 
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "final_start";
    } 
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String successful_message() {
        return "successful_message";
    } 
    
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about_us() {
        return "aboutus";
    } 
    
    @RequestMapping(value = "/wlcm", method = RequestMethod.GET)
    public String welcom() {
        return "Welcome";
    } 
    
    
    @RequestMapping(value="/user",method=RequestMethod.POST)
    public String Handleform(
            @RequestParam("a") String a,
            @RequestParam("b") String b,
            @RequestParam("c") String c,
            @RequestParam("d") String d,
//            @RequestParam("e") String e,
            @RequestParam("f") String f,
            @RequestParam("g") String g,
            @RequestParam("h") String h,
            @RequestParam("i") String i,
            @RequestParam("j") String j,
            @RequestParam("k") String k,
            @RequestParam("l") String l,
            @RequestParam("m") String m,
            @RequestParam("n") String n,
            @RequestParam("p") String p,
            org.springframework.ui.Model object1) 
    {
        System.out.println("I am from Processform");
               
        object1.addAttribute("msg","record inserted Successfully ");
      try 
        {
            
          Class.forName("com.mysql.jdbc.Driver");
  
//step2 create  the connection object  
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minor", "root", "Monu@2003");
    PreparedStatement stmt = con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, a);
            stmt.setString(2, b);//1 specifies the first parameter in the query  
            stmt.setInt(3, Integer.parseInt(c));
            stmt.setString(4, d);
//            stmt.setInt(5, Integer.parseInt(e));
            stmt.setString(5, f);
            stmt.setString(6, g);
            stmt.setString(7, h);
            stmt.setInt(8, Integer.parseInt(i));
            stmt.setInt(9, Integer.parseInt(j));
            stmt.setInt(10, Integer.parseInt(k));
            stmt.setInt(11, Integer.parseInt(l));
            stmt.setInt(12, Integer.parseInt(m));
            stmt.setString(13, n);
            stmt.setString(14, p);

            stmt.executeUpdate();
        } catch (Exception K) {
            System.out.println(K.getMessage());
        }
        return "successful_message";
    }
    
}