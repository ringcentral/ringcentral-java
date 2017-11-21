package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Paging
{
    //
    public Long page;
    public Paging page(Long page) {
        this.page = page;
        return this;
    }
    //
    public Long totalPages;
    public Paging totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    //
    public Long perPage;
    public Paging perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
    //
    public Long totalElements;
    public Paging totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
    //
    public Long pageStart;
    public Paging pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }
    //
    public Long pageEnd;
    public Paging pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }
}
