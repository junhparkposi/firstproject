package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity  // DB가 해당 객체를 인식 가능!
@AllArgsConstructor  //클래스 생성자 자동 추가
@NoArgsConstructor // 디폴트 생성자 추가
@ToString  // To String 자동 추가
@Getter // 클래스 내 모든값에 대한 Get 추출 함수 자동 추가
public class Article {

    @Id     // 대표값을 지정! Like a 주민등록 번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //DB가 id 자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;


    public void patch(Article article) {
        if (article.title != null)
            this.title = article.title;
        if (article.content != null)
            this.content = article.content;
    }
}
