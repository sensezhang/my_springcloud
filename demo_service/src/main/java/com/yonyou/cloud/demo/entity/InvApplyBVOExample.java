package com.yonyou.cloud.demo.entity;

import com.google.common.base.CaseFormat;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;


/**
 * 电子票据开票申请子表的查询类 inv_apply_b
 *
 * @author zhangwbin
 */
public class InvApplyBVOExample {

  /**
   * 选中的返回字段列表。 如果设置该值，则在相应的select语句中，只返回该字段列表中的字段值。 如果不设置该值，则默认返回返回表结构中的所有字段。
   *
   * @author zhangwbin
   */
  protected Collection<String> selectFields;

  private static final Set<String> allFields = Stream
      .of("`id`", "`hid`", "`item_code`", "`item_name`", "`item_amount`", "`item_unit`",
          "`item_quantity`", "`item_std`", "`create_time`", "`ts`").collect(Collectors.toSet());

  protected List<String> updateFields;

  /**
   *
   */
  protected String orderByClause;

  /**
   *
   */
  protected boolean distinct;

  /**
   *
   */
  protected Integer startPos;

  /**
   *
   */
  protected Integer pageSize;

  /**
   *
   */
  protected List<Criteria> oredCriteria;

  public Collection<String> getSelectFields() {
    return this.selectFields;
  }

  public void setSelectFields(Collection<String> selectFields) {
    selectFields.forEach(selectField -> addSelectField(selectField));
  }

