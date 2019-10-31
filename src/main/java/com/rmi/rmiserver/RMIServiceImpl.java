package com.rmi.rmiserver;

import java.util.Date;

public class RMIServiceImpl implements RMIService {


    @Override
    public String SayMessage(String message) {
        System.out.println("******************Server Side****************************");
        System.out.println("Incoming message from client : " + message);
        return "Here is the message: "+message+"  ::Response time=>"+new Date();

    }

    @Override
    public String Addition(int number) {
        System.out.println("The number entered by Client: " + number);
        return "Sum of the number is: " + (number + number)+
                "\n The subtraction by 2 is : " + (number-2);

    }
}
