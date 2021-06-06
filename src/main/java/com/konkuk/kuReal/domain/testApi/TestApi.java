package com.konkuk.kuReal.domain.testApi;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class TestApi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length=10, nullable = false)
    private String name;

    @Column(length=20, nullable = false)
    private String email;

    @Builder
    public TestApi(String name, String email){
        this.name=name;
        this.email=email;
    }

}
