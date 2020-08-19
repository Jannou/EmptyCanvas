package MasterBow.MasterBow_SpringBoot.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {


    @RequestMapping(Urls.API + Urls.PING)
    public String ping() {
        return "pong, ping pong Carl !";
    }

}
