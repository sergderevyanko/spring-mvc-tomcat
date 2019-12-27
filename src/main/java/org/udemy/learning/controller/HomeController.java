package org.udemy.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

@Controller
public class HomeController {

	@Autowired
	DataSource dataSource;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException, SQLException {
		return new ModelAndView("home");
	}
}
