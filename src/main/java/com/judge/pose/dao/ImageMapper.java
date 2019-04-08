package com.judge.pose.dao;

import com.judge.pose.domain.Image;
import com.judge.pose.domain.ImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ImageMapper extends Mapper<Image> {
}