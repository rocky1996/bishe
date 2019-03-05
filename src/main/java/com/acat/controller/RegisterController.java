package com.acat.controller;

import com.acat.entity.RegisterEntity;
import com.acat.service.RegisterService;
import com.acat.util.Md5Util;
import com.acat.vo.LoginVo;
import com.acat.vo.RegisterVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private RegisterService registerService;

    @PostMapping(value = "/regis")
    public String register(@RequestBody RegisterVo registerVo){
        System.out.println("-----------");
        System.out.println(registerVo);
        System.out.println("-----------");

        RegisterEntity registerEntity = new RegisterEntity();

        if(registerVo.getBishe_register_username().length()!=0 && registerVo.getBishe_register_password().length()!=0 && registerVo.getBishe_register_repassword().length()!=0) {

            System.out.println("1********************");

            registerEntity.setBishe_register_username(registerVo.getBishe_register_username());

            System.out.println("2********************");

            registerEntity.setBishe_register_password(Md5Util.Encrypt(registerVo.getBishe_register_password()));
        }else{
            return "1";//失败
        }

        System.out.println("3********************");

        registerService.addRegister(registerEntity);
        return "2";//成功
    }

    @PostMapping(value = "/login")
    public String login(@RequestBody LoginVo loginVo, HttpSession session){
        RegisterEntity registerEntity = new RegisterEntity();

        if(loginVo.getBishe_register_username().length()!=0 && loginVo.getBishe_register_password().length()!=0){
            registerEntity = registerService.login(loginVo.getBishe_register_username(),Md5Util.Encrypt(loginVo.getBishe_register_password()));
        }

        if(registerEntity == null){
            System.out.println("账号或密码错误");
            return "1";//账号密码错误
        }

        if(registerEntity.getBishe_register_flag() == 0){
            System.out.println("registerEntity是管理员");
            return "2";//条砖到管理员页面
        }else{
            System.out.println("registerEntity不是管理员");
            return "3";//条砖到普通用户页面
        }
    }

    @GetMapping("/logout")
    public void logout(HttpSession session){
        RegisterEntity registerEntity = (RegisterEntity) session.getAttribute("registerEntity");
        System.out.println("没有从session中去掉时候的id："+registerEntity.getBishe_register_id());

        session.removeAttribute("register");
        session.invalidate();

        System.out.println("已经从session中去掉时候的id："+registerEntity.getBishe_register_id());
    }
}
