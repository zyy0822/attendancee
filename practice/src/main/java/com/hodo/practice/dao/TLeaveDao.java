package com.hodo.practice.dao;

import com.hodo.practice.entity.TLeave;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 请假表(TLeave)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-03 16:46:39
 */
public interface TLeaveDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TLeave queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TLeave> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tLeave 实例对象
     * @return 对象列表
     */
    List<TLeave> queryAll(TLeave tLeave);

    /**
     * 新增数据
     *
     * @param tLeave 实例对象
     * @return 影响行数
     */
    int insert(TLeave tLeave);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TLeave> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TLeave> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TLeave> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TLeave> entities);

    /**
     * 修改数据
     *
     * @param tLeave 实例对象
     * @return 影响行数
     */
    int update(TLeave tLeave);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

