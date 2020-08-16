package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Movie;
import com.fh.model.QueryMovie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MovieDao extends BaseMapper<Movie> {

    Long queryCount(QueryMovie queryMovie);

    List<Movie> toList(QueryMovie queryMovie);

}
