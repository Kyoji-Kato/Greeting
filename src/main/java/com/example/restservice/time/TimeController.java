package com.example.restservice.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TimeController {


	@GetMapping("/time")
	public Time time() {
		return new Time(1, "time is secret");
	}
}
