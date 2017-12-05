package ru.koshevoy.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.koshevoy.service.ReviewService;
import ru.koshevoy.service.ReviewServiceImpl;

@Controller
public class MainController {

	private final Logger logger = LoggerFactory.getLogger(MainController.class);
	//private final ReviewService reviewService;

	//@Autowired
	//public MainController(ReviewService reviewService) {
	//	this.reviewService = reviewService;
	//}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		logger.debug("index() is executed!");

		return "index";
	}


}