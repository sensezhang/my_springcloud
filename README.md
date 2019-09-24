# my_springcloud
技术：
springboot
	eureka
	zuul
	fegin
restful
restTemplate
swagger2
fastJson
	fastjson format BigDecimal(保留精度)
mybatis
	mybatis-Generator
redis
	redisTemplate
JWT
	AES
  
开发环境：
idea
jdk1.8
maven
redis
mysql

接口包括：
  创建一个 RESTful Web Service
	常用注解
	配置（context-path，port）
	https://spring.io/guides/gs/rest-service/
调用 RESTful Web Service
	RestTemplate 的使用
	https://spring.io/guides/gs/consuming-rest/
创建一个上传、下载文件的服务
	MultipartFile 的应用
	下载是文件名各浏览器的兼容处理
	https://spring.io/guides/gs/uploading-files/
统一处理异常并友好的返回
限制文件大小及类型

接口文档：
## Hello

调用url，传递参数，返回参数对应的你好信息。

### URL

> GET
>
> http://{IP}:{PORT}/practice/hello?name={name}

### 请求参数说明

| 参数 | 类型   | 必填 | 说明 |
| ---- | ------ | ---- | ---- |
| name | String | 是   | 名称 |

### 返回值

```json
{
    "code" : "0000",
    "msg" : "操作成功",
    "datas" : {
        "name" : "小明",
        "currentTime" : "2018-07-11 11:11:11"
    }
}
```

### 返回值说明

| 参数        | 类型     | 说明                                  |
| ----------- | -------- | ------------------------------------- |
| code        | String   | 状态码                                |
| msg         | String   | 提示信息                              |
| datas       | Object   | 返回对象                              |
| name        | String   | 参数传入名称                          |
| currentTime | DateTime | 当前日期 日期格式:yyyy-MM-dd HH:mm:ss |

## 文件上传

### URL

> POST/multipart
>
> http://{IP}:{PORT}/practice/upload

### 请求体说明

| 参数 | 类型 | 必填 | 说明     |
| ---- | ---- | ---- | -------- |
| file | 文件 | 是   | 上传文件 |

### 返回值

```json
{
    "code" : "0000",
    "msg" : "操作成功",
    "datas" : "12398129381928319"
}
```

### 返回值说明

| 参数  | 类型   | 说明                             |
| ----- | ------ | -------------------------------- |
| code  | String | 状态码                           |
| msg   | String | 提示信息                         |
| datas | String | 文件ID(可以重命名文件，如时间戳) |

## 文件下载

根据上一接口返回的文件ID，下载对应的文件

### URL

>GET
>
>http://{IP}:{PORT}/practice/download/{fileId}

### 请求参数说明

| 参数   | 类型   | 必输 | 说明     |
| ------ | ------ | ---- | -------- |
| fileId | String | 是   | 文件名ID |

### 返回值说明

实际文件内容

## 课后问题

1. 如何统一处理异常返回友好提示信息？
2. 文件上传如何限制文件大小和文件类型？

## 附录

### 状态码说明

| 状态码 | 说明                 |
| ------ | -------------------- |
| 0000   | 操作成功             |
| 1001   | 数据不合法，传入参数 |
| 1002   | 数据不存在           |
| 9999   | 未知错误             |

## 一对多查询实例

### URL

> POST
>
> http://{IP}:{PORT}/practice/invoice/query

### 请求参数

| 参数    | 类型   | 长度 | 是否必填 | 描述           | 说明 |
| ------- | ------ | ---- | -------- | -------------- | ---- |
| fpqqlsh | String | 20   | 是       | 发票请求流水号 |      |

### 请求体参数样例

```json
{
	"fpqqlsh": "12345678901234567890"
}
```

### 返回值

