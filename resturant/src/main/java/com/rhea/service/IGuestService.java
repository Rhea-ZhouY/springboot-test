package com.rhea.service;

import com.rhea.domain.Guest;
import java.util.List;

/**
 * @author Administrator
 */
public interface IGuestService {
    /**
     * 查询所有嘉宾
     * @return 返回嘉宾列表
     */
    List<Guest> selectAll();

    /**
     * 添加一个嘉宾
     * @param guest 添加的嘉宾对象
     */
    void add(Guest guest);

    /**
     * 修改嘉宾职位
     * @param guest 嘉宾对象
     */
    void toUpdate(Guest guest);

    /**
     * 查询一个人的信息
     * @param name 嘉宾的名字
     * @return 返回嘉宾对象
     */
    Guest selectOne(String name);

    /**
     * 删除一个嘉宾
     * @param name 嘉宾的名字
     */
    void delete(String name);
}
