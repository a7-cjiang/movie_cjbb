package com.fh.service.impl;

import com.fh.dao.HisDao;
import com.fh.dao.MovieDao;
import com.fh.model.His;
import com.fh.model.Movie;
import com.fh.model.QueryMovie;
import com.fh.service.MovieService;
import com.fh.utils.DataTableResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Autowired
    private HisDao hisDao;

    @Override
    public DataTableResult queryMovie(QueryMovie queryMovie) {

        Long count = movieDao.queryCount(queryMovie);
        List<Movie> ttusers = movieDao.toList(queryMovie);

        DataTableResult dataTableResult = new DataTableResult();
        dataTableResult.setDraw(queryMovie.getDraw());
        dataTableResult.setData(ttusers);
        dataTableResult.setRecordsFiltered(count);
        dataTableResult.setRecordsTotal(count);

        return dataTableResult;

    }

    @Override
    public List<His> queryHis() {
        List<His> his = hisDao.selectList(null);

        return his;
    }

    @Override
    public void addUser(Movie movie) {
        movieDao.insert(movie);
    }

    @Override
    public String updaye(Integer hid) {
        Movie movie = movieDao.selectById(hid);
        if (movie.getNum()>0){
            movie.setNum(movie.getNum()-1);
            movieDao.updateById(movie);
        }

   return "购票失败";



    }


}
