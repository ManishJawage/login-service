package in.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cg.demo.model.Login;
import in.cg.demo.repository.LoginRepository;

@RestController
public class LoginController {

		@Autowired
		LoginRepository repos;
		
		@RequestMapping("/getall")
		public List<Login> getAll()
		{
			return repos.findAll();
		}
}
