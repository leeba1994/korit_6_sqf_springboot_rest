package com.study.rest.controller;

import com.study.rest.di.무기;
import com.study.rest.di.방패;
import com.study.rest.di.총;
import com.study.rest.di.칼;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.expression.TypedValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class 캐릭터 {

    @Autowired
    @Qualifier("총") //컴포넌트에 무기라는 인터페이스에 상속받은 총 이랑 칼이 있는데 둘중에 1개를 지정해줘야한다. 지정안하면 둘중에 어디를 선택해야하는지 모른다
    private 무기 weapon;

//    @Autowired
//    @Qualifier("칼")
//    private  무기 weapon2;

    @Autowired
    @Qualifier("물리공격방패")
    private 방패 shield;

    @Autowired
    private TypedValue typedValue;

    @ResponseBody
    @GetMapping("/maple/attack")
    public Object mapleAttack(@RequestParam String i) {
        //weapon = new 칼();   //결합도가 높은 코드
        //weapon = new 총();
        if(i.equals("1")) {
            weapon.공격();
            //System.out.println(i);

        } else if(i.equals("2")) {
            //weapon2.공격();
        } else {
            System.out.println("1 아니면 2를 입력하세요! ");
        }
        return null;
    }

    @ResponseBody
    @GetMapping("/maple/defense")
    public Object mapleDefense() {
        shield.방어();
        return null;
    }
}
