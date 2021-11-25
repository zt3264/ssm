package com.zt.controller;

import com.zt.domain.Account;
import com.zt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("accountController")
@RequestMapping( "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;
    //添加方法
    @RequestMapping(value = "/save",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String save(Account account){
        accountService.save(account);
        return "添加成功";
    }

    //查询所有
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<Account> accountList = accountService.findAll();
        modelAndView.addObject("accountList",accountList);
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
