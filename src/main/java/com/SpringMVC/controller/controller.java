package com.SpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMVC.UserDao;

//����DispatcherServlet��ص������� ����һ��Controller
@Controller

public class controller {
	@Autowired
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	 //���������RequestMapping�� ���Ʋ���С��URL·��ƥ�䣬ͬ�༶��ı�ǩЭͬ������
	 //����ȷ�����ص���URL���Ǹ���������  ��ָ�����ʷ���ΪGET  
	@RequestMapping(value="/login.do", method={RequestMethod.POST, RequestMethod.GET})
	public String login(@RequestParam("username") String username,
			@RequestParam("password") String password, Model model) {
		boolean rs = userDao.check(username, password);
	if (rs) {
		model.addAttribute("username",username);
		return "Success";
	}
		model.addAttribute("msg","Wrong username or password");
		return "login";
}
	
	@RequestMapping("/register.do")
	public String register(@RequestParam("username") String name,@RequestParam("password")String password,Model model) {
		boolean rs = userDao.unit(name);
		if (rs==false) {
			userDao.addUser(name, password);
			return "regSuccess";
		}
		model.addAttribute("msg","Username is already used!");
		return "reg";
	}
	@RequestMapping("/reg")
	public String getReg() {
		return "reg";
	}
	@RequestMapping("/login")
	public String backToLogin() {
	return "login";
	}
}