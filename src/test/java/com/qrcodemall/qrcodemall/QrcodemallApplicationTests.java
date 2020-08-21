package com.qrcodemall.qrcodemall;

import com.qrcodemall.controller.vo.GoodsVO;
import com.qrcodemall.entity.Goods;
import com.qrcodemall.entity.User;
import com.qrcodemall.util.BeanUtil;
import com.qrcodemall.util.DesUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@SpringBootTest
class QrcodemallApplicationTests {

    @Test
    void contextLoads() {
        testUser tu = new testUser();
        tu.name = "张三";
        tu = change(tu);
        System.out.println(tu.name);
    }
    testUser change(testUser tu) {
        tu.name = "zhangSan";
        return tu;
    }

}
class testUser{
    public String name;
}
