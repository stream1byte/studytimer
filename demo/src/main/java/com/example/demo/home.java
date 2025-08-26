package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class home {

    @GetMapping("home")
	public String home() {
		return "/home";
	}
	
    @GetMapping("timer")
    public String timer() {
    	return "/timer";
    }
    
    @GetMapping("stopwatch")
    public String stopwatch() {
    	return "/stopwatch";
    }
}
