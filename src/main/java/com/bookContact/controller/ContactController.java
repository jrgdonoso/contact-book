package com.bookContact.controller;

import com.bookContact.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {



    //save contact
    @RequestMapping(value="api/contact", method = RequestMethod.POST)
    public void saveContact(@RequestBody Contact contact){
        System.out.println("imprimiendo contacto...");
        System.out.println("imprimiendo contacto "+contact.toString());
    }

    @RequestMapping(value="test", method = RequestMethod.POST)
    public void test(){
        System.out.println("imprimiendo test...");


    }


}
