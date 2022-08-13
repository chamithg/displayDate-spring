package com.codingdojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DisplayDateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayDateApplication.class, args);
	}
	
	// class definition and imports here...
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/date")
    public String date(Model model) {
    	Date currentDate = new Date();
    	SimpleDateFormat DateFor = new SimpleDateFormat("E, dd MMM yyyy ");
    	String stringDate= DateFor.format(currentDate);
    	model.addAttribute("date",stringDate);
        return "date.jsp";
    }
    @RequestMapping("/time")
    public String time(Model model) {
    	Date currentTime = new Date();
    	SimpleDateFormat DateFor = new SimpleDateFormat("HH:mm:ss");
    	String stringTime= DateFor.format(currentTime);
    	model.addAttribute("time",stringTime);
    	
    	
        return "time.jsp";
    }
    //...
    

	
	


}