  public void addSelectField(String selectField) {
    if (this.selectFields == null) {
      this.selectFields = new LinkedList();
    }
    selectField = String
        .format("`%s`", CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, selectField));
    if (allFields.contains(selectField)) {
      this.selectFields.add(selectField);
    }
  }

  public InvApplyBVOExample updateIdField() {
    updateFields.add("id");
    return this;
  }

  public InvApplyBVOExample updateHidField() {
    updateFields.add("hid");
    return this;
  }

  public InvApplyBVOExample updateItemCodeField() {
    updateFields.add("item_code");
    return this;
  }

  public InvApplyBVOExample updateItemNameField() {
    updateFields.add("item_name");
    return this;
  }

  public InvApplyBVOExample updateItemAmountField() {
    updateFields.add("item_amount");
    return this;
  }

  public InvApplyBVOExample updateItemUnitField() {
    updateFields.add("item_unit");
    return this;
  }

  public InvApplyBVOExample updateItemQuantityField() {
    updateFields.add("item_quantity");
    return this;
  }

  public InvApplyBVOExample updateItemStdField() {
    updateFields.add("item_std");
    return this;
  }

  public InvApplyBVOExample updateCreateTimeField() {
    updateFields.add("create_time");
    return this;
  }

  public InvApplyBVOExample updateTsField() {
    updateFields.add("ts");
    return this;
  }

  public InvApplyBVOExample addPageNumAndPageSize(Integer pageNum, Integer pageSize) {
    if (pageNum != null && pageSize != null) {
      this.setStartPos((pageNum - 1) * pageSize);
      this.setPageSize(pageSize);
    }
    return this;
  }

  public InvApplyBVOExample addPageNumAndPageSize(String pageNum, String pageSize) {
    if (pageNum != null && pageSize != null) {
      int num = Integer.valueOf(pageNum);
      int size = Integer.valueOf(pageSize);
      this.setStartPos((num - 1) * size);
      this.setPageSize(size);
    }
    return this;
  }

  public InvApplyBVOExample() {
    oredCriteria = new ArrayList<Criteria>();
    updateFields = new ArrayList<String>();
  }

  public Integer getStartPos() {
    return startPos;
  }

  public void setStartPos(Integer startPos) {
    this.startPos = startPos;
  }

  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public InvApplyBVOExample orderByIdAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`id` asc";
    } else {
      orderByClause += ",`id` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByIdDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`id` desc";
    } else {
      orderByClause += ",`id` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByHidAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`hid` asc";
    } else {
      orderByClause += ",`hid` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByHidDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`hid` desc";
    } else {
      orderByClause += ",`hid` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemCodeAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_code` asc";
    } else {
      orderByClause += ",`item_code` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemCodeDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_code` desc";
    } else {
      orderByClause += ",`item_code` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemNameAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_name` asc";
    } else {
      orderByClause += ",`item_name` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemNameDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_name` desc";
    } else {
      orderByClause += ",`item_name` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemAmountAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_amount` asc";
    } else {
      orderByClause += ",`item_amount` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemAmountDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_amount` desc";
    } else {
      orderByClause += ",`item_amount` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemUnitAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_unit` asc";
    } else {
      orderByClause += ",`item_unit` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemUnitDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_unit` desc";
    } else {
      orderByClause += ",`item_unit` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemQuantityAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_quantity` asc";
    } else {
      orderByClause += ",`item_quantity` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemQuantityDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_quantity` desc";
    } else {
      orderByClause += ",`item_quantity` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemStdAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_std` asc";
    } else {
      orderByClause += ",`item_std` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByItemStdDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`item_std` desc";
    } else {
      orderByClause += ",`item_std` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByCreateTimeAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`create_time` asc";
    } else {
      orderByClause += ",`create_time` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByCreateTimeDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`create_time` desc";
    } else {
      orderByClause += ",`create_time` desc";
    }
    return this;
  }

  public InvApplyBVOExample orderByTsAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`ts` asc";
    } else {
      orderByClause += ",`ts` asc";
    }
    return this;
  }

  public InvApplyBVOExample orderByTsDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`ts` desc";
    } else {
      orderByClause += ",`ts` desc";
    }
    return this;
  }


  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  public void or(Criteria criteria) {
    if (!oredCriteria.contains(criteria)) {
      oredCriteria.add(criteria);
    }
  }

  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  protected abstract static class GeneratedCriteria {

    protected List<Criterion> andcriteria;

    protected List<Criterion> orcriteria;

    protected GeneratedCriteria() {
      super();
      andcriteria = new ArrayList<Criterion>();
      orcriteria = new ArrayList<Criterion>();
    }

    public boolean isValid() {
      return andcriteria.size() > 0;
    }

    public List<Criterion> getAllCriteria() {
      List<Criterion> list = new ArrayList<Criterion>(andcriteria.size() + orcriteria.size());
      list.addAll(andcriteria);
      list.addAll(orcriteria);
      return list;
    }

    public List<Criterion> getAndcriteria() {
      return andcriteria;
    }

    public List<Criterion> getOrcriteria() {
      return orcriteria;
    }

    protected void addOrCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      orcriteria.add(new Criterion(condition));
    }

    protected void addOrCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      orcriteria.add(new Criterion(condition, value));
    }

    protected void addOrCriterion(String condition, Object value1, Object value2, String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      orcriteria.add(new Criterion(condition, value1, value2));
    }

    protected void addAndCriterion(String condition) {
      if (condition == null) {
        throw new RuntimeException("Value for condition cannot be null");
      }
      andcriteria.add(new Criterion(condition));
    }

    protected void addAndCriterion(String condition, Object value, String property) {
      if (value == null) {
        throw new RuntimeException("Value for " + property + " cannot be null");
      }
      andcriteria.add(new Criterion(condition, value));
    }

    protected void addAndCriterion(String condition, Object value1, Object value2,
        String property) {
      if (value1 == null || value2 == null) {
        throw new RuntimeException("Between values for " + property + " cannot be null");
      }
      andcriteria.add(new Criterion(condition, value1, value2));
    }

    public Criteria andIdIsNull() {
      addAndCriterion("`id` is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addAndCriterion("`id` is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(Long value) {
      addAndCriterion("`id` =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Long value) {
      addAndCriterion("`id` <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Long value) {
      addAndCriterion("`id` >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Long value) {
      addAndCriterion("`id` >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Long value) {
      addAndCriterion("`id` <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Long value) {
      addAndCriterion("`id` <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Long> values) {
      addAndCriterion("`id` in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Long> values) {
      addAndCriterion("`id` not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Long value1, Long value2) {
      addAndCriterion("`id` between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Long value1, Long value2) {
      addAndCriterion("`id` not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andHidIsNull() {
      addAndCriterion("`hid` is null");
      return (Criteria) this;
    }

    public Criteria andHidIsNotNull() {
      addAndCriterion("`hid` is not null");
      return (Criteria) this;
    }

    public Criteria andHidEqualTo(Long value) {
      addAndCriterion("`hid` =", value, "hid");
      return (Criteria) this;
    }

    public Criteria andHidNotEqualTo(Long value) {
      addAndCriterion("`hid` <>", value, "hid");
      return (Criteria) this;
    }

    public Criteria andHidGreaterThan(Long value) {
      addAndCriterion("`hid` >", value, "hid");
      return (Criteria) this;
    }

    public Criteria andHidGreaterThanOrEqualTo(Long value) {
      addAndCriterion("`hid` >=", value, "hid");
      return (Criteria) this;
    }

    public Criteria andHidLessThan(Long value) {
      addAndCriterion("`hid` <", value, "hid");
      return (Criteria) this;
    }

    public Criteria andHidLessThanOrEqualTo(Long value) {
      addAndCriterion("`hid` <=", value, "hid");
      return (Criteria) this;
    }

    public Criteria andHidIn(List<Long> values) {
      addAndCriterion("`hid` in", values, "hid");
      return (Criteria) this;
    }

    public Criteria andHidNotIn(List<Long> values) {
      addAndCriterion("`hid` not in", values, "hid");
      return (Criteria) this;
    }

    public Criteria andHidBetween(Long value1, Long value2) {
      addAndCriterion("`hid` between", value1, value2, "hid");
      return (Criteria) this;
    }

    public Criteria andHidNotBetween(Long value1, Long value2) {
      addAndCriterion("`hid` not between", value1, value2, "hid");
      return (Criteria) this;
    }

    public Criteria andItemCodeIsNull() {
      addAndCriterion("`item_code` is null");
      return (Criteria) this;
    }

    public Criteria andItemCodeIsNotNull() {
      addAndCriterion("`item_code` is not null");
      return (Criteria) this;
    }

    public Criteria andItemCodeEqualTo(String value) {
      addAndCriterion("`item_code` =", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeNotEqualTo(String value) {
      addAndCriterion("`item_code` <>", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeGreaterThan(String value) {
      addAndCriterion("`item_code` >", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
      addAndCriterion("`item_code` >=", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeLessThan(String value) {
      addAndCriterion("`item_code` <", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeLessThanOrEqualTo(String value) {
      addAndCriterion("`item_code` <=", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeLike(String value) {
      addAndCriterion("`item_code` like", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeNotLike(String value) {
      addAndCriterion("`item_code` not like", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeIn(List<String> values) {
      addAndCriterion("`item_code` in", values, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeNotIn(List<String> values) {
      addAndCriterion("`item_code` not in", values, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeBetween(String value1, String value2) {
      addAndCriterion("`item_code` between", value1, value2, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemCodeNotBetween(String value1, String value2) {
      addAndCriterion("`item_code` not between", value1, value2, "itemCode");
      return (Criteria) this;
    }

    public Criteria andItemNameIsNull() {
      addAndCriterion("`item_name` is null");
      return (Criteria) this;
    }

    public Criteria andItemNameIsNotNull() {
      addAndCriterion("`item_name` is not null");
      return (Criteria) this;
    }

    public Criteria andItemNameEqualTo(String value) {
      addAndCriterion("`item_name` =", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameNotEqualTo(String value) {
      addAndCriterion("`item_name` <>", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameGreaterThan(String value) {
      addAndCriterion("`item_name` >", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameGreaterThanOrEqualTo(String value) {
      addAndCriterion("`item_name` >=", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameLessThan(String value) {
      addAndCriterion("`item_name` <", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameLessThanOrEqualTo(String value) {
      addAndCriterion("`item_name` <=", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameLike(String value) {
      addAndCriterion("`item_name` like", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameNotLike(String value) {
      addAndCriterion("`item_name` not like", value, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameIn(List<String> values) {
      addAndCriterion("`item_name` in", values, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameNotIn(List<String> values) {
      addAndCriterion("`item_name` not in", values, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameBetween(String value1, String value2) {
      addAndCriterion("`item_name` between", value1, value2, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemNameNotBetween(String value1, String value2) {
      addAndCriterion("`item_name` not between", value1, value2, "itemName");
      return (Criteria) this;
    }

    public Criteria andItemAmountIsNull() {
      addAndCriterion("`item_amount` is null");
      return (Criteria) this;
    }

    public Criteria andItemAmountIsNotNull() {
      addAndCriterion("`item_amount` is not null");
      return (Criteria) this;
    }

    public Criteria andItemAmountEqualTo(BigDecimal value) {
      addAndCriterion("`item_amount` =", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountNotEqualTo(BigDecimal value) {
      addAndCriterion("`item_amount` <>", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountGreaterThan(BigDecimal value) {
      addAndCriterion("`item_amount` >", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountGreaterThanOrEqualTo(BigDecimal value) {
      addAndCriterion("`item_amount` >=", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountLessThan(BigDecimal value) {
      addAndCriterion("`item_amount` <", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountLessThanOrEqualTo(BigDecimal value) {
      addAndCriterion("`item_amount` <=", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountIn(List<BigDecimal> values) {
      addAndCriterion("`item_amount` in", values, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountNotIn(List<BigDecimal> values) {
      addAndCriterion("`item_amount` not in", values, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountBetween(BigDecimal value1, BigDecimal value2) {
      addAndCriterion("`item_amount` between", value1, value2, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemAmountNotBetween(BigDecimal value1, BigDecimal value2) {
      addAndCriterion("`item_amount` not between", value1, value2, "itemAmount");
      return (Criteria) this;
    }

    public Criteria andItemUnitIsNull() {
      addAndCriterion("`item_unit` is null");
      return (Criteria) this;
    }

    public Criteria andItemUnitIsNotNull() {
      addAndCriterion("`item_unit` is not null");
      return (Criteria) this;
    }

    public Criteria andItemUnitEqualTo(String value) {
      addAndCriterion("`item_unit` =", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitNotEqualTo(String value) {
      addAndCriterion("`item_unit` <>", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitGreaterThan(String value) {
      addAndCriterion("`item_unit` >", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitGreaterThanOrEqualTo(String value) {
      addAndCriterion("`item_unit` >=", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitLessThan(String value) {
      addAndCriterion("`item_unit` <", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitLessThanOrEqualTo(String value) {
      addAndCriterion("`item_unit` <=", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitLike(String value) {
      addAndCriterion("`item_unit` like", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitNotLike(String value) {
      addAndCriterion("`item_unit` not like", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitIn(List<String> values) {
      addAndCriterion("`item_unit` in", values, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitNotIn(List<String> values) {
      addAndCriterion("`item_unit` not in", values, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitBetween(String value1, String value2) {
      addAndCriterion("`item_unit` between", value1, value2, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemUnitNotBetween(String value1, String value2) {
      addAndCriterion("`item_unit` not between", value1, value2, "itemUnit");
      return (Criteria) this;
    }

    public Criteria andItemQuantityIsNull() {
      addAndCriterion("`item_quantity` is null");
      return (Criteria) this;
    }

    public Criteria andItemQuantityIsNotNull() {
      addAndCriterion("`item_quantity` is not null");
      return (Criteria) this;
    }

    public Criteria andItemQuantityEqualTo(Integer value) {
      addAndCriterion("`item_quantity` =", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityNotEqualTo(Integer value) {
      addAndCriterion("`item_quantity` <>", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityGreaterThan(Integer value) {
      addAndCriterion("`item_quantity` >", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityGreaterThanOrEqualTo(Integer value) {
      addAndCriterion("`item_quantity` >=", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityLessThan(Integer value) {
      addAndCriterion("`item_quantity` <", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityLessThanOrEqualTo(Integer value) {
      addAndCriterion("`item_quantity` <=", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityIn(List<Integer> values) {
      addAndCriterion("`item_quantity` in", values, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityNotIn(List<Integer> values) {
      addAndCriterion("`item_quantity` not in", values, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityBetween(Integer value1, Integer value2) {
      addAndCriterion("`item_quantity` between", value1, value2, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemQuantityNotBetween(Integer value1, Integer value2) {
      addAndCriterion("`item_quantity` not between", value1, value2, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria andItemStdIsNull() {
      addAndCriterion("`item_std` is null");
      return (Criteria) this;
    }

    public Criteria andItemStdIsNotNull() {
      addAndCriterion("`item_std` is not null");
      return (Criteria) this;
    }

    public Criteria andItemStdEqualTo(BigDecimal value) {
      addAndCriterion("`item_std` =", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdNotEqualTo(BigDecimal value) {
      addAndCriterion("`item_std` <>", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdGreaterThan(BigDecimal value) {
      addAndCriterion("`item_std` >", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdGreaterThanOrEqualTo(BigDecimal value) {
      addAndCriterion("`item_std` >=", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdLessThan(BigDecimal value) {
      addAndCriterion("`item_std` <", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdLessThanOrEqualTo(BigDecimal value) {
      addAndCriterion("`item_std` <=", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdIn(List<BigDecimal> values) {
      addAndCriterion("`item_std` in", values, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdNotIn(List<BigDecimal> values) {
      addAndCriterion("`item_std` not in", values, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdBetween(BigDecimal value1, BigDecimal value2) {
      addAndCriterion("`item_std` between", value1, value2, "itemStd");
      return (Criteria) this;
    }

    public Criteria andItemStdNotBetween(BigDecimal value1, BigDecimal value2) {
      addAndCriterion("`item_std` not between", value1, value2, "itemStd");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNull() {
      addAndCriterion("`create_time` is null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIsNotNull() {
      addAndCriterion("`create_time` is not null");
      return (Criteria) this;
    }

    public Criteria andCreateTimeEqualTo(Date value) {
      addAndCriterion("`create_time` =", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotEqualTo(Date value) {
      addAndCriterion("`create_time` <>", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThan(Date value) {
      addAndCriterion("`create_time` >", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
      addAndCriterion("`create_time` >=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThan(Date value) {
      addAndCriterion("`create_time` <", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
      addAndCriterion("`create_time` <=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeIn(List<Date> values) {
      addAndCriterion("`create_time` in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotIn(List<Date> values) {
      addAndCriterion("`create_time` not in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeBetween(Date value1, Date value2) {
      addAndCriterion("`create_time` between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
      addAndCriterion("`create_time` not between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria andTsIsNull() {
      addAndCriterion("`ts` is null");
      return (Criteria) this;
    }

    public Criteria andTsIsNotNull() {
      addAndCriterion("`ts` is not null");
      return (Criteria) this;
    }

    public Criteria andTsEqualTo(Date value) {
      addAndCriterion("`ts` =", value, "ts");
      return (Criteria) this;
    }

    public Criteria andTsNotEqualTo(Date value) {
      addAndCriterion("`ts` <>", value, "ts");
      return (Criteria) this;
    }

    public Criteria andTsGreaterThan(Date value) {
      addAndCriterion("`ts` >", value, "ts");
      return (Criteria) this;
    }

    public Criteria andTsGreaterThanOrEqualTo(Date value) {
      addAndCriterion("`ts` >=", value, "ts");
      return (Criteria) this;
    }

    public Criteria andTsLessThan(Date value) {
      addAndCriterion("`ts` <", value, "ts");
      return (Criteria) this;
    }

    public Criteria andTsLessThanOrEqualTo(Date value) {
      addAndCriterion("`ts` <=", value, "ts");
      return (Criteria) this;
    }

    public Criteria andTsIn(List<Date> values) {
      addAndCriterion("`ts` in", values, "ts");
      return (Criteria) this;
    }

    public Criteria andTsNotIn(List<Date> values) {
      addAndCriterion("`ts` not in", values, "ts");
      return (Criteria) this;
    }

    public Criteria andTsBetween(Date value1, Date value2) {
      addAndCriterion("`ts` between", value1, value2, "ts");
      return (Criteria) this;
    }

    public Criteria andTsNotBetween(Date value1, Date value2) {
      addAndCriterion("`ts` not between", value1, value2, "ts");
      return (Criteria) this;
    }

    public Criteria orIdIsNull() {
      addOrCriterion("`id` is null");
      return (Criteria) this;
    }

    public Criteria orIdIsNotNull() {
      addOrCriterion("`id` is not null");
      return (Criteria) this;
    }

    public Criteria orIdEqualTo(Long value) {
      addOrCriterion("`id` =", value, "id");
      return (Criteria) this;
    }

    public Criteria orIdNotEqualTo(Long value) {
      addOrCriterion("`id` <>", value, "id");
      return (Criteria) this;
    }

    public Criteria orIdGreaterThan(Long value) {
      addOrCriterion("`id` >", value, "id");
      return (Criteria) this;
    }

    public Criteria orIdGreaterThanOrEqualTo(Long value) {
      addOrCriterion("`id` >=", value, "id");
      return (Criteria) this;
    }

    public Criteria orIdLessThan(Long value) {
      addOrCriterion("`id` <", value, "id");
      return (Criteria) this;
    }

    public Criteria orIdLessThanOrEqualTo(Long value) {
      addOrCriterion("`id` <=", value, "id");
      return (Criteria) this;
    }

    public Criteria orIdIn(List<Long> values) {
      addOrCriterion("`id` in", values, "id");
      return (Criteria) this;
    }

    public Criteria orIdNotIn(List<Long> values) {
      addOrCriterion("`id` not in", values, "id");
      return (Criteria) this;
    }

    public Criteria orIdBetween(Long value1, Long value2) {
      addOrCriterion("`id` between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria orIdNotBetween(Long value1, Long value2) {
      addOrCriterion("`id` not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria orHidIsNull() {
      addOrCriterion("`hid` is null");
      return (Criteria) this;
    }

    public Criteria orHidIsNotNull() {
      addOrCriterion("`hid` is not null");
      return (Criteria) this;
    }

    public Criteria orHidEqualTo(Long value) {
      addOrCriterion("`hid` =", value, "hid");
      return (Criteria) this;
    }

    public Criteria orHidNotEqualTo(Long value) {
      addOrCriterion("`hid` <>", value, "hid");
      return (Criteria) this;
    }

    public Criteria orHidGreaterThan(Long value) {
      addOrCriterion("`hid` >", value, "hid");
      return (Criteria) this;
    }

    public Criteria orHidGreaterThanOrEqualTo(Long value) {
      addOrCriterion("`hid` >=", value, "hid");
      return (Criteria) this;
    }

    public Criteria orHidLessThan(Long value) {
      addOrCriterion("`hid` <", value, "hid");
      return (Criteria) this;
    }

    public Criteria orHidLessThanOrEqualTo(Long value) {
      addOrCriterion("`hid` <=", value, "hid");
      return (Criteria) this;
    }

    public Criteria orHidIn(List<Long> values) {
      addOrCriterion("`hid` in", values, "hid");
      return (Criteria) this;
    }

    public Criteria orHidNotIn(List<Long> values) {
      addOrCriterion("`hid` not in", values, "hid");
      return (Criteria) this;
    }

    public Criteria orHidBetween(Long value1, Long value2) {
      addOrCriterion("`hid` between", value1, value2, "hid");
      return (Criteria) this;
    }

    public Criteria orHidNotBetween(Long value1, Long value2) {
      addOrCriterion("`hid` not between", value1, value2, "hid");
      return (Criteria) this;
    }

    public Criteria orItemCodeIsNull() {
      addOrCriterion("`item_code` is null");
      return (Criteria) this;
    }

    public Criteria orItemCodeIsNotNull() {
      addOrCriterion("`item_code` is not null");
      return (Criteria) this;
    }

    public Criteria orItemCodeEqualTo(String value) {
      addOrCriterion("`item_code` =", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeNotEqualTo(String value) {
      addOrCriterion("`item_code` <>", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeGreaterThan(String value) {
      addOrCriterion("`item_code` >", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeGreaterThanOrEqualTo(String value) {
      addOrCriterion("`item_code` >=", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeLessThan(String value) {
      addOrCriterion("`item_code` <", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeLessThanOrEqualTo(String value) {
      addOrCriterion("`item_code` <=", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeLike(String value) {
      addOrCriterion("`item_code` like", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeNotLike(String value) {
      addOrCriterion("`item_code` not like", value, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeIn(List<String> values) {
      addOrCriterion("`item_code` in", values, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeNotIn(List<String> values) {
      addOrCriterion("`item_code` not in", values, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeBetween(String value1, String value2) {
      addOrCriterion("`item_code` between", value1, value2, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemCodeNotBetween(String value1, String value2) {
      addOrCriterion("`item_code` not between", value1, value2, "itemCode");
      return (Criteria) this;
    }

    public Criteria orItemNameIsNull() {
      addOrCriterion("`item_name` is null");
      return (Criteria) this;
    }

    public Criteria orItemNameIsNotNull() {
      addOrCriterion("`item_name` is not null");
      return (Criteria) this;
    }

    public Criteria orItemNameEqualTo(String value) {
      addOrCriterion("`item_name` =", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameNotEqualTo(String value) {
      addOrCriterion("`item_name` <>", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameGreaterThan(String value) {
      addOrCriterion("`item_name` >", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameGreaterThanOrEqualTo(String value) {
      addOrCriterion("`item_name` >=", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameLessThan(String value) {
      addOrCriterion("`item_name` <", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameLessThanOrEqualTo(String value) {
      addOrCriterion("`item_name` <=", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameLike(String value) {
      addOrCriterion("`item_name` like", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameNotLike(String value) {
      addOrCriterion("`item_name` not like", value, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameIn(List<String> values) {
      addOrCriterion("`item_name` in", values, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameNotIn(List<String> values) {
      addOrCriterion("`item_name` not in", values, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameBetween(String value1, String value2) {
      addOrCriterion("`item_name` between", value1, value2, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemNameNotBetween(String value1, String value2) {
      addOrCriterion("`item_name` not between", value1, value2, "itemName");
      return (Criteria) this;
    }

    public Criteria orItemAmountIsNull() {
      addOrCriterion("`item_amount` is null");
      return (Criteria) this;
    }

    public Criteria orItemAmountIsNotNull() {
      addOrCriterion("`item_amount` is not null");
      return (Criteria) this;
    }

    public Criteria orItemAmountEqualTo(BigDecimal value) {
      addOrCriterion("`item_amount` =", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountNotEqualTo(BigDecimal value) {
      addOrCriterion("`item_amount` <>", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountGreaterThan(BigDecimal value) {
      addOrCriterion("`item_amount` >", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountGreaterThanOrEqualTo(BigDecimal value) {
      addOrCriterion("`item_amount` >=", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountLessThan(BigDecimal value) {
      addOrCriterion("`item_amount` <", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountLessThanOrEqualTo(BigDecimal value) {
      addOrCriterion("`item_amount` <=", value, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountIn(List<BigDecimal> values) {
      addOrCriterion("`item_amount` in", values, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountNotIn(List<BigDecimal> values) {
      addOrCriterion("`item_amount` not in", values, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountBetween(BigDecimal value1, BigDecimal value2) {
      addOrCriterion("`item_amount` between", value1, value2, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemAmountNotBetween(BigDecimal value1, BigDecimal value2) {
      addOrCriterion("`item_amount` not between", value1, value2, "itemAmount");
      return (Criteria) this;
    }

    public Criteria orItemUnitIsNull() {
      addOrCriterion("`item_unit` is null");
      return (Criteria) this;
    }

    public Criteria orItemUnitIsNotNull() {
      addOrCriterion("`item_unit` is not null");
      return (Criteria) this;
    }

    public Criteria orItemUnitEqualTo(String value) {
      addOrCriterion("`item_unit` =", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitNotEqualTo(String value) {
      addOrCriterion("`item_unit` <>", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitGreaterThan(String value) {
      addOrCriterion("`item_unit` >", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitGreaterThanOrEqualTo(String value) {
      addOrCriterion("`item_unit` >=", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitLessThan(String value) {
      addOrCriterion("`item_unit` <", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitLessThanOrEqualTo(String value) {
      addOrCriterion("`item_unit` <=", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitLike(String value) {
      addOrCriterion("`item_unit` like", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitNotLike(String value) {
      addOrCriterion("`item_unit` not like", value, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitIn(List<String> values) {
      addOrCriterion("`item_unit` in", values, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitNotIn(List<String> values) {
      addOrCriterion("`item_unit` not in", values, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitBetween(String value1, String value2) {
      addOrCriterion("`item_unit` between", value1, value2, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemUnitNotBetween(String value1, String value2) {
      addOrCriterion("`item_unit` not between", value1, value2, "itemUnit");
      return (Criteria) this;
    }

    public Criteria orItemQuantityIsNull() {
      addOrCriterion("`item_quantity` is null");
      return (Criteria) this;
    }

    public Criteria orItemQuantityIsNotNull() {
      addOrCriterion("`item_quantity` is not null");
      return (Criteria) this;
    }

    public Criteria orItemQuantityEqualTo(Integer value) {
      addOrCriterion("`item_quantity` =", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityNotEqualTo(Integer value) {
      addOrCriterion("`item_quantity` <>", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityGreaterThan(Integer value) {
      addOrCriterion("`item_quantity` >", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityGreaterThanOrEqualTo(Integer value) {
      addOrCriterion("`item_quantity` >=", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityLessThan(Integer value) {
      addOrCriterion("`item_quantity` <", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityLessThanOrEqualTo(Integer value) {
      addOrCriterion("`item_quantity` <=", value, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityIn(List<Integer> values) {
      addOrCriterion("`item_quantity` in", values, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityNotIn(List<Integer> values) {
      addOrCriterion("`item_quantity` not in", values, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityBetween(Integer value1, Integer value2) {
      addOrCriterion("`item_quantity` between", value1, value2, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemQuantityNotBetween(Integer value1, Integer value2) {
      addOrCriterion("`item_quantity` not between", value1, value2, "itemQuantity");
      return (Criteria) this;
    }

    public Criteria orItemStdIsNull() {
      addOrCriterion("`item_std` is null");
      return (Criteria) this;
    }

    public Criteria orItemStdIsNotNull() {
      addOrCriterion("`item_std` is not null");
      return (Criteria) this;
    }

    public Criteria orItemStdEqualTo(BigDecimal value) {
      addOrCriterion("`item_std` =", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdNotEqualTo(BigDecimal value) {
      addOrCriterion("`item_std` <>", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdGreaterThan(BigDecimal value) {
      addOrCriterion("`item_std` >", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdGreaterThanOrEqualTo(BigDecimal value) {
      addOrCriterion("`item_std` >=", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdLessThan(BigDecimal value) {
      addOrCriterion("`item_std` <", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdLessThanOrEqualTo(BigDecimal value) {
      addOrCriterion("`item_std` <=", value, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdIn(List<BigDecimal> values) {
      addOrCriterion("`item_std` in", values, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdNotIn(List<BigDecimal> values) {
      addOrCriterion("`item_std` not in", values, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdBetween(BigDecimal value1, BigDecimal value2) {
      addOrCriterion("`item_std` between", value1, value2, "itemStd");
      return (Criteria) this;
    }

    public Criteria orItemStdNotBetween(BigDecimal value1, BigDecimal value2) {
      addOrCriterion("`item_std` not between", value1, value2, "itemStd");
      return (Criteria) this;
    }

    public Criteria orCreateTimeIsNull() {
      addOrCriterion("`create_time` is null");
      return (Criteria) this;
    }

    public Criteria orCreateTimeIsNotNull() {
      addOrCriterion("`create_time` is not null");
      return (Criteria) this;
    }

    public Criteria orCreateTimeEqualTo(Date value) {
      addOrCriterion("`create_time` =", value, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeNotEqualTo(Date value) {
      addOrCriterion("`create_time` <>", value, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeGreaterThan(Date value) {
      addOrCriterion("`create_time` >", value, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeGreaterThanOrEqualTo(Date value) {
      addOrCriterion("`create_time` >=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeLessThan(Date value) {
      addOrCriterion("`create_time` <", value, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeLessThanOrEqualTo(Date value) {
      addOrCriterion("`create_time` <=", value, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeIn(List<Date> values) {
      addOrCriterion("`create_time` in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeNotIn(List<Date> values) {
      addOrCriterion("`create_time` not in", values, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeBetween(Date value1, Date value2) {
      addOrCriterion("`create_time` between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria orCreateTimeNotBetween(Date value1, Date value2) {
      addOrCriterion("`create_time` not between", value1, value2, "createTime");
      return (Criteria) this;
    }

    public Criteria orTsIsNull() {
      addOrCriterion("`ts` is null");
      return (Criteria) this;
    }

    public Criteria orTsIsNotNull() {
      addOrCriterion("`ts` is not null");
      return (Criteria) this;
    }

    public Criteria orTsEqualTo(Date value) {
      addOrCriterion("`ts` =", value, "ts");
      return (Criteria) this;
    }

    public Criteria orTsNotEqualTo(Date value) {
      addOrCriterion("`ts` <>", value, "ts");
      return (Criteria) this;
    }

    public Criteria orTsGreaterThan(Date value) {
      addOrCriterion("`ts` >", value, "ts");
      return (Criteria) this;
    }

    public Criteria orTsGreaterThanOrEqualTo(Date value) {
      addOrCriterion("`ts` >=", value, "ts");
      return (Criteria) this;
    }

    public Criteria orTsLessThan(Date value) {
      addOrCriterion("`ts` <", value, "ts");
      return (Criteria) this;
    }

    public Criteria orTsLessThanOrEqualTo(Date value) {
      addOrCriterion("`ts` <=", value, "ts");
      return (Criteria) this;
    }

    public Criteria orTsIn(List<Date> values) {
      addOrCriterion("`ts` in", values, "ts");
      return (Criteria) this;
    }

    public Criteria orTsNotIn(List<Date> values) {
      addOrCriterion("`ts` not in", values, "ts");
      return (Criteria) this;
    }

    public Criteria orTsBetween(Date value1, Date value2) {
      addOrCriterion("`ts` between", value1, value2, "ts");
      return (Criteria) this;
    }

    public Criteria orTsNotBetween(Date value1, Date value2) {
      addOrCriterion("`ts` not between", value1, value2, "ts");
      return (Criteria) this;
    }
  }

  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }


  public static class Criterion {

    private String condition;

    private Object value;

    private Object secondValue;

    private boolean noValue;

    private boolean singleValue;

    private boolean betweenValue;

    private boolean listValue;

    private String typeHandler;

    public String getCondition() {
      return condition;
    }

    public Object getValue() {
      return value;
    }

    public Object getSecondValue() {
      return secondValue;
    }

    public boolean isNoValue() {
      return noValue;
    }

    public boolean isSingleValue() {
      return singleValue;
    }

    public boolean isBetweenValue() {
      return betweenValue;
    }

    public boolean isListValue() {
      return listValue;
    }

    public String getTypeHandler() {
      return typeHandler;
    }

    protected Criterion(String condition) {
      super();
      this.condition = condition;
      this.typeHandler = null;
      this.noValue = true;
    }

    protected Criterion(String condition, Object value, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.typeHandler = typeHandler;
      if (value instanceof List<?>) {
        this.listValue = true;
      } else {
        this.singleValue = true;
      }
    }

    protected Criterion(String condition, Object value) {
      this(condition, value, null);
    }

    protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
      super();
      this.condition = condition;
      this.value = value;
      this.secondValue = secondValue;
      this.typeHandler = typeHandler;
      this.betweenValue = true;
    }

    protected Criterion(String condition, Object value, Object secondValue) {
      this(condition, value, secondValue, null);
    }
  }

  public List<String> getUpdateFields() {
    return updateFields;
  }

  public void setUpdateFields(List<String> updateFields) {
    this.updateFields = updateFields;
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setOredCriteria(
      List<Criteria> oredCriteria) {
    this.oredCriteria = oredCriteria;
  }
}