package com.hejin.boot.controller;

import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hejin
 * @create 2025-01-04-17:00
 * @description web 开发中常用的基本注解和参数接收，get 和 post 接口参数处理
 */
@RestController // web 程序启动
public class ParamsController {

    /**
     * @return Map<String,Object>
     * @author hejin
     * @description get 接口中如何接收参数
     * @date 2025/2/24 22:51
     */
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getTest(@PathVariable("id") Integer id, //地址中的变量
                                       @PathVariable("username") String name,
                                       @PathVariable Map<String, String> pv,
                                       @RequestHeader("User-Agent") String userAgent,
                                       @RequestHeader Map<String, String> header,
                                       @RequestParam("age") Integer age, //地址中的参数 ？后的参数
                                       @RequestParam("sex") Integer sex,
                                       @RequestParam Map<String, String> params
                                       //@CookieValue("_ga") String ga,
                                      // @CookieValue("_ga")Cookie cookie
                                       ){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
        map.put("userAgent",userAgent);
        map.put("headers",header);
        map.put("age",age);
        map.put("sex",sex);
        map.put("params",params);
        //map.put("ga",ga);
        //System.out.println(cookie.getClass());
        return map;
    }

    /**
     * @return Map<String,Object>
     * @author hejin
     * @description post 接口中如何接收参数
     * @date 2025/2/24 22:52
     */
    @PostMapping("/login")
    public Map<String, Object> postTest(@RequestBody String content){
        HashMap<String, Object> postMap = new HashMap<>();
        postMap.put("contentbody",content);
        return postMap;
    }


}
