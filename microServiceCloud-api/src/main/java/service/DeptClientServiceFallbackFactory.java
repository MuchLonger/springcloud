package service;

import Entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @Time: 2019/11/26 22:02
 */

@Component
public class DeptClientServiceFallbackFactory  implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }
            @Override
            public Dept get(Long id) {
                return new Dept().setDeptNo(id)
                        .setDName("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDbSource("no this database in MySQL");
            }
            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
