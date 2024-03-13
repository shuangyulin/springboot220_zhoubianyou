package com.dao;

import com.entity.FangjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianView;

/**
 * 房间 Dao 接口
 *
 * @author 
 */
public interface FangjianDao extends BaseMapper<FangjianEntity> {

   List<FangjianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
