package com.ssc.ssgm.fx.ifx.integration.curd.mapper;

import java.util.List;
import com.ssc.ssgm.fx.ifx.integration.curd.model.OutboundConfigEntity;
import com.ssc.ssgm.fx.ifx.integration.curd.model.OutboundConfigExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OutboundConfigMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByName(String name);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(OutboundConfigEntity row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(OutboundConfigEntity row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OutboundConfigEntity> selectByExampleWithBLOBs(OutboundConfigExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OutboundConfigEntity> selectByExampleWithBLOBs(OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OutboundConfigEntity> selectByExample(OutboundConfigExample example, RowBounds rowBounds);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OutboundConfigEntity> selectByExampleWithLock(OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OutboundConfigEntity> selectByExample(OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") OutboundConfigEntity row, @Param("example") OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleWithBLOBs(@Param("row") OutboundConfigEntity row, @Param("example") OutboundConfigExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") OutboundConfigEntity row, @Param("example") OutboundConfigExample example);
}