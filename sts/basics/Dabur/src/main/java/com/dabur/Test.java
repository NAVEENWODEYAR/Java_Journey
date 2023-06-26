package com.dabur;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("/t")
	public int hlo()
	{
		System.out.println("My age is.,");
		return 25;
	}
}
