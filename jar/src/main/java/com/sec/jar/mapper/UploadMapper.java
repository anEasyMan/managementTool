package com.sec.jar.mapper;

import com.sec.jar.pojo.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fireflying
 */
@Repository
public interface UploadMapper extends JpaRepository<Test, Integer> {

}
