package com.cpf.dao;

import com.cpf.entity.Department;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.PanelUI;
import java.util.List;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Repository
public interface DeptDao {
    public List<Department> queryAllDept();
    public void saveDepartment(Department department);
    public Department queryById(int id);
    public Department queryByName(String name);

}
