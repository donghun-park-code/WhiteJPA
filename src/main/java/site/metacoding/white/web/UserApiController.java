package site.metacoding.white.web;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.white.domain.User;
import site.metacoding.white.service.UserService;

@RequiredArgsConstructor
@RestController // Api를 불러오기 위해서 rest컨트롤러 씀
public class UserApiController {

    private final UserService userService;
    private final HttpSession session;

    // JoinDto
    @PostMapping("/join")
    public String save(@RequestBody User user) {
        userService.save(user);
        return "ok";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User principal = userService.login(user);
        session.setAttribute("principal", principal);
        return "ok";
    }

}
