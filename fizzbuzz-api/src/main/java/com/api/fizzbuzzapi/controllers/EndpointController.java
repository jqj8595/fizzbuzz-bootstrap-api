package com.api.fizzbuzzapi.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.fizzbuzzapi.FizzBuzz;

@RestController
@RequestMapping("/api")
public class EndpointController  {
	@Value("${spring.application.name}")
	public String appName;
	
	/**
	 * Returns a description of the application.
	 * @param model
	 * @return
	 */
	@GetMapping("/fizz")
	 public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "Nishans Fizz Buzz Spring Boot Application\nUse Path: /api/fizz/{number} proviing a number as the limit";
    }
	
	
	/**
	 * Returns the fizz buzz sequence up to the given value passed in the path variable upperLimit.
	 * @param upperLimit
	 * @return
	 */
	@GetMapping("/fizz/{upperLimit}")
	public String fizzGenerate(@PathVariable int upperLimit) {
		
		FizzBuzz fizzbuzz = new FizzBuzz("fizz", "buzz", "fizz buzz");
		List<String> fizzResult = new ArrayList<String>();
		
		for(int i=1; i<upperLimit+1; i++) {
			if(i%3 ==0) {
				fizzResult.add(fizzbuzz.getFizz());
			}
			else if(i%5==0) {
				fizzResult.add(fizzbuzz.getBuzz());
			}
			else if(i%15 ==0) {
				fizzResult.add(fizzbuzz.getFizzBuzz());
			}
			else {
				fizzResult.add(Integer.toString(i));
			}
		}
		return  fizzResult +"";
	}

}
