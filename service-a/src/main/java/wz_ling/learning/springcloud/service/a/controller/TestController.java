package wz_ling.learning.springcloud.service.a.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wz_ling.learning.springcloud.service.api.service.a.feign.ServiceATestApi;
import wz_ling.learning.springcloud.service.api.service.constant.Constant;


@RestController
@RequestMapping(Constant.BASE_URL_SERVICE_A)
public class TestController implements ServiceATestApi {

    @Override
    public String test1() {
        return "ok";
    }
}
