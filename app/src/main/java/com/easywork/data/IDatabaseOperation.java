package com.easywork.data;

import java.util.Objects;

/**
 * Created by Administrator on 2017/4/28.
 */

public interface IDatabaseOperation<T> {
    //更新数据
    abstract public void update(T t);
    //新增数据
    abstract public void insert(T t);
    //查找数据
    abstract public void query(T t);
    //删除数据
    abstract public void delete(T t);
}
