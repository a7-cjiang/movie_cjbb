package com.fh.service;

import com.fh.model.His;
import com.fh.model.Movie;
import com.fh.model.QueryMovie;
import com.fh.utils.DataTableResult;

import java.util.List;

public interface MovieService {

    DataTableResult queryMovie(QueryMovie queryMovie);
    List<His> queryHis();

    void   addUser(Movie movie);
    String updaye(Integer hid);

}
