package wz_ling.learning.springcloud.service.api.service.a.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import wz_ling.learning.springcloud.service.api.service.constant.Constant;

@FeignClient(name = "service-a", path = Constant.BASE_URL_SERVICE_A)
public interface ServiceATestApi {

    @GetMapping("/test1")
    String test1();

}
