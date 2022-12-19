package com.blog.blogappapis.controllers;
import org.springframework.web.bind.annotation.*;
@RestController
public class firstController {
	@GetMapping("/welcome")
	public String first_api() {
		return "Welcome to my first Api project";
}

}
