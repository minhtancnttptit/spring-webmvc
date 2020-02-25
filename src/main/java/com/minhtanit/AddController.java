package com.minhtanit;

import com.minhtanit.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int t1, @RequestParam("t2") int t2) {
        AddService addService = new AddService();
        int result = addService.add(t1, t2);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
