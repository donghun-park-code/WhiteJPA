package site.metacoding.white.dto;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.white.domain.User;

// 요청의 DTO는 toEntity로 처리한다
public class UserReqDto {

    @Setter
    @Getter
    public static class JoinReqDto { // 로그인 전 로직들 전부다 앞에 엔티티 안붙임. POST /user -> /join
        private String username;
        private String password;

        public User toEntity() {
            return User.builder().username(username).password(password).build();
        }
    }

    @Setter
    @Getter
    public static class LoginReqDto {
        private String username;
        private String password;
    }

}
