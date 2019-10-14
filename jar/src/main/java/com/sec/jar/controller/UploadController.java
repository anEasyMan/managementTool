package com.sec.jar.controller;

import com.sec.jar.pojo.Test;
import com.sec.jar.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fireflying
 */

@Controller
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @RequestMapping("test")
    @ResponseBody
    private Test test() {
        Test test = new Test();
        test.setId(1);
        test.setName("aaa");
        test.setTest("bbb");
        Test test1 = uploadService.save(test);
        return test1;
    }
}
