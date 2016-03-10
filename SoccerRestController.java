package com.example;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ManagedResource(objectName = "Soccer:type=JMX,name=metrics")
@RestController
@RequestMapping(value = "/soccer")
public class SoccerRestController {

	private String soccer;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Soccer read(@PathVariable Long id) {
		Soccer soccer = new Soccer(1L, "Soccer");
		return soccer;
	}

	@ManagedAttribute
	public String getSoccer() {
		return soccer;
	}

	@ManagedAttribute
	public void setSoccer(String soccer) {
		this.soccer = soccer;
	}
}