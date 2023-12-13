package com.chatapp.controllers;

import com.chatapp.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){

        //NO DELAY
//        try{
//            //message can be saved here in the database
//             Thread.sleep(000);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }

        return message;
    }
}
