package leib.demo.service;

import leib.demo.entity.Dept;

import java.util.List;

/**
 * @Author:Leib
 * @Date 2020/5/9 13:13
 */
public interface DeptService {
    public boolean addDept(Dept dept) ;
    public Dept queryByID(long id) ;
    public List<Dept> queryAll();
}
