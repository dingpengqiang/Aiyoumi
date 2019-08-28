package com.noway.cook.service;

import com.noway.cook.model.secondary.Option;

import java.util.List;

/**
 * @author noway
 */
public interface CookOptionService {


    List<Option> findAllByClz(String clz);
}
