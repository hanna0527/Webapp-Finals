package com.common.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class EncodingFilter implements Filter {

    private String encodingType;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType = filterConfig.getInitParameter("encoding-type");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest) request;
        if("POST".equals(hrequest.getMethod())) {
            request.setCharacterEncoding(encodingType);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() { }
}
