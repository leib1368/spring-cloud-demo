package leib.demo.mapper;

import javax.annotation.Generated;
import leib.demo.bean.Student;
import leib.demo.bean.StudentVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-30T17:42:57+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentVO stuToStundentVO(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentVO studentVO = new StudentVO();

        studentVO.setName( student.getName() );
        studentVO.setAge( student.getAge() );

        return studentVO;
    }
}
