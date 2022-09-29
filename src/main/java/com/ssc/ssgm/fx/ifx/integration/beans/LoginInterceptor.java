
package com.ssc.ssgm.fx.ifx.integration.beans;

import lombok.Data;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Data
public class LoginInterceptor implements HandlerInterceptor {


    /**
     * Interceptor main processing method
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        return true;
        //response.sendRedirect(request.getContextPath() + "/index.html");
        // return false;
    }

    /**
     * Call after request processing, but before view is rendered (after
     * Controller method call)
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    /**
     * It is called after the end of the whole request, that is, after the
     * dispatcherserservlet has rendered the corresponding view (mainly for
     * resource cleaning)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
