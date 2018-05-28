package com.github.nduyhai.exampleapachestruts.action;

import com.github.nduyhai.exampleapachestruts.model.Message;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private Message message;

    @Override
    public String execute() throws Exception {
        this.message = new Message();
        return ActionSupport.SUCCESS;
    }

    public Message getMessage() {
        return message;
    }
}
