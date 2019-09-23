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
 * 电子票据开票申请主表的查询类 inv_apply
 *
 * @author zhangwbin
 */
public class InvApplyVOExample {

  /**
   * 选中的返回字段列表。 如果设置该值，则在相应的select语句中，只返回该字段列表中的字段值。 如果不设置该值，则默认返回返回表结构中的所有字段。
   *
   * @author zhangwbin
   */
  protected Collection<String> selectFields;

  private static final Set<String> allFields = Stream
      .of("`id`", "`fpqqlsh`", "`einvoice_code`", "`einvoice_number`", "`random_number`",
          "`total_amount`", "`issue_date`", "`payer_party_name`", "`remark`", "`handling_person`",
          "`status_code`", "`create_time`", "`ts`").collect(Collectors.toSet());

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

  public InvApplyVOExample updateIdField() {
    updateFields.add("id");
    return this;
  }

  public InvApplyVOExample updateFpqqlshField() {
    updateFields.add("fpqqlsh");
    return this;
  }

  public InvApplyVOExample updateEinvoiceCodeField() {
    updateFields.add("einvoice_code");
    return this;
  }

  public InvApplyVOExample updateEinvoiceNumberField() {
    updateFields.add("einvoice_number");
    return this;
  }

  public InvApplyVOExample updateRandomNumberField() {
    updateFields.add("random_number");
    return this;
  }

  public InvApplyVOExample updateTotalAmountField() {
    updateFields.add("total_amount");
    return this;
  }

  public InvApplyVOExample updateIssueDateField() {
    updateFields.add("issue_date");
    return this;
  }

  public InvApplyVOExample updatePayerPartyNameField() {
    updateFields.add("payer_party_name");
    return this;
  }

  public InvApplyVOExample updateRemarkField() {
    updateFields.add("remark");
    return this;
  }

  public InvApplyVOExample updateHandlingPersonField() {
    updateFields.add("handling_person");
    return this;
  }

  public InvApplyVOExample updateStatusCodeField() {
    updateFields.add("status_code");
    return this;
  }

  public InvApplyVOExample updateCreateTimeField() {
    updateFields.add("create_time");
    return this;
  }

  public InvApplyVOExample updateTsField() {
    updateFields.add("ts");
    return this;
  }

  public InvApplyVOExample addPageNumAndPageSize(Integer pageNum, Integer pageSize) {
    if (pageNum != null && pageSize != null) {
      this.setStartPos((pageNum - 1) * pageSize);
      this.setPageSize(pageSize);
    }
    return this;
  }

  public InvApplyVOExample addPageNumAndPageSize(String pageNum, String pageSize) {
    if (pageNum != null && pageSize != null) {
      int num = Integer.valueOf(pageNum);
      int size = Integer.valueOf(pageSize);
      this.setStartPos((num - 1) * size);
      this.setPageSize(size);
    }
    return this;
  }

