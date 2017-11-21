package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Navigation
{
    //
    public ResourceLink nextPage;
    public Navigation nextPage(ResourceLink nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    //
    public ResourceLink previousPage;
    public Navigation previousPage(ResourceLink previousPage) {
        this.previousPage = previousPage;
        return this;
    }
    //
    public ResourceLink firstPage;
    public Navigation firstPage(ResourceLink firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    //
    public ResourceLink lastPage;
    public Navigation lastPage(ResourceLink lastPage) {
        this.lastPage = lastPage;
        return this;
    }
}
