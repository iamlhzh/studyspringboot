package cn.lhzh.cache.service.impl;

import cn.lhzh.cache.bean.Department;
import cn.lhzh.cache.bean.Employee;
import cn.lhzh.cache.mapper.DepartmentMapper;
import cn.lhzh.cache.mapper.EmployeeMapper;
import cn.lhzh.cache.service.DepService;
import cn.lhzh.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

@CacheConfig(cacheNames="emp")//抽取缓存的公共配置
@Service
public class DepServiceImpl implements DepService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    @Cacheable(cacheNames = {"dep"}/*,keyGenerator = "myKeyGenerator",condition = "#a0>1"*/)
    public Department getDepById(Integer id) {
        System.out.println("查询"+id+"号部门");
        return departmentMapper.getDepById(id);
    }

//    /**
//     * 将方法的运行结果进行缓存，以后要相同的数据，直接从缓存中获取，不用调用方法
//     * CacheManager管理多个Cache组件的，对缓存的真正CRUD操作在Cache组件中，每个缓存组件都有自己唯一一个名字
//     * @Cacheable的几个属性
//     *      cacheNames/value:指定缓存组件的名字
//     *      key：缓存数据使用的key；可以用它来指定。默认是使用方法参数的值
//     *              编写SPEL；#id：参数id的值
//     *      keyGenerator：key的生成器；可以自己指定key的生成器组件id
//     *              key、keyGenrator：二选一使用
//     *      cacheManager：指定缓存管理器；或者CacheResolver指定获取解析器
//     *      condition：指定符合条件情况下缓存
//     *              condition="#a0>1" 第一个参数的值》1时才缓存
//     *      unless：否定缓存；当unless指定的条件为true，方法的返回值不会被缓存；可以获取到结果进行判断
//     *              unless="#result==null"
//     *      sync：是否使用异步模式
//     *
//     * @param id
//     * @return
//     */
//    @Override
//    @Cacheable(cacheNames = {"emp"}/*,keyGenerator = "myKeyGenerator",condition = "#a0>1"*/)
//    public Employee getEmployeeById(Integer id) {
//        System.out.println("查询"+id+"号员工");
//        return employeeMapper.getEmployeeById(id);
//    }
//
//    /**
//     * @CachePut:既调用方法，又更新缓存数据
//     * 修改了数据库的某个数据，同时更新缓存
//     * 运行时机：
//     *      1。先调用目标方法
//     *      2。将目标方法的结果缓存起来
//     * 测试步骤：
//     *      1.查询1号员工；得到的结果会放在缓存中
//     *      2.以后查询还是之前的结果
//     *      3.更新1号员工；
//     *          将方法的返回值也放进缓存中了
//     *          key：传入的employee对象 值：返回的employee对象
//     *      4.查询1号员工？
//     *          应该是更新后的员工
//     *              key="#employee.id":使用传入的参数的员工id
//     *              key="#result.id":使用返回后的id
//     *      @Cacheable的key是不能用#result
//     *
//     * @param employee
//     * @return
//     */
//    @Override
//    @CachePut(value = "emp",key = "#result.id")
//    public Employee updateEmployee(Employee employee){
//        System.out.println("updateEmployee:"+employee);
//        employeeMapper.updateEmp(employee);
//        return employee;
//    }
//
//    /**
//     * @CacheEvict:缓存清除
//     * key：指定要清除的数据
//     * allEntries=true：指定清除这个缓存中所有的数据
//     * beforeInvocation=false：缓存的清除是否在方法之前执行
//     * @param id
//     * @return
//     */
//    @Override
//    @CacheEvict(value = "emp",key = "#id"/*,allEntries = true*/,beforeInvocation = true)
//    public String delEmployee(Integer id){
//        System.out.println("delEmployee:"+id);
////        employeeMapper.deleteEmpById(id);
////        int i=10/0;
//        return "success";
//    }
//
//    /**
//     * @Caching:定义复杂的缓存规则
//     * @param lastName
//     * @return
//     */
//    @Override
//    @Caching(
//            cacheable = {
//                    @Cacheable(value = "emp",key = "#lastName")
//            },
//            put = {
//                    @CachePut(value = "emp",key = "#result.id"),
//                    @CachePut(value = "emp",key = "#result.email")
//            }
//    )
//    public Employee getEmployeeByLastName(String lastName){
//        System.out.println("getEmployeeByLastName:"+lastName);
//        return  employeeMapper.getEmployeeByLastName(lastName);
//    }


}
