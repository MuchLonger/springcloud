package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @description:
 * @Time: 2019/11/23 14:45
 */

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true) //使用链式
public class Dept implements Serializable {
    private Long deptNo;
    private String dName;
    // 表示使用哪个数据库
    private String dbSource;

    public Dept(String dName) {
        this.dName = dName;
    }
}
