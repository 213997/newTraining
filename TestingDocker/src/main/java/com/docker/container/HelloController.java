package com.docker.container;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	
	
	@RequestMapping("/{name}")
	public String getNameAndTime(@PathVariable String name) {
		//String name="";
		String time = new SimpleDateFormat("yyyy-MM-dd<>HH:mm:ss").format(Calendar.getInstance().getTime());
		return name+ " Current Time is - " +time;
	}

}
