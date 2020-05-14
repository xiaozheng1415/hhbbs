package com.example.mysql_web.Controller;

import com.example.mysql_web.domain.Kind;
import com.example.mysql_web.repository.KindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    KindRepository kindRepository;

    @RequestMapping(params = {"index","/"})
    public String index(Model model){
        Iterable<Kind> kinds = kindRepository.findAll();
        model.addAttribute("kinds",kinds);
        return "index";

    }

}
