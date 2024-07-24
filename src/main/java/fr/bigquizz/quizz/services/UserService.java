package fr.bigquizz.quizz.services;

import org.openapitools.api.UsersApiDelegate;
import org.openapitools.model.TwitchUserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UsersApiDelegate {

    @Override
    public ResponseEntity<TwitchUserInfo> getUserInfo() {
        System.out.println("test");
        return ResponseEntity.ok(new TwitchUserInfo());
    }

}
