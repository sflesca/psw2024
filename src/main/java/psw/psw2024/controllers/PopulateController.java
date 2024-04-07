package psw.psw2024.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import psw.psw2024.services.UtilityService;

@Controller
@RequestMapping("/utility")
public class PopulateController {
    UtilityService util;

    public PopulateController(UtilityService util) {
        this.util = util;
    }

    @GetMapping("/create")
    public String create() {
        util.populate();
        return "created";
    }
}