  public InvApplyVOExample() {
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

  public InvApplyVOExample orderByIdAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`id` asc";
    } else {
      orderByClause += ",`id` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByIdDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`id` desc";
    } else {
      orderByClause += ",`id` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByFpqqlshAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`fpqqlsh` asc";
    } else {
      orderByClause += ",`fpqqlsh` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByFpqqlshDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`fpqqlsh` desc";
    } else {
      orderByClause += ",`fpqqlsh` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByEinvoiceCodeAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`einvoice_code` asc";
    } else {
      orderByClause += ",`einvoice_code` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByEinvoiceCodeDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`einvoice_code` desc";
    } else {
      orderByClause += ",`einvoice_code` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByEinvoiceNumberAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`einvoice_number` asc";
    } else {
      orderByClause += ",`einvoice_number` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByEinvoiceNumberDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`einvoice_number` desc";
    } else {
      orderByClause += ",`einvoice_number` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByRandomNumberAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`random_number` asc";
    } else {
      orderByClause += ",`random_number` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByRandomNumberDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`random_number` desc";
    } else {
      orderByClause += ",`random_number` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByTotalAmountAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`total_amount` asc";
    } else {
      orderByClause += ",`total_amount` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByTotalAmountDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`total_amount` desc";
    } else {
      orderByClause += ",`total_amount` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByIssueDateAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`issue_date` asc";
    } else {
      orderByClause += ",`issue_date` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByIssueDateDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`issue_date` desc";
    } else {
      orderByClause += ",`issue_date` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByPayerPartyNameAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`payer_party_name` asc";
    } else {
      orderByClause += ",`payer_party_name` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByPayerPartyNameDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`payer_party_name` desc";
    } else {
      orderByClause += ",`payer_party_name` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByRemarkAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`remark` asc";
    } else {
      orderByClause += ",`remark` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByRemarkDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`remark` desc";
    } else {
      orderByClause += ",`remark` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByHandlingPersonAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`handling_person` asc";
    } else {
      orderByClause += ",`handling_person` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByHandlingPersonDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`handling_person` desc";
    } else {
      orderByClause += ",`handling_person` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByStatusCodeAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`status_code` asc";
    } else {
      orderByClause += ",`status_code` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByStatusCodeDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`status_code` desc";
    } else {
      orderByClause += ",`status_code` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByCreateTimeAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`create_time` asc";
    } else {
      orderByClause += ",`create_time` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByCreateTimeDesc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`create_time` desc";
    } else {
      orderByClause += ",`create_time` desc";
    }
    return this;
  }

  public InvApplyVOExample orderByTsAsc() {
    if (this.orderByClause == null || this.orderByClause.length() == 0) {
      orderByClause = "`ts` asc";
    } else {
      orderByClause += ",`ts` asc";
    }
    return this;
  }

  public InvApplyVOExample orderByTsDesc() {
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

    public Criteria andFpqqlshIsNull() {
      addAndCriterion("`fpqqlsh` is null");
      return (Criteria) this;
    }

    public Criteria andFpqqlshIsNotNull() {
      addAndCriterion("`fpqqlsh` is not null");
      return (Criteria) this;
    }

    public Criteria andFpqqlshEqualTo(String value) {
      addAndCriterion("`fpqqlsh` =", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshNotEqualTo(String value) {
      addAndCriterion("`fpqqlsh` <>", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshGreaterThan(String value) {
      addAndCriterion("`fpqqlsh` >", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshGreaterThanOrEqualTo(String value) {
      addAndCriterion("`fpqqlsh` >=", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshLessThan(String value) {
      addAndCriterion("`fpqqlsh` <", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshLessThanOrEqualTo(String value) {
      addAndCriterion("`fpqqlsh` <=", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshLike(String value) {
      addAndCriterion("`fpqqlsh` like", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshNotLike(String value) {
      addAndCriterion("`fpqqlsh` not like", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshIn(List<String> values) {
      addAndCriterion("`fpqqlsh` in", values, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshNotIn(List<String> values) {
      addAndCriterion("`fpqqlsh` not in", values, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshBetween(String value1, String value2) {
      addAndCriterion("`fpqqlsh` between", value1, value2, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andFpqqlshNotBetween(String value1, String value2) {
      addAndCriterion("`fpqqlsh` not between", value1, value2, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeIsNull() {
      addAndCriterion("`einvoice_code` is null");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeIsNotNull() {
      addAndCriterion("`einvoice_code` is not null");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeEqualTo(String value) {
      addAndCriterion("`einvoice_code` =", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeNotEqualTo(String value) {
      addAndCriterion("`einvoice_code` <>", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeGreaterThan(String value) {
      addAndCriterion("`einvoice_code` >", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeGreaterThanOrEqualTo(String value) {
      addAndCriterion("`einvoice_code` >=", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeLessThan(String value) {
      addAndCriterion("`einvoice_code` <", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeLessThanOrEqualTo(String value) {
      addAndCriterion("`einvoice_code` <=", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeLike(String value) {
      addAndCriterion("`einvoice_code` like", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeNotLike(String value) {
      addAndCriterion("`einvoice_code` not like", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeIn(List<String> values) {
      addAndCriterion("`einvoice_code` in", values, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeNotIn(List<String> values) {
      addAndCriterion("`einvoice_code` not in", values, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeBetween(String value1, String value2) {
      addAndCriterion("`einvoice_code` between", value1, value2, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceCodeNotBetween(String value1, String value2) {
      addAndCriterion("`einvoice_code` not between", value1, value2, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberIsNull() {
      addAndCriterion("`einvoice_number` is null");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberIsNotNull() {
      addAndCriterion("`einvoice_number` is not null");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberEqualTo(String value) {
      addAndCriterion("`einvoice_number` =", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberNotEqualTo(String value) {
      addAndCriterion("`einvoice_number` <>", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberGreaterThan(String value) {
      addAndCriterion("`einvoice_number` >", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberGreaterThanOrEqualTo(String value) {
      addAndCriterion("`einvoice_number` >=", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberLessThan(String value) {
      addAndCriterion("`einvoice_number` <", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberLessThanOrEqualTo(String value) {
      addAndCriterion("`einvoice_number` <=", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberLike(String value) {
      addAndCriterion("`einvoice_number` like", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberNotLike(String value) {
      addAndCriterion("`einvoice_number` not like", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberIn(List<String> values) {
      addAndCriterion("`einvoice_number` in", values, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberNotIn(List<String> values) {
      addAndCriterion("`einvoice_number` not in", values, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberBetween(String value1, String value2) {
      addAndCriterion("`einvoice_number` between", value1, value2, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andEinvoiceNumberNotBetween(String value1, String value2) {
      addAndCriterion("`einvoice_number` not between", value1, value2, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberIsNull() {
      addAndCriterion("`random_number` is null");
      return (Criteria) this;
    }

    public Criteria andRandomNumberIsNotNull() {
      addAndCriterion("`random_number` is not null");
      return (Criteria) this;
    }

    public Criteria andRandomNumberEqualTo(String value) {
      addAndCriterion("`random_number` =", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberNotEqualTo(String value) {
      addAndCriterion("`random_number` <>", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberGreaterThan(String value) {
      addAndCriterion("`random_number` >", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberGreaterThanOrEqualTo(String value) {
      addAndCriterion("`random_number` >=", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberLessThan(String value) {
      addAndCriterion("`random_number` <", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberLessThanOrEqualTo(String value) {
      addAndCriterion("`random_number` <=", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberLike(String value) {
      addAndCriterion("`random_number` like", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberNotLike(String value) {
      addAndCriterion("`random_number` not like", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberIn(List<String> values) {
      addAndCriterion("`random_number` in", values, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberNotIn(List<String> values) {
      addAndCriterion("`random_number` not in", values, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberBetween(String value1, String value2) {
      addAndCriterion("`random_number` between", value1, value2, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andRandomNumberNotBetween(String value1, String value2) {
      addAndCriterion("`random_number` not between", value1, value2, "randomNumber");
      return (Criteria) this;
    }

    public Criteria andTotalAmountIsNull() {
      addAndCriterion("`total_amount` is null");
      return (Criteria) this;
    }

    public Criteria andTotalAmountIsNotNull() {
      addAndCriterion("`total_amount` is not null");
      return (Criteria) this;
    }

    public Criteria andTotalAmountEqualTo(BigDecimal value) {
      addAndCriterion("`total_amount` =", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
      addAndCriterion("`total_amount` <>", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountGreaterThan(BigDecimal value) {
      addAndCriterion("`total_amount` >", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
      addAndCriterion("`total_amount` >=", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountLessThan(BigDecimal value) {
      addAndCriterion("`total_amount` <", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
      addAndCriterion("`total_amount` <=", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountIn(List<BigDecimal> values) {
      addAndCriterion("`total_amount` in", values, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
      addAndCriterion("`total_amount` not in", values, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
      addAndCriterion("`total_amount` between", value1, value2, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
      addAndCriterion("`total_amount` not between", value1, value2, "totalAmount");
      return (Criteria) this;
    }

    public Criteria andIssueDateIsNull() {
      addAndCriterion("`issue_date` is null");
      return (Criteria) this;
    }

    public Criteria andIssueDateIsNotNull() {
      addAndCriterion("`issue_date` is not null");
      return (Criteria) this;
    }

    public Criteria andIssueDateEqualTo(Date value) {
      addAndCriterion("`issue_date` =", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateNotEqualTo(Date value) {
      addAndCriterion("`issue_date` <>", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateGreaterThan(Date value) {
      addAndCriterion("`issue_date` >", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateGreaterThanOrEqualTo(Date value) {
      addAndCriterion("`issue_date` >=", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateLessThan(Date value) {
      addAndCriterion("`issue_date` <", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateLessThanOrEqualTo(Date value) {
      addAndCriterion("`issue_date` <=", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateIn(List<Date> values) {
      addAndCriterion("`issue_date` in", values, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateNotIn(List<Date> values) {
      addAndCriterion("`issue_date` not in", values, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateBetween(Date value1, Date value2) {
      addAndCriterion("`issue_date` between", value1, value2, "issueDate");
      return (Criteria) this;
    }

    public Criteria andIssueDateNotBetween(Date value1, Date value2) {
      addAndCriterion("`issue_date` not between", value1, value2, "issueDate");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameIsNull() {
      addAndCriterion("`payer_party_name` is null");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameIsNotNull() {
      addAndCriterion("`payer_party_name` is not null");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameEqualTo(String value) {
      addAndCriterion("`payer_party_name` =", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameNotEqualTo(String value) {
      addAndCriterion("`payer_party_name` <>", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameGreaterThan(String value) {
      addAndCriterion("`payer_party_name` >", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameGreaterThanOrEqualTo(String value) {
      addAndCriterion("`payer_party_name` >=", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameLessThan(String value) {
      addAndCriterion("`payer_party_name` <", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameLessThanOrEqualTo(String value) {
      addAndCriterion("`payer_party_name` <=", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameLike(String value) {
      addAndCriterion("`payer_party_name` like", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameNotLike(String value) {
      addAndCriterion("`payer_party_name` not like", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameIn(List<String> values) {
      addAndCriterion("`payer_party_name` in", values, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameNotIn(List<String> values) {
      addAndCriterion("`payer_party_name` not in", values, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameBetween(String value1, String value2) {
      addAndCriterion("`payer_party_name` between", value1, value2, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andPayerPartyNameNotBetween(String value1, String value2) {
      addAndCriterion("`payer_party_name` not between", value1, value2, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria andRemarkIsNull() {
      addAndCriterion("`remark` is null");
      return (Criteria) this;
    }

    public Criteria andRemarkIsNotNull() {
      addAndCriterion("`remark` is not null");
      return (Criteria) this;
    }

    public Criteria andRemarkEqualTo(String value) {
      addAndCriterion("`remark` =", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotEqualTo(String value) {
      addAndCriterion("`remark` <>", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkGreaterThan(String value) {
      addAndCriterion("`remark` >", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkGreaterThanOrEqualTo(String value) {
      addAndCriterion("`remark` >=", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLessThan(String value) {
      addAndCriterion("`remark` <", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLessThanOrEqualTo(String value) {
      addAndCriterion("`remark` <=", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkLike(String value) {
      addAndCriterion("`remark` like", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotLike(String value) {
      addAndCriterion("`remark` not like", value, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkIn(List<String> values) {
      addAndCriterion("`remark` in", values, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotIn(List<String> values) {
      addAndCriterion("`remark` not in", values, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkBetween(String value1, String value2) {
      addAndCriterion("`remark` between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria andRemarkNotBetween(String value1, String value2) {
      addAndCriterion("`remark` not between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonIsNull() {
      addAndCriterion("`handling_person` is null");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonIsNotNull() {
      addAndCriterion("`handling_person` is not null");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonEqualTo(String value) {
      addAndCriterion("`handling_person` =", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonNotEqualTo(String value) {
      addAndCriterion("`handling_person` <>", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonGreaterThan(String value) {
      addAndCriterion("`handling_person` >", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonGreaterThanOrEqualTo(String value) {
      addAndCriterion("`handling_person` >=", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonLessThan(String value) {
      addAndCriterion("`handling_person` <", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonLessThanOrEqualTo(String value) {
      addAndCriterion("`handling_person` <=", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonLike(String value) {
      addAndCriterion("`handling_person` like", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonNotLike(String value) {
      addAndCriterion("`handling_person` not like", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonIn(List<String> values) {
      addAndCriterion("`handling_person` in", values, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonNotIn(List<String> values) {
      addAndCriterion("`handling_person` not in", values, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonBetween(String value1, String value2) {
      addAndCriterion("`handling_person` between", value1, value2, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andHandlingPersonNotBetween(String value1, String value2) {
      addAndCriterion("`handling_person` not between", value1, value2, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria andStatusCodeIsNull() {
      addAndCriterion("`status_code` is null");
      return (Criteria) this;
    }

    public Criteria andStatusCodeIsNotNull() {
      addAndCriterion("`status_code` is not null");
      return (Criteria) this;
    }

    public Criteria andStatusCodeEqualTo(Integer value) {
      addAndCriterion("`status_code` =", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeNotEqualTo(Integer value) {
      addAndCriterion("`status_code` <>", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeGreaterThan(Integer value) {
      addAndCriterion("`status_code` >", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeGreaterThanOrEqualTo(Integer value) {
      addAndCriterion("`status_code` >=", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeLessThan(Integer value) {
      addAndCriterion("`status_code` <", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeLessThanOrEqualTo(Integer value) {
      addAndCriterion("`status_code` <=", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeIn(List<Integer> values) {
      addAndCriterion("`status_code` in", values, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeNotIn(List<Integer> values) {
      addAndCriterion("`status_code` not in", values, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeBetween(Integer value1, Integer value2) {
      addAndCriterion("`status_code` between", value1, value2, "statusCode");
      return (Criteria) this;
    }

    public Criteria andStatusCodeNotBetween(Integer value1, Integer value2) {
      addAndCriterion("`status_code` not between", value1, value2, "statusCode");
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

    public Criteria orFpqqlshIsNull() {
      addOrCriterion("`fpqqlsh` is null");
      return (Criteria) this;
    }

    public Criteria orFpqqlshIsNotNull() {
      addOrCriterion("`fpqqlsh` is not null");
      return (Criteria) this;
    }

    public Criteria orFpqqlshEqualTo(String value) {
      addOrCriterion("`fpqqlsh` =", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshNotEqualTo(String value) {
      addOrCriterion("`fpqqlsh` <>", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshGreaterThan(String value) {
      addOrCriterion("`fpqqlsh` >", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshGreaterThanOrEqualTo(String value) {
      addOrCriterion("`fpqqlsh` >=", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshLessThan(String value) {
      addOrCriterion("`fpqqlsh` <", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshLessThanOrEqualTo(String value) {
      addOrCriterion("`fpqqlsh` <=", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshLike(String value) {
      addOrCriterion("`fpqqlsh` like", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshNotLike(String value) {
      addOrCriterion("`fpqqlsh` not like", value, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshIn(List<String> values) {
      addOrCriterion("`fpqqlsh` in", values, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshNotIn(List<String> values) {
      addOrCriterion("`fpqqlsh` not in", values, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshBetween(String value1, String value2) {
      addOrCriterion("`fpqqlsh` between", value1, value2, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orFpqqlshNotBetween(String value1, String value2) {
      addOrCriterion("`fpqqlsh` not between", value1, value2, "fpqqlsh");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeIsNull() {
      addOrCriterion("`einvoice_code` is null");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeIsNotNull() {
      addOrCriterion("`einvoice_code` is not null");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeEqualTo(String value) {
      addOrCriterion("`einvoice_code` =", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeNotEqualTo(String value) {
      addOrCriterion("`einvoice_code` <>", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeGreaterThan(String value) {
      addOrCriterion("`einvoice_code` >", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeGreaterThanOrEqualTo(String value) {
      addOrCriterion("`einvoice_code` >=", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeLessThan(String value) {
      addOrCriterion("`einvoice_code` <", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeLessThanOrEqualTo(String value) {
      addOrCriterion("`einvoice_code` <=", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeLike(String value) {
      addOrCriterion("`einvoice_code` like", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeNotLike(String value) {
      addOrCriterion("`einvoice_code` not like", value, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeIn(List<String> values) {
      addOrCriterion("`einvoice_code` in", values, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeNotIn(List<String> values) {
      addOrCriterion("`einvoice_code` not in", values, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeBetween(String value1, String value2) {
      addOrCriterion("`einvoice_code` between", value1, value2, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceCodeNotBetween(String value1, String value2) {
      addOrCriterion("`einvoice_code` not between", value1, value2, "einvoiceCode");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberIsNull() {
      addOrCriterion("`einvoice_number` is null");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberIsNotNull() {
      addOrCriterion("`einvoice_number` is not null");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberEqualTo(String value) {
      addOrCriterion("`einvoice_number` =", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberNotEqualTo(String value) {
      addOrCriterion("`einvoice_number` <>", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberGreaterThan(String value) {
      addOrCriterion("`einvoice_number` >", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberGreaterThanOrEqualTo(String value) {
      addOrCriterion("`einvoice_number` >=", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberLessThan(String value) {
      addOrCriterion("`einvoice_number` <", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberLessThanOrEqualTo(String value) {
      addOrCriterion("`einvoice_number` <=", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberLike(String value) {
      addOrCriterion("`einvoice_number` like", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberNotLike(String value) {
      addOrCriterion("`einvoice_number` not like", value, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberIn(List<String> values) {
      addOrCriterion("`einvoice_number` in", values, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberNotIn(List<String> values) {
      addOrCriterion("`einvoice_number` not in", values, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberBetween(String value1, String value2) {
      addOrCriterion("`einvoice_number` between", value1, value2, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orEinvoiceNumberNotBetween(String value1, String value2) {
      addOrCriterion("`einvoice_number` not between", value1, value2, "einvoiceNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberIsNull() {
      addOrCriterion("`random_number` is null");
      return (Criteria) this;
    }

    public Criteria orRandomNumberIsNotNull() {
      addOrCriterion("`random_number` is not null");
      return (Criteria) this;
    }

    public Criteria orRandomNumberEqualTo(String value) {
      addOrCriterion("`random_number` =", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberNotEqualTo(String value) {
      addOrCriterion("`random_number` <>", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberGreaterThan(String value) {
      addOrCriterion("`random_number` >", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberGreaterThanOrEqualTo(String value) {
      addOrCriterion("`random_number` >=", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberLessThan(String value) {
      addOrCriterion("`random_number` <", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberLessThanOrEqualTo(String value) {
      addOrCriterion("`random_number` <=", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberLike(String value) {
      addOrCriterion("`random_number` like", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberNotLike(String value) {
      addOrCriterion("`random_number` not like", value, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberIn(List<String> values) {
      addOrCriterion("`random_number` in", values, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberNotIn(List<String> values) {
      addOrCriterion("`random_number` not in", values, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberBetween(String value1, String value2) {
      addOrCriterion("`random_number` between", value1, value2, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orRandomNumberNotBetween(String value1, String value2) {
      addOrCriterion("`random_number` not between", value1, value2, "randomNumber");
      return (Criteria) this;
    }

    public Criteria orTotalAmountIsNull() {
      addOrCriterion("`total_amount` is null");
      return (Criteria) this;
    }

    public Criteria orTotalAmountIsNotNull() {
      addOrCriterion("`total_amount` is not null");
      return (Criteria) this;
    }

    public Criteria orTotalAmountEqualTo(BigDecimal value) {
      addOrCriterion("`total_amount` =", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountNotEqualTo(BigDecimal value) {
      addOrCriterion("`total_amount` <>", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountGreaterThan(BigDecimal value) {
      addOrCriterion("`total_amount` >", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
      addOrCriterion("`total_amount` >=", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountLessThan(BigDecimal value) {
      addOrCriterion("`total_amount` <", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountLessThanOrEqualTo(BigDecimal value) {
      addOrCriterion("`total_amount` <=", value, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountIn(List<BigDecimal> values) {
      addOrCriterion("`total_amount` in", values, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountNotIn(List<BigDecimal> values) {
      addOrCriterion("`total_amount` not in", values, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
      addOrCriterion("`total_amount` between", value1, value2, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
      addOrCriterion("`total_amount` not between", value1, value2, "totalAmount");
      return (Criteria) this;
    }

    public Criteria orIssueDateIsNull() {
      addOrCriterion("`issue_date` is null");
      return (Criteria) this;
    }

    public Criteria orIssueDateIsNotNull() {
      addOrCriterion("`issue_date` is not null");
      return (Criteria) this;
    }

    public Criteria orIssueDateEqualTo(Date value) {
      addOrCriterion("`issue_date` =", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateNotEqualTo(Date value) {
      addOrCriterion("`issue_date` <>", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateGreaterThan(Date value) {
      addOrCriterion("`issue_date` >", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateGreaterThanOrEqualTo(Date value) {
      addOrCriterion("`issue_date` >=", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateLessThan(Date value) {
      addOrCriterion("`issue_date` <", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateLessThanOrEqualTo(Date value) {
      addOrCriterion("`issue_date` <=", value, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateIn(List<Date> values) {
      addOrCriterion("`issue_date` in", values, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateNotIn(List<Date> values) {
      addOrCriterion("`issue_date` not in", values, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateBetween(Date value1, Date value2) {
      addOrCriterion("`issue_date` between", value1, value2, "issueDate");
      return (Criteria) this;
    }

    public Criteria orIssueDateNotBetween(Date value1, Date value2) {
      addOrCriterion("`issue_date` not between", value1, value2, "issueDate");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameIsNull() {
      addOrCriterion("`payer_party_name` is null");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameIsNotNull() {
      addOrCriterion("`payer_party_name` is not null");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameEqualTo(String value) {
      addOrCriterion("`payer_party_name` =", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameNotEqualTo(String value) {
      addOrCriterion("`payer_party_name` <>", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameGreaterThan(String value) {
      addOrCriterion("`payer_party_name` >", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameGreaterThanOrEqualTo(String value) {
      addOrCriterion("`payer_party_name` >=", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameLessThan(String value) {
      addOrCriterion("`payer_party_name` <", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameLessThanOrEqualTo(String value) {
      addOrCriterion("`payer_party_name` <=", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameLike(String value) {
      addOrCriterion("`payer_party_name` like", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameNotLike(String value) {
      addOrCriterion("`payer_party_name` not like", value, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameIn(List<String> values) {
      addOrCriterion("`payer_party_name` in", values, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameNotIn(List<String> values) {
      addOrCriterion("`payer_party_name` not in", values, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameBetween(String value1, String value2) {
      addOrCriterion("`payer_party_name` between", value1, value2, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orPayerPartyNameNotBetween(String value1, String value2) {
      addOrCriterion("`payer_party_name` not between", value1, value2, "payerPartyName");
      return (Criteria) this;
    }

    public Criteria orRemarkIsNull() {
      addOrCriterion("`remark` is null");
      return (Criteria) this;
    }

    public Criteria orRemarkIsNotNull() {
      addOrCriterion("`remark` is not null");
      return (Criteria) this;
    }

    public Criteria orRemarkEqualTo(String value) {
      addOrCriterion("`remark` =", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkNotEqualTo(String value) {
      addOrCriterion("`remark` <>", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkGreaterThan(String value) {
      addOrCriterion("`remark` >", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkGreaterThanOrEqualTo(String value) {
      addOrCriterion("`remark` >=", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkLessThan(String value) {
      addOrCriterion("`remark` <", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkLessThanOrEqualTo(String value) {
      addOrCriterion("`remark` <=", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkLike(String value) {
      addOrCriterion("`remark` like", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkNotLike(String value) {
      addOrCriterion("`remark` not like", value, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkIn(List<String> values) {
      addOrCriterion("`remark` in", values, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkNotIn(List<String> values) {
      addOrCriterion("`remark` not in", values, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkBetween(String value1, String value2) {
      addOrCriterion("`remark` between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria orRemarkNotBetween(String value1, String value2) {
      addOrCriterion("`remark` not between", value1, value2, "remark");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonIsNull() {
      addOrCriterion("`handling_person` is null");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonIsNotNull() {
      addOrCriterion("`handling_person` is not null");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonEqualTo(String value) {
      addOrCriterion("`handling_person` =", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonNotEqualTo(String value) {
      addOrCriterion("`handling_person` <>", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonGreaterThan(String value) {
      addOrCriterion("`handling_person` >", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonGreaterThanOrEqualTo(String value) {
      addOrCriterion("`handling_person` >=", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonLessThan(String value) {
      addOrCriterion("`handling_person` <", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonLessThanOrEqualTo(String value) {
      addOrCriterion("`handling_person` <=", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonLike(String value) {
      addOrCriterion("`handling_person` like", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonNotLike(String value) {
      addOrCriterion("`handling_person` not like", value, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonIn(List<String> values) {
      addOrCriterion("`handling_person` in", values, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonNotIn(List<String> values) {
      addOrCriterion("`handling_person` not in", values, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonBetween(String value1, String value2) {
      addOrCriterion("`handling_person` between", value1, value2, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orHandlingPersonNotBetween(String value1, String value2) {
      addOrCriterion("`handling_person` not between", value1, value2, "handlingPerson");
      return (Criteria) this;
    }

    public Criteria orStatusCodeIsNull() {
      addOrCriterion("`status_code` is null");
      return (Criteria) this;
    }

    public Criteria orStatusCodeIsNotNull() {
      addOrCriterion("`status_code` is not null");
      return (Criteria) this;
    }

    public Criteria orStatusCodeEqualTo(Integer value) {
      addOrCriterion("`status_code` =", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeNotEqualTo(Integer value) {
      addOrCriterion("`status_code` <>", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeGreaterThan(Integer value) {
      addOrCriterion("`status_code` >", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeGreaterThanOrEqualTo(Integer value) {
      addOrCriterion("`status_code` >=", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeLessThan(Integer value) {
      addOrCriterion("`status_code` <", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeLessThanOrEqualTo(Integer value) {
      addOrCriterion("`status_code` <=", value, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeIn(List<Integer> values) {
      addOrCriterion("`status_code` in", values, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeNotIn(List<Integer> values) {
      addOrCriterion("`status_code` not in", values, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeBetween(Integer value1, Integer value2) {
      addOrCriterion("`status_code` between", value1, value2, "statusCode");
      return (Criteria) this;
    }

    public Criteria orStatusCodeNotBetween(Integer value1, Integer value2) {
      addOrCriterion("`status_code` not between", value1, value2, "statusCode");
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