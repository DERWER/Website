package ru.koshevoy.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
import ru.koshevoy.model.Review;
import ru.koshevoy.service.ReviewService;

import java.util.List;

@Controller
public class ReviewController {
    private final Logger logger = LoggerFactory.getLogger(ReviewController.class);


    @Autowired
    private ReviewService reviewService;


    @RequestMapping(value = "/reviews", method = RequestMethod.GET)
    public ModelAndView getReviewPage() {
        logger.info("hfkjhgkjhgkjghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("review", new Review());
        modelAndView.setViewName("reviews/reviews");
        return modelAndView;
    }

    @RequestMapping(value = "/reviews", method = RequestMethod.POST)
    public String checkUser(@Validated @ModelAttribute("review") Review review, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        ModelAndView modelAndView = new ModelAndView();

        if (!bindingResult.hasErrors()) {
            RedirectView redirectView = new RedirectView("result");
            redirectView.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
            modelAndView.setView(redirectView);
            redirectAttributes.addFlashAttribute(review);
            reviewService.save(review);

        } else {
            modelAndView.setViewName("index");
        }
        return "redirect:/result";
    }

    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String getReviews(Model model) {
        List listOfReviews = reviewService.findAll();
        model.addAttribute("review", new Review());
        model.addAttribute("listOfReviews", listOfReviews);
        return "reviews/result";
    }

}
