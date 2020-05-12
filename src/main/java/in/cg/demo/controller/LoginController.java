package in.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.cg.demo.model.Login;
import in.cg.demo.repository.LoginRepository;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping({"/api"})
@RestController
public class LoginController {

		@Autowired
		LoginRepository repos;
		
		@RequestMapping("/getall")
		public List<Login> getAll()
		{
			return repos.findAll();
		}
		
		@PostMapping("/add")
		public void add(@RequestBody Login login)
		{
			repos.save(login);
		}
		
}
