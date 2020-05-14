package com.example.mysql_web;

import com.example.mysql_web.domain.Kind;
import com.example.mysql_web.repository.KindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private KindRepository kindRepository;

    @Override
    public void run(String... args) throws Exception {
        kindRepository.save(new Kind("ASP.NET技术乐园","WEB程序员的天堂"));
        kindRepository.save(new Kind("C#技术深入探讨","深入研究底层技术"));
        kindRepository.save(new Kind("黑客技术区","讨论和分享黑客技术,最新病毒介绍,电脑入侵.木马......."));
    }
}
