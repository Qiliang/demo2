package io.daocloud.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@EnableAutoConfiguration
public class Sample2Controller {


    private RestTemplate restTemplate=new RestTemplate();

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "from demo:" + restTemplate.getForObject("http://demo/", String.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Sample2Controller.class, args);
    }
}