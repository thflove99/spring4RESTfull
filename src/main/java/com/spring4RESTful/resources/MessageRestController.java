package com.spring4RESTful.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sping4RESTful.bean.Message;



@RestController
public class MessageRestController {
	@RequestMapping("say/{name}")
    public Message say(@PathVariable String name) {
        Message message = new Message();
        message.setName(name);
        message.setText("hello," + name);
        return message;
    }
}
