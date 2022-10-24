package site.metacoding.white.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 DB의 번호 증가 전략을 그대로 따라감.
    private Long id;
    private String title;
    @Column(length = 1000)
    private String content;

    // FK가 만들어짐. user_id
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}