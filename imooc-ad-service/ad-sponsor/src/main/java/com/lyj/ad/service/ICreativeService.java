package com.lyj.ad.service;


import com.lyj.ad.vo.CreativeRequest;
import com.lyj.ad.vo.CreativeResponse;

/**
 * Created by Qinyi.
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