| 参数               | 类型    | 描述           | 说明                           |
| ------------------ | ------- | -------------- | ------------------------------ |
| code               | String  | 状态码         | [详见状态码说明](#状态码)      |
| msg                | String  | 信息说明       |                                |
| fpqqlsh            | String  | 开票请求流水号 |                                |
| statusCode         | String  | 开票状态       | 2-开票中;3-开票失败;4-开票成功 |
| data               | Object  | 票面信息       | statusCode=4时，返回data信息   |
| einvoiceCode       | String  | 发票代码       |                                |
| einvoiceNumber     | String  | 发票号码       |                                |
| randomNumber       | String  | 校验码         |                                |
| einvoiceName       | String  | 电子票据名称   |                                |
| invoicingPartyName | String  | 开票单位名称   |                                |
| issueDate          | String  | 开票日期       |                                |
| totalAmount        | double  | 合计金额       |                                |
| handlingPerson     | String  | 开票人         |                                |
| payerPartyName     | String  | 交款人名称     |                                |
| itemCode           | String  | 项目编码       |                                |
| itemName           | String  | 项目名称       |                                |
| itemUnit           | String  | 单位           |                                |
| itemQuantity       | integer | 数量           |                                |
| itemStd            | double  | 标准           |                                |
| itemAmount         | double  | 金额           |                                |

### 返回值样例

```json
{
	"code": "0000",
	"msg": "查询成功",
	"datas": {
        "fpqqlsh": "12345678901234567891",
        "statusCode": "4",
        "statusMsg": "开票完成",
        "data": {
            "einvoiceCode": "12345678",
            "einvoiceNumber": "1234567890",
            "randomNumber" : "sdlkfj",
            "issueDate": "20180713",
            "totalAmount": 100.00,
            "handlingPerson": "开票人",
            "payerPartyName": "交款人名称",
            "items": [{
                "itemCode": "2390",
                "itemName": "加油计划",
                "itemUnit": "元",
                "itemQuantity": 1,
                "itemStd": 100,
                "itemAmount": 100.00
            }]
        }
    }
}
```

## 实现接口签名

要求如下：

1. 对上面接口实现签名鉴权；
2. 使用JWT（https://jwt.io/）进行验签；
3. 对于非法请求提示`签名验签失败`!

签名Header信息

> | 参数 |   类型 | 是否必填 |     描述     | 备注             |
> | :--- | -----: | :------: | :----------: | ---------------- |
> | sign | String |    是    | 请求签名信息 | 使用JWT生成token |

> JWT签名说明详见 https://jwt.io/，各类编程语言参考官网的支持列表。
> 一个JWT实际上就是一个字符串，它由三部分组成，头部、载荷与签名。

### 思考

1. jwt如何读取数字证书进行签名验签？
2. 了解对称加密、非对称加密、散列签名等相关算法思想；

## 使用Redis缓存查询结果

使用redis缓存上述查询接口查询接口，要求如下：

1. redis缓存数据key格式为：practice:invoice:{fpqqlsh}，value为查询结果json字符串；
2. redis缓存数据过期时间设置为10分钟；
3. 使用redisTemplate进行操作；

### 思考

1. 如何测试接口QPS?使用缓存和不使用缓存如何测试性能差异？

2. 除了用Redis，还有没有别的缓存实现方案可以在上面的例子中使用？

3. Redis支持哪些数据格式？可以应用在哪些场景中？

4. 如果有更新数据库数据操作，如何保证数据库数据和缓存数据一致性？

5. Redis的IO模型是什么？

   

## 附

###主表SQL

```sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for inv_apply
-- ----------------------------
DROP TABLE IF EXISTS `inv_apply`;
CREATE TABLE `inv_apply`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `fpqqlsh` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发票请求流水号',
  `einvoice_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子票据代码',
  `einvoice_number` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子票据号码',
  `random_number` varchar(6) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '校验码',
  `total_amount` decimal(17, 2) NOT NULL COMMENT '总金额',
  `issue_date` date NULL DEFAULT NULL COMMENT '开票日期',
  `payer_party_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '交款人名称',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `handling_person` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '开票人',
  `status_code` smallint(5) UNSIGNED NULL DEFAULT NULL COMMENT '票据状态 1-待开票 2-开票中 3-开票失败 4-开票成功',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ts` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '电子票据开票申请主表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

```

###子表SQL

```sql
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for inv_apply_b
-- ----------------------------
DROP TABLE IF EXISTS `inv_apply_b`;
CREATE TABLE `inv_apply_b`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
  `hid` bigint(20) UNSIGNED NOT NULL COMMENT '开票申请主表ID',
  `item_code` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '项目编码',
  `item_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '项目名称',
  `item_amount` decimal(17, 2) NOT NULL,
  `item_unit` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '单位',
  `item_quantity` int(11) NULL DEFAULT NULL,
  `item_std` decimal(17, 2) NULL DEFAULT NULL,
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ts` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间戳',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_appb_hid`(`hid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 33 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '电子票据开票申请子表\r\n' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

```



