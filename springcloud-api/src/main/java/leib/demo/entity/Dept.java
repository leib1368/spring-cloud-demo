package leib.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author:Leib
 * @Date 2020/5/9 11:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    //主键
    private Long deptno ;
    private String dname ;
    private String db_source ;

    public Dept(String dname){
        this.dname  = dname ;
    }
}
