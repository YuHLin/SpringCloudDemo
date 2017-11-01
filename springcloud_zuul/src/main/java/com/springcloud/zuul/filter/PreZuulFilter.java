package com.springcloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Lin
 * @Date 2017/11/1.
 */
@Component
public class PreZuulFilter extends ZuulFilter {

    /**
     pre:请求执行之前filter
     route: 处理请求，进行路由
     post: 请求处理完成后执行的filter
     error:出现错误时执行的filter
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 所以filter集的执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否执行该filter
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * filter执行内容
     * @return
     */
    @Override
    public Object run() {
        System.out.println("该filter被执行！");
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object token = request.getParameter("token");
        if(token == null){
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        return null;
    }
}
