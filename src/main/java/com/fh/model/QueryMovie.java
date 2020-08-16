package com.fh.model;

import com.fh.utils.DataTablePageBean;

public class QueryMovie extends DataTablePageBean {


    private String hidquerylist;//
    private Integer num	;//int	余票数量
    private String   name;//	varchar2(120)	电影名称


    public String getHidquerylist() {
        return hidquerylist;
    }

    public void setHidquerylist(String hidquerylist) {
        this.hidquerylist = hidquerylist;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
