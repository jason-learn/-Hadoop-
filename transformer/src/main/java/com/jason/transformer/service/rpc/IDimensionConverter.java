package com.jason.transformer.service.rpc;

import java.io.IOException;

import org.apache.hadoop.ipc.VersionedProtocol;

import com.jason.transformer.model.dim.base.BaseDimension;

/**
 * 提供专门操作dimension表的接口
 * 
 * @author jason
 *
 */
public interface IDimensionConverter extends VersionedProtocol {
    // 版本id
    public static final long versionID = 1;

    /**
     * 根据dimension的value值获取id<br/>
     * 如果数据库中有，那么直接返回。如果没有，那么进行插入后返回新的id值
     * 
     * @param dimension
     * @return
     * @throws IOException
     */
    public int getDimensionIdByValue(BaseDimension dimension) throws IOException;
}
