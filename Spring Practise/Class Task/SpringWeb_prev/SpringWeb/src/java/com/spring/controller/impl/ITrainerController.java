package com.spring.controller.impl;

import com.spring.web.common.ICommonController;

public interface ITrainerController extends ICommonController{
    public String getByCode(int id);
}
