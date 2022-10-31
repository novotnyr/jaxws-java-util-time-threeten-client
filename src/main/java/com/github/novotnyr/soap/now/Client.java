package com.github.novotnyr.soap.now;

import example.now.TimeService;
import example.now.TimeServices;

import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        var serviceLocator = new TimeServices();
        TimeService timeService = serviceLocator.getPort();
        LocalDateTime now = timeService.getNow(new Object());
        System.out.println(now);
    }
}
