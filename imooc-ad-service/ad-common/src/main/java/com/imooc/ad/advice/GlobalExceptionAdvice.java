package com.imooc.ad.advice;

import com.imooc.ad.exception.AdException;
import com.imooc.ad.vo.CommonResponse;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/6/17 23:10
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpRequest request,
                                                     AdException ex){
        CommonResponse<String> response = new CommonResponse<>(-1,
                "business error");
        response.setData(ex.getMessage());
        return response;
    }

}
