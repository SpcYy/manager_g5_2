package com.util;

import com.github.pagehelper.PageInfo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class PageUtil extends SimpleTagSupport {
    private String url;
    private PageInfo pageInfo;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if(url.contains("?")){
            url=url+"&";
        }else{
            url=url+"?";
        }
        JspWriter out = this.getJspContext().getOut();
        StringBuffer sb  = new StringBuffer();
        sb.append("<a href='"+url+"index=1&size="+pageInfo.getPageSize()+"'>首页</a>&nbsp");
        sb.append("<a href='"+url+"index="+(pageInfo.getPrePage()==0?1:pageInfo.getPrePage())+"&size="+pageInfo.getPageSize()+"'>上一页</a>&nbsp");
        sb.append("<a href='"+url+"index="+(pageInfo.getNextPage()==0?pageInfo.getPages():pageInfo.getNextPage())+"&size="+pageInfo.getPageSize()+"'>下一页</a>&nbsp");
        sb.append("<a href='"+url+"index="+pageInfo.getPages()+"&size="+pageInfo.getPageSize()+"'>尾页</a>&nbsp");
        sb.append("共"+pageInfo.getTotal()+"条记录&nbsp");
        sb.append("第"+pageInfo.getPageNum()+"页/共"+pageInfo.getPages()+"页&nbsp");
        out.print(sb.toString());
    }
}
