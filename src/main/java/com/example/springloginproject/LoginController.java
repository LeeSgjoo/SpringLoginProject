package com.example.springloginproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    String login_form() {
        return "login";
    }

    @PostMapping("/login_ok")
    String login_ok(HttpSession session,  @ModelAttribute UserVO userVO) {
        UserVO userinfo = (UserVO)session.getAttribute("user");
        if(userinfo != null){
            session.removeAttribute("user");
        }
        if(userVO == null) return "login";
        if(userVO.getUserid() == "admin" && userVO.getPassword() == "admin1234" ){
            session.setAttribute("user",userVO);
            return "redirect:/list";
        } else {
            return "redirect:/login/login?msg=loginfail";
        }
    }
}
