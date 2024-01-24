package com.xworkz.fertilizer.runner;

import Entity.EmailEntity;
import com.xworkz.fertilizer.repository.EmailRepository;
import com.xworkz.fertilizer.repository.EmailRepositoryImpl;

import java.time.LocalDate;

public class EmailRunner {
    public static void main(String[] args) {
        EmailEntity emailEntity= new EmailEntity(1,"BTM layout","xworkz@gmail.com","ravikant.xworkz@gmail.com","Test Email","Cc","I hope this email finds you well", LocalDate.of(2024,01,15),false);
        EmailRepository repo = new EmailRepositoryImpl();
        repo.save(emailEntity);
    }
}
