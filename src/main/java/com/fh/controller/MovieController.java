package com.fh.controller;

import com.fh.common.JsonData;
import com.fh.model.His;
import com.fh.model.Movie;
import com.fh.model.QueryMovie;
import com.fh.service.MovieService;
import com.fh.utils.DataTableResult;
import com.fh.utils.FilesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("MovieController")
public class MovieController {

    @Autowired
    private MovieService movieService;


    @RequestMapping("queryMovie")
    public DataTableResult queryMovie(QueryMovie queryMovie){
        DataTableResult dataTableResult = movieService.queryMovie(queryMovie);
        return dataTableResult;
    }

    @RequestMapping("queryhis")
    public JsonData queryArea(){
        List<His> his = movieService.queryHis();
        return  JsonData.getJsonSuccess(his);
    }


    @RequestMapping("Ttuser")
    public JsonData addTtuser(Movie movie){
        movieService.addUser(movie);
        return JsonData.getJsonSuccess("新增成功");
    }



    @RequestMapping("uploadAvatar")
    public JsonData uploadAvatar(
            @RequestParam("img") MultipartFile multipartFile) throws FileNotFoundException {
        Map map=new HashMap();
        File file = FilesUtils.readFiles(multipartFile);
        String s = FilesUtils.fileUpload(file);
        map.put("filePath", s);
        return  JsonData.getJsonSuccess(map);

    }


    @RequestMapping("update")
    public JsonData update(Integer hid){
        movieService.updaye(hid);
        return  JsonData.getJsonSuccess("购票成功");
    }

}
