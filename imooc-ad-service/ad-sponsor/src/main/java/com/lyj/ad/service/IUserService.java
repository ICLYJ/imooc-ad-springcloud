package com.lyj.ad.service;


import com.imooc.ad.exception.AdException;
import com.lyj.ad.vo.CreateUserRequest;
import com.lyj.ad.vo.CreateUserResponse;

/**
 * Created by Qinyi.
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
