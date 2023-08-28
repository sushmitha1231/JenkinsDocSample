package com.dockerProj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@GetMapping("/getName")
	public String getName() {
		return "sushmitha";
	}

}
