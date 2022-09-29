package com.ssc.ssgm.fx.ifx.integration.curd.mapper;

import java.util.List;
import com.ssc.ssgm.fx.ifx.integration.curd.model.InboundConfigEntity;
import com.ssc.ssgm.fx.ifx.integration.curd.model.InboundConfigExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface InboundConfigMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(InboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(InboundConfigExample example);
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteById(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(InboundConfigEntity row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(InboundConfigEntity row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<InboundConfigEntity> selectByExampleWithBLOBs(InboundConfigExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<InboundConfigEntity> selectByExampleWithBLOBs(InboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<InboundConfigEntity> selectByExample(InboundConfigExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<InboundConfigEntity> selectByExampleWithLock(InboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<InboundConfigEntity> selectByExample(InboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") InboundConfigEntity row, @Param("example") InboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleWithBLOBs(@Param("row") InboundConfigEntity row, @Param("example") InboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") InboundConfigEntity row, @Param("example") InboundConfigExample example);
}