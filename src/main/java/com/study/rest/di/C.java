package com.study.rest.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //IoC 컨테이너에 생성된 bean
public class C {

    @Autowired(required = false)    //무조건 주입할 필요없다.
    private  D d;

    public void cCall() {
        System.out.println("C 객체에서 메서드 호출");
        d.dCall();
    }
}
