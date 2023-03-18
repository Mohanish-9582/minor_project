/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        System.out.println("Hello");
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
    
}