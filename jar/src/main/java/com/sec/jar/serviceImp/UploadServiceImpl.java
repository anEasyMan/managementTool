package com.sec.jar.serviceImp;

import com.sec.jar.mapper.UploadMapper;
import com.sec.jar.pojo.Test;
import com.sec.jar.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fireflying
 */
@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private UploadMapper uploadMapper;

    @Override
    public Test save(Test test) {
        Test save = uploadMapper.save(test);
        return save;
    }
}
