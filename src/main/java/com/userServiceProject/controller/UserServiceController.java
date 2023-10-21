package com.userServiceProject.controller;

import com.userServiceProject.model.User;
import com.userServiceProject.service.UserService;
import jdk.security.jarsigner.JarSignerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service")
public class UserServiceController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        userService.createUser(user);
        return ResponseEntity.ok("User CREATED successfully.");

    }

    @PutMapping("/update")
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return ResponseEntity.ok("User UPDATED successfully.");
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long userId) {
        userService.deleteUserById(userId);
        return ResponseEntity.ok("User DELETED successfully.");
    }

    @GetMapping("/{userId}")
    public User getUserById(@PathVariable Long userId) throws JarSignerException {
        return userService.getUserById(userId);
    }

    @PutMapping("/register-user")
    public ResponseEntity<String> registerUser(@RequestParam(name = "userId") Long userId) {
        Boolean isUserRegistered = userService.registerUser(userId).getStatus();
        if (isUserRegistered) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("This User is ALREADY Registered.");
        } else {
            return ResponseEntity.ok("User with ID " + userId + " registered successfully.");
        }
    }

    @GetMapping("/check-registration/{userId}")
    public ResponseEntity<Boolean> isUserRegistered(@PathVariable Long userId){
        Boolean isUserRegistered = userService.isUserRegistered(userId);
        if (isUserRegistered){
            return ResponseEntity.ok(true);
        } else {
            return ResponseEntity.ok(false);
        }
    }
}
