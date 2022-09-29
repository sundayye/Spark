/**
 *
 * Project Name cdt4-project-spring-boot Package Name com.ssc.rest.framework
 * Date Apr 29, 20224:17:18 PM
 *
 * Copyright(c) 2022, StateStreet.com All Rights Reserved
 *
 */

package com.ssc.ssgm.fx.ifx.integration.beans;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ssc.ssgm.fx.ifx.integration.common.Response;
import com.ssc.ssgm.fx.ifx.integration.common.exception.SystemException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @description TODO add description <br/>
 * @author e691008
 * @version
 *
 */
@Slf4j
@Component
public class GlobalHandlerExceptionResolver implements HandlerExceptionResolver {

    private static final Gson gson = new GsonBuilder().disableHtmlEscaping()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().serializeNulls().create();;

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
                                         Exception ex) {
        log.error("GlobalHandlerExceptionResolver catched exception", ex);
        response.setStatus(HttpServletResponse.SC_OK);
        String errorMsg = null;
        if (ex instanceof SystemException) {
            errorMsg = ((SystemException) ex).getBizErrorMsg();
        } else {
            errorMsg = ex.getMessage();
        }
        try {
            response.getWriter().write(gson.toJson(Response.fail(errorMsg)));
        } catch (Exception e) {
            log.error("GlobalHandlerExceptionResolver#", ex);
        }
        return null;
    }
}
