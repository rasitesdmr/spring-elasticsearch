package com.example.Api;

import com.example.Entity.User;
import com.example.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kisi")
public class UserController {

    private final UserRepository userRepository;

    public void init(){
        User user = new User();
        user.setName("Raşit");
        user.setSurname("Eşdemir");
        user.setAddress("paris");
        user.setBirthOfDate(Calendar.getInstance().getTime());
        user.setId("A1");
        userRepository.save(user);

    }

    public ResponseEntity<List<User>>getUser(@PathVariable String search){
        List<User>users = userRepository.findByNameLikeOrSurnameLike(search,search);
        return ResponseEntity.ok(users);
    }


}
