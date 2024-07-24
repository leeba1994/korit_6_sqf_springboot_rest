package com.study.rest.di;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class A {

    @Autowired
    private  B b;

    public void aCall() {
        System.out.println("A 객체에서 메서드 호출");
        b.bCall();
    }
}
