package com.star;

//import com.sfebiz.common.dao.domain.BaseQuery;
//import net.pocrd.entity.ServiceException;
//import org.apache.commons.lang.time.DateUtils;
//import org.apache.commons.lang3.StringUtils;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * <p>服务基类</p>
 * User: zhangdi
 * Date: 15/08/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class, TransactionalTestExecutionListener.class})
@ContextConfiguration(locations = {
        "classpath:/applicationContext.xml"})
@Ignore
public class BaseServiceTest {

    protected static Logger LOG = LoggerFactory.getLogger(BaseServiceTest.class);

    protected String env = "dev";
    /*
        @Resource
        protected MixedSkuManager mixedSkuManager;
    */

    /**
     * 添加商品的出库效期方案
     * @param skuId
     * @param warehouseId
     * @param plan
     * @param value
     * @return
     */
    /*protected SkuStockoutPeriodPlanEntity addSkuStockoutPeriodPlanEntity(long skuId, long warehouseId, String plan, int value) {
        SkuStockoutPeriodPlanEntity skuStockoutPeriodPlanEntity = new SkuStockoutPeriodPlanEntity();
        skuStockoutPeriodPlanEntity.setSkuId(skuId);
        skuStockoutPeriodPlanEntity.setWarehouseId(warehouseId);
        skuStockoutPeriodPlanEntity.setStockoutPeriodPlan(plan);
        skuStockoutPeriodPlanEntity.setStockoutPeriodPlanValue(value);
        return skuStockoutPeriodPlanEntity;
    }*/
}
