package com.hejin.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hejin
 * @create 2025-02-25-17:24
 * @description 练习注解 @RequestAttribute（获取 request 域属性）
 */
@Controller
public class RequestController {
    /**
     * @param httpServletRequest:
     * @return String
     * @author hejin
     * @description 初始请求用来转发到 success 请求
     * @date 2025/2/25 17:59
     */
    @GetMapping("/goto")
    public String goToPage(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("msg","成功了");
        httpServletRequest.setAttribute("code","200");
        return "forward:/success";//转发到 success 请求

    }

    /**
     * @param httpServletRequest:
     * @param msg2:
     * @param code2:
     * @return Map<String,Object>
     * @author hejin
     * @description 使用两种方式获取到 request 属性
     * @date 2025/2/25 18:02
     */
    @ResponseBody //返回 response 数据内容
    @GetMapping("/success")
    public Map<String,Object> success(HttpServletRequest httpServletRequest,//方式一，使用 get 方法
                                      @RequestAttribute("msg") String msg2,//方式二，使用注解
                                      @RequestAttribute("code") Integer code2){
        //方式一
        Object msg = httpServletRequest.getAttribute("msg");
        Object code = httpServletRequest.getAttribute("code");

        HashMap<String,Object> map = new HashMap<>();
        map.put("使用方式一：httpServletRequest get 获取属性 msg：", msg);
        map.put("使用方式一：httpServletRequest get 获取属性 code：", code);
        map.put("使用方式二：使用注解 @RequestAttribute 获取属性 msg1：", msg2);
        map.put("使用方式二：使用注解 @RequestAttribute 获取属性 code1：", code2);
        return map;
    }

}
