package cn.lhzh.cache.service.impl;

import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.mapper.EmployeeMapper;
import cn.lhzh.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 将方法的运行结果进行缓存，以后要相同的数据，直接从缓存中获取，不用调用方法
     * CacheManager管理多个Cache组件的，对缓存的真正CRUD操作在Cache组件中，每个缓存组件都有自己唯一一个名字
     * @Cacheable的几个属性
     *      cacheNames/value:指定缓存组件的名字
     *      key：缓存数据使用的key；可以用它来指定。默认是使用方法参数的值
     *              编写SPEL；#id：参数id的值
     *      keyGenerator：key的生成器；可以自己指定key的生成器组件id
     *              key、keyGenrator：二选一使用
     *      cacheManager：指定缓存管理器；或者CacheResolver指定获取解析器
     *      condition：指定符合条件情况下缓存
     *      unless：否定缓存；当unless指定的条件为true，方法的返回值不会被缓存；可以获取到结果进行判断
     *              unless="#result==null"
     *      sync：是否使用异步模式
     *
     * @param id
     * @return
     */
    @Override
    @Cacheable(cacheNames = {"emp"})
    public Employee getEmployeeById(Integer id) {
        System.out.println("查询"+id+"号员工");
        return employeeMapper.getEmployeeById(id);
    }
}
