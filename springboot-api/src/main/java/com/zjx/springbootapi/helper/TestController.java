package com.zjx.springbootapi.helper;

import com.zjx.springbootutils.helper.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-05-30 20:10
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/date")
    public String getDate() {
        Date date = new CommonMethod().getCurDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
