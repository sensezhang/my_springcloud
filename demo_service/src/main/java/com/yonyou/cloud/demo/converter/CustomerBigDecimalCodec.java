package com.yonyou.cloud.demo.converter;

import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.BigDecimalCodec;
import com.alibaba.fastjson.serializer.ContextObjectSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import java.text.DecimalFormat;

/**
 * @author zhangwbin bigDecimal序列化转换器
 */
public class CustomerBigDecimalCodec extends BigDecimalCodec implements ContextObjectSerializer {

  public final static CustomerBigDecimalCodec INSTANCE = new CustomerBigDecimalCodec();

  @Override
  public void write(JSONSerializer jsonSerializer, Object o, BeanContext beanContext) {
    SerializeWriter out = jsonSerializer.out;
    if (o == null) {
      out.writeString("");
      return;
    }
    String format = beanContext.getFormat();
    DecimalFormat decimalFormat = new DecimalFormat(format);
    out.writeString(decimalFormat.format(o));
  }

}
