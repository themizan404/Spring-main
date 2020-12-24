package com.spring.web.service.impl;

import com.spring.web.common.ICommonService;
import com.spring.web.model.Trainee;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface ITraineeService extends ICommonService<Trainee>{
   public Trainee save(HttpServletRequest request);
}
