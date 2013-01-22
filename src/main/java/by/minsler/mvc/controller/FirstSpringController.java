package by.minsler.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * User: minsler
 * Date: 1/22/13
 * Time: 7:50 PM
 */
@Controller
public class FirstSpringController {


    @RequestMapping(value = "/welcome.htm", method = RequestMethod.GET)
    public String handleRequestInternal(Map<String, Object> model) {
        model.put("msg", "hello spring mvc");
        return "HelloMVCPage";
    }
}
