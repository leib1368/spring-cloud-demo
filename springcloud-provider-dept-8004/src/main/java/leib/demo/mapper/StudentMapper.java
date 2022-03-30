package leib.demo.mapper;

import leib.demo.bean.Car;
import leib.demo.bean.CarDTO;
import leib.demo.bean.Student;
import leib.demo.bean.StudentVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentVO stuToStundentVO(Student student);
}
