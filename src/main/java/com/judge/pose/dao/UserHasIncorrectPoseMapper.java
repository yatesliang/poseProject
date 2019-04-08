package com.judge.pose.dao;

import com.judge.pose.domain.UserHasIncorrectPose;
import com.judge.pose.domain.UserHasIncorrectPoseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserHasIncorrectPoseMapper extends Mapper<UserHasIncorrectPose> {
}