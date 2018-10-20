package com.cpf.controller;


import com.cpf.entity.Department;
import com.cpf.entity.Position;
import com.cpf.entity.Staff;
import com.cpf.service.DeptService;
import com.cpf.service.PositionService;
import com.cpf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/15 0015.
 */
@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private StaffService staffService;

    @RequestMapping("dept_admin")
    public String deptAdmin(ModelMap modelMap){
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("dept",departments);
        return "deptAdmin";
    }

    @RequestMapping("delete_dept")
    public String deleteDept(int dId,ModelMap modelMap){
        Department department = deptService.queryById(dId);
        List<Staff> staff = staffService.queryByDeptName(department.getName());
        if (staff!=null){
            modelMap.addAttribute("str","该部门下还有员工，暂不能删除");
        }else {
            positionService.deleteByDeptId(dId);
            deptService.deleteById(dId);
        }
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("dept",departments);
        return "deptAdmin";
    }

    @RequestMapping("query_post")
    public String queryPost(int dId,ModelMap modelMap){
        Department department = deptService.queryById(dId);
        List<Position> positions = positionService.queryByDeptId(dId);
        modelMap.addAttribute("dept",department);
        modelMap.addAttribute("position",positions);
        return "showPosition";
    }

    @RequestMapping("delete_post")
    public String deletePost(int pId,int dId,ModelMap modelMap){

        Position position = positionService.queryById(pId);
        List<Staff> staff = staffService.queryByPositionName(position.getName());
        if (staff!=null){
            modelMap.addAttribute("str","该部门下还有员工，暂不能删除");
        }else {
            positionService.deleteById(pId);
        }
        Department department = deptService.queryById(dId);
        List<Position> positions = positionService.queryByDeptId(dId);
        modelMap.addAttribute("dept",department);
        modelMap.addAttribute("position",positions);
        return "showPosition";
    }

    @RequestMapping("update_dept")
    public String updateDept(int dId,ModelMap modelMap){
        Department department = deptService.queryById(dId);
        modelMap.addAttribute("dept",department);
        return "updateDept";
    }

    @RequestMapping("alter_dept")
    public String alterDept(Department department,String deptName){
        List<Staff> staffs = staffService.queryByDeptName(deptName);
        if (staffs!=null){
            for (Staff staff:staffs){
                Staff staff1=new Staff(staff.getId(),department.getName(),0);
                staffService.updateStaffDeptName(staff1);
            }
        }else {
            deptService.updateDept(department);
        }
        return "forward:/dept_admin";
    }

    @RequestMapping("save_dept")
    public String saveDept(){
        return "saveDept";
    }

    @RequestMapping("add_dept")
    public String addDept(String name){
        Department department=new Department(0,name,new Date());
        deptService.save(department);
        return "forward:/dept_admin";
    }

    @RequestMapping("update_post")
    public String updatePost(int pId,int dId,ModelMap modelMap){
        Department department = deptService.queryById(dId);
        Position position = positionService.queryById(pId);
        modelMap.addAttribute("dept",department);
        modelMap.addAttribute("posit",position);
        return "updatePost";
    }
    @RequestMapping("alter_position")
    public String alterPosition(Position position,String positionName,ModelMap modelMap){
        positionService.updatePosition(position);
        List<Staff> staffs = staffService.queryByPositionName(positionName);
        if (staffs!=null){
            for(Staff staff1:staffs){
                Staff staff=new Staff(staff1.getId(),position.getName());
                staffService.updateStaffPositionName(staff);
            }
        }
        Department department = deptService.queryById(position.getDepartmentId());
        List<Position> positions = positionService.queryByDeptId(position.getDepartmentId());
        modelMap.addAttribute("dept",department);
        modelMap.addAttribute("position",positions);
        return "showPosition";
    }

    @RequestMapping("save_post")
    public String savePost(int dId,ModelMap modelMap){
        Department department = deptService.queryById(dId);
        modelMap.addAttribute("dept",department);
        return "savePost";
    }

    @RequestMapping("add_position")
    public String addPosition(Position position,ModelMap modelMap){
        position.setDateTime(new Date());
        positionService.savePosition(position);
        Department department = deptService.queryById(position.getDepartmentId());
        List<Position> positions = positionService.queryByDeptId(position.getDepartmentId());
        modelMap.addAttribute("dept",department);
        modelMap.addAttribute("position",positions);
        return "showPosition";
    }

    @RequestMapping("dept_position")
    public String deptPosition(ModelMap modelMap){
        List<Department> departments = deptService.queryAllDept();
        modelMap.addAttribute("dept",departments);
        return "deptPosition";
    }

}
