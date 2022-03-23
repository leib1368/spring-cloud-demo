package leib.demo.dao;

import leib.demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:Leib
 * @Date 2020/5/9 12:18
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept) ;
    public Dept queryByID(long id) ;
    public List<Dept> queryAll();
}
