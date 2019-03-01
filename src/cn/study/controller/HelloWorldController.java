package cn.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String msg = request.getParameter("msg");
		ModelAndView mv = new ModelAndView();
		if(msg.equals("yes")){
			mv.addObject("responseMsg", "Got it");
		}else{
			mv.addObject("responseMsg", "Sorry,I don't get any request");
		}
		mv.setViewName("hello");
		return mv;
	}

}
