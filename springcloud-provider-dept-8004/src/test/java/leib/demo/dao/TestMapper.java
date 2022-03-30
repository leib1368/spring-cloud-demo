package leib.demo.dao;

import leib.demo.bean.Student;
import leib.demo.bean.StudentVO;
import leib.demo.mapper.StudentMapper;

public class TestMapper {
    public static void main(String[] args) {
        Student stu = new Student("leib",22);
        StudentVO studentVO = StudentMapper.INSTANCE.stuToStundentVO(stu);
        System.out.println(studentVO);
    }
}
