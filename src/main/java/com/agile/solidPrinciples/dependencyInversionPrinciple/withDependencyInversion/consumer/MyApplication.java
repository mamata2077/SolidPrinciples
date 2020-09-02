package com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer;


import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.service.MessageService;

public class MyApplication implements Consumer {
   
        private MessageService service;
        
        public MyApplication(MessageService svc){
            this.service=svc;
        }
        
        //@Override
        public void processMessages(String msg, String rec){
            //do some msg validation, manipulation logic etc
            this.service.sendMessage(msg, rec);
        }
    
    }