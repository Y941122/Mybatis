package com.ssm.page;

import java.util.List;

/**
 * Created by YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY on 18/1/25哈哈.
 */
public class PageBean<T> {
    private T parameter;//用于条件查询的属性

    private int pageNum;
    private int pageSize;
    private int totalRecord;

    private int startIndex;
    private int totalPage;
    private List<T> beanList;
    private int begin;
    private int end;

    public PageBean(int pageNum, int pageSize, int totalRecord) {
        super();
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.totalRecord = totalRecord;

        if (this.pageNum < 1) {
            this.pageNum = 1;
        }


        this.totalPage = (this.totalRecord + this.pageSize - 1) / this.pageSize;


        if (this.pageNum > totalPage){
            this.pageNum = totalPage;
        }

        this.startIndex = (this.pageNum - 1) * this.pageSize;

        this.begin = 1;
        this.end = 10;

        if (this.totalPage <= 10) {
            this.end = this.totalPage;
        } else {


            this.begin = this.pageNum - 5;
            this.end = this.pageNum + 4;

            if (this.begin < 1) {
                this.begin = 1;
                this.end = 10;
            }

            if (this.end > this.totalPage) {
                this.end = this.totalPage;
                this.begin = this.totalPage - 9;
            }

        }

    }

    public int getTotalPage() {
        return totalPage;
    }


    public List<T> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<T> beanList) {
        this.beanList = beanList;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }


    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public T getParameter() {
        return parameter;
    }

    public void setParameter(T parameter) {
        this.parameter = parameter;
    }
}



