package com.ninja.springboot_app_SBU;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facebook")
public class MyController
{
	@RequestMapping("/test")
	public String test()
	{
		return "this is test1";
	}
	@RequestMapping("/about")
	public String test1()
	{
		return "this is test2";
	}

	@RequestMapping("/home")
	public String tes2t()
	{
		return "this is tes3t";
	}


}
