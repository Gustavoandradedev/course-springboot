package br.com.zupinnovation.coursespringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zupinnovation.coursespringboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {

	User u = new User(1L, "Gustavo", "gustavo@hotmail.com", "99999", "12345");
	return ResponseEntity.ok().body(u);

}


}
