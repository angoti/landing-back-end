package example.hellosecurity.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A controller for the hello resource.
 *
 * @author Josh Cummings
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public ResponseEntity<String> hello(Authentication authentication) {
        return ResponseEntity.status(HttpStatus.OK).body("Hello, " + authentication.getName() + "!");
    }

}
