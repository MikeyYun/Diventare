package com.mikeyeom.diventare.list;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/list")
@Controller
public class ListController {
	
	@GetMapping("womenList-view")
	public String listWomen() {
		return "list/womenList";
	}
}
