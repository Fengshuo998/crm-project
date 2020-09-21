package com.myCode.dao;

import com.myCode.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {
    int deleteOneById(@Param("empId") Integer empId);
    int updateOneById(@Param("empId") Integer empId,
                      @Param("employee") Employee employee);
    int insertOne(Employee employee);
    Employee selectOneById(@Param("empId") Integer empId);
    Employee selectOneByName(@Param("empName") String empName);
    // 查询带有部门信息的Employee
    Employee selectWithDeptById(@Param("empId") Integer empId);
    // 分页查询
    List<Employee> selectByLimitAndOffset(@Param("limit") Integer limit, @Param("offset") Integer offset);
    int countEmps();
}
