package com.jonghyeon.demospringsecurityform.form;

import com.jonghyeon.demospringsecurityform.Account.Account;
import com.jonghyeon.demospringsecurityform.Account.AccountContext;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public void dashboard() {
        Account account = AccountContext.getAccount();
        System.out.println("==============");
        System.out.println(account);
    }
}
