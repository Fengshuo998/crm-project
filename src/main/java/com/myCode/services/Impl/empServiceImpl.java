package com.myCode.services.Impl;

import com.myCode.dao.EmployeeMapper;
import com.myCode.entity.Employee;
import com.myCode.services.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empServiceImpl implements empService {
    @Autowired
    private EmployeeMapper dao = null;

    @Override
    public Employee selectOneById(Integer empId) {
        Employee e = dao.selectOneById(empId);

        return e;
    }

}
