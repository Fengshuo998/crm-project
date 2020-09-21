package com.myCode.entity;

public class Employee {
    private Integer emp_id;
    private String emp_name;
    private String emp_email;
    private String sex;
    private Integer department_id;

    public Employee() {
    }

    public Employee(Integer emp_id, String emp_name, String emp_email, String sex, Integer department_id) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_email = emp_email;
        this.sex = sex;
        this.department_id = department_id;
    }
    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", sex='" + sex + '\'' +
                ", department=" + department_id +
                '}';
    }


}
