package com.minhtanit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
        int num1 = Integer.parseInt(request.getParameter("t1"));
        int num2 = Integer.parseInt(request.getParameter("t2"));
        int result = num1 + num2;
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
