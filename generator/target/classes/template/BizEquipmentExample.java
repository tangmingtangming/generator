package cn.aerotop.iplatform.core.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizEquipmentExample {
    /**
     * biz_equipment
     */
    protected String orderByClause;

    /**
     * biz_equipment
     */
    protected boolean distinct;

    /**
     * biz_equipment
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public BizEquipmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * biz_equipment null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidIsNull() {
            addCriterion("EQUIPTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidIsNotNull() {
            addCriterion("EQUIPTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidEqualTo(String value) {
            addCriterion("EQUIPTYPEID =", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidNotEqualTo(String value) {
            addCriterion("EQUIPTYPEID <>", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidGreaterThan(String value) {
            addCriterion("EQUIPTYPEID >", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPTYPEID >=", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidLessThan(String value) {
            addCriterion("EQUIPTYPEID <", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPTYPEID <=", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidLike(String value) {
            addCriterion("EQUIPTYPEID like", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidNotLike(String value) {
            addCriterion("EQUIPTYPEID not like", value, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidIn(List<String> values) {
            addCriterion("EQUIPTYPEID in", values, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidNotIn(List<String> values) {
            addCriterion("EQUIPTYPEID not in", values, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidBetween(String value1, String value2) {
            addCriterion("EQUIPTYPEID between", value1, value2, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquiptypeidNotBetween(String value1, String value2) {
            addCriterion("EQUIPTYPEID not between", value1, value2, "equiptypeid");
            return (Criteria) this;
        }

        public Criteria andEquipnameIsNull() {
            addCriterion("EQUIPNAME is null");
            return (Criteria) this;
        }

        public Criteria andEquipnameIsNotNull() {
            addCriterion("EQUIPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEquipnameEqualTo(String value) {
            addCriterion("EQUIPNAME =", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotEqualTo(String value) {
            addCriterion("EQUIPNAME <>", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameGreaterThan(String value) {
            addCriterion("EQUIPNAME >", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPNAME >=", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameLessThan(String value) {
            addCriterion("EQUIPNAME <", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameLessThanOrEqualTo(String value) {
            addCriterion("EQUIPNAME <=", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameLike(String value) {
            addCriterion("EQUIPNAME like", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotLike(String value) {
            addCriterion("EQUIPNAME not like", value, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameIn(List<String> values) {
            addCriterion("EQUIPNAME in", values, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotIn(List<String> values) {
            addCriterion("EQUIPNAME not in", values, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameBetween(String value1, String value2) {
            addCriterion("EQUIPNAME between", value1, value2, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipnameNotBetween(String value1, String value2) {
            addCriterion("EQUIPNAME not between", value1, value2, "equipname");
            return (Criteria) this;
        }

        public Criteria andEquipcodeIsNull() {
            addCriterion("EQUIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andEquipcodeIsNotNull() {
            addCriterion("EQUIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andEquipcodeEqualTo(String value) {
            addCriterion("EQUIPCODE =", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeNotEqualTo(String value) {
            addCriterion("EQUIPCODE <>", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeGreaterThan(String value) {
            addCriterion("EQUIPCODE >", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPCODE >=", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeLessThan(String value) {
            addCriterion("EQUIPCODE <", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeLessThanOrEqualTo(String value) {
            addCriterion("EQUIPCODE <=", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeLike(String value) {
            addCriterion("EQUIPCODE like", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeNotLike(String value) {
            addCriterion("EQUIPCODE not like", value, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeIn(List<String> values) {
            addCriterion("EQUIPCODE in", values, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeNotIn(List<String> values) {
            addCriterion("EQUIPCODE not in", values, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeBetween(String value1, String value2) {
            addCriterion("EQUIPCODE between", value1, value2, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquipcodeNotBetween(String value1, String value2) {
            addCriterion("EQUIPCODE not between", value1, value2, "equipcode");
            return (Criteria) this;
        }

        public Criteria andEquippnameIsNull() {
            addCriterion("EQUIPPNAME is null");
            return (Criteria) this;
        }

        public Criteria andEquippnameIsNotNull() {
            addCriterion("EQUIPPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEquippnameEqualTo(String value) {
            addCriterion("EQUIPPNAME =", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameNotEqualTo(String value) {
            addCriterion("EQUIPPNAME <>", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameGreaterThan(String value) {
            addCriterion("EQUIPPNAME >", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPPNAME >=", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameLessThan(String value) {
            addCriterion("EQUIPPNAME <", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameLessThanOrEqualTo(String value) {
            addCriterion("EQUIPPNAME <=", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameLike(String value) {
            addCriterion("EQUIPPNAME like", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameNotLike(String value) {
            addCriterion("EQUIPPNAME not like", value, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameIn(List<String> values) {
            addCriterion("EQUIPPNAME in", values, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameNotIn(List<String> values) {
            addCriterion("EQUIPPNAME not in", values, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameBetween(String value1, String value2) {
            addCriterion("EQUIPPNAME between", value1, value2, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquippnameNotBetween(String value1, String value2) {
            addCriterion("EQUIPPNAME not between", value1, value2, "equippname");
            return (Criteria) this;
        }

        public Criteria andEquipseqIsNull() {
            addCriterion("EQUIPSEQ is null");
            return (Criteria) this;
        }

        public Criteria andEquipseqIsNotNull() {
            addCriterion("EQUIPSEQ is not null");
            return (Criteria) this;
        }

        public Criteria andEquipseqEqualTo(String value) {
            addCriterion("EQUIPSEQ =", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqNotEqualTo(String value) {
            addCriterion("EQUIPSEQ <>", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqGreaterThan(String value) {
            addCriterion("EQUIPSEQ >", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPSEQ >=", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqLessThan(String value) {
            addCriterion("EQUIPSEQ <", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqLessThanOrEqualTo(String value) {
            addCriterion("EQUIPSEQ <=", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqLike(String value) {
            addCriterion("EQUIPSEQ like", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqNotLike(String value) {
            addCriterion("EQUIPSEQ not like", value, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqIn(List<String> values) {
            addCriterion("EQUIPSEQ in", values, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqNotIn(List<String> values) {
            addCriterion("EQUIPSEQ not in", values, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqBetween(String value1, String value2) {
            addCriterion("EQUIPSEQ between", value1, value2, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipseqNotBetween(String value1, String value2) {
            addCriterion("EQUIPSEQ not between", value1, value2, "equipseq");
            return (Criteria) this;
        }

        public Criteria andEquipidIsNull() {
            addCriterion("EQUIPID is null");
            return (Criteria) this;
        }

        public Criteria andEquipidIsNotNull() {
            addCriterion("EQUIPID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipidEqualTo(String value) {
            addCriterion("EQUIPID =", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotEqualTo(String value) {
            addCriterion("EQUIPID <>", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThan(String value) {
            addCriterion("EQUIPID >", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPID >=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThan(String value) {
            addCriterion("EQUIPID <", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPID <=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLike(String value) {
            addCriterion("EQUIPID like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotLike(String value) {
            addCriterion("EQUIPID not like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidIn(List<String> values) {
            addCriterion("EQUIPID in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotIn(List<String> values) {
            addCriterion("EQUIPID not in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidBetween(String value1, String value2) {
            addCriterion("EQUIPID between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotBetween(String value1, String value2) {
            addCriterion("EQUIPID not between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("TENANTID is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TENANTID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(String value) {
            addCriterion("TENANTID =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(String value) {
            addCriterion("TENANTID <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(String value) {
            addCriterion("TENANTID >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(String value) {
            addCriterion("TENANTID >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(String value) {
            addCriterion("TENANTID <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(String value) {
            addCriterion("TENANTID <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLike(String value) {
            addCriterion("TENANTID like", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotLike(String value) {
            addCriterion("TENANTID not like", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<String> values) {
            addCriterion("TENANTID in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<String> values) {
            addCriterion("TENANTID not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(String value1, String value2) {
            addCriterion("TENANTID between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(String value1, String value2) {
            addCriterion("TENANTID not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andPermanentidIsNull() {
            addCriterion("PERMANENTID is null");
            return (Criteria) this;
        }

        public Criteria andPermanentidIsNotNull() {
            addCriterion("PERMANENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPermanentidEqualTo(String value) {
            addCriterion("PERMANENTID =", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidNotEqualTo(String value) {
            addCriterion("PERMANENTID <>", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidGreaterThan(String value) {
            addCriterion("PERMANENTID >", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidGreaterThanOrEqualTo(String value) {
            addCriterion("PERMANENTID >=", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidLessThan(String value) {
            addCriterion("PERMANENTID <", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidLessThanOrEqualTo(String value) {
            addCriterion("PERMANENTID <=", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidLike(String value) {
            addCriterion("PERMANENTID like", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidNotLike(String value) {
            addCriterion("PERMANENTID not like", value, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidIn(List<String> values) {
            addCriterion("PERMANENTID in", values, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidNotIn(List<String> values) {
            addCriterion("PERMANENTID not in", values, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidBetween(String value1, String value2) {
            addCriterion("PERMANENTID between", value1, value2, "permanentid");
            return (Criteria) this;
        }

        public Criteria andPermanentidNotBetween(String value1, String value2) {
            addCriterion("PERMANENTID not between", value1, value2, "permanentid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidIsNull() {
            addCriterion("EQUIPORGID is null");
            return (Criteria) this;
        }

        public Criteria andEquiporgidIsNotNull() {
            addCriterion("EQUIPORGID is not null");
            return (Criteria) this;
        }

        public Criteria andEquiporgidEqualTo(String value) {
            addCriterion("EQUIPORGID =", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidNotEqualTo(String value) {
            addCriterion("EQUIPORGID <>", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidGreaterThan(String value) {
            addCriterion("EQUIPORGID >", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPORGID >=", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidLessThan(String value) {
            addCriterion("EQUIPORGID <", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPORGID <=", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidLike(String value) {
            addCriterion("EQUIPORGID like", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidNotLike(String value) {
            addCriterion("EQUIPORGID not like", value, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidIn(List<String> values) {
            addCriterion("EQUIPORGID in", values, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidNotIn(List<String> values) {
            addCriterion("EQUIPORGID not in", values, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidBetween(String value1, String value2) {
            addCriterion("EQUIPORGID between", value1, value2, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquiporgidNotBetween(String value1, String value2) {
            addCriterion("EQUIPORGID not between", value1, value2, "equiporgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidIsNull() {
            addCriterion("EQUIPUSEORGID is null");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidIsNotNull() {
            addCriterion("EQUIPUSEORGID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidEqualTo(String value) {
            addCriterion("EQUIPUSEORGID =", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidNotEqualTo(String value) {
            addCriterion("EQUIPUSEORGID <>", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidGreaterThan(String value) {
            addCriterion("EQUIPUSEORGID >", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPUSEORGID >=", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidLessThan(String value) {
            addCriterion("EQUIPUSEORGID <", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidLessThanOrEqualTo(String value) {
            addCriterion("EQUIPUSEORGID <=", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidLike(String value) {
            addCriterion("EQUIPUSEORGID like", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidNotLike(String value) {
            addCriterion("EQUIPUSEORGID not like", value, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidIn(List<String> values) {
            addCriterion("EQUIPUSEORGID in", values, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidNotIn(List<String> values) {
            addCriterion("EQUIPUSEORGID not in", values, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidBetween(String value1, String value2) {
            addCriterion("EQUIPUSEORGID between", value1, value2, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquipuseorgidNotBetween(String value1, String value2) {
            addCriterion("EQUIPUSEORGID not between", value1, value2, "equipuseorgid");
            return (Criteria) this;
        }

        public Criteria andEquippatternIsNull() {
            addCriterion("EQUIPPATTERN is null");
            return (Criteria) this;
        }

        public Criteria andEquippatternIsNotNull() {
            addCriterion("EQUIPPATTERN is not null");
            return (Criteria) this;
        }

        public Criteria andEquippatternEqualTo(String value) {
            addCriterion("EQUIPPATTERN =", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternNotEqualTo(String value) {
            addCriterion("EQUIPPATTERN <>", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternGreaterThan(String value) {
            addCriterion("EQUIPPATTERN >", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPPATTERN >=", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternLessThan(String value) {
            addCriterion("EQUIPPATTERN <", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternLessThanOrEqualTo(String value) {
            addCriterion("EQUIPPATTERN <=", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternLike(String value) {
            addCriterion("EQUIPPATTERN like", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternNotLike(String value) {
            addCriterion("EQUIPPATTERN not like", value, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternIn(List<String> values) {
            addCriterion("EQUIPPATTERN in", values, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternNotIn(List<String> values) {
            addCriterion("EQUIPPATTERN not in", values, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternBetween(String value1, String value2) {
            addCriterion("EQUIPPATTERN between", value1, value2, "equippattern");
            return (Criteria) this;
        }

        public Criteria andEquippatternNotBetween(String value1, String value2) {
            addCriterion("EQUIPPATTERN not between", value1, value2, "equippattern");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("SPECIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("SPECIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("SPECIFICATION =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("SPECIFICATION <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("SPECIFICATION >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("SPECIFICATION <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("SPECIFICATION <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("SPECIFICATION like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("SPECIFICATION not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("SPECIFICATION in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("SPECIFICATION not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("SPECIFICATION between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("SPECIFICATION not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNull() {
            addCriterion("BUYDATE is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("BUYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(Date value) {
            addCriterion("BUYDATE =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(Date value) {
            addCriterion("BUYDATE <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(Date value) {
            addCriterion("BUYDATE >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(Date value) {
            addCriterion("BUYDATE >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(Date value) {
            addCriterion("BUYDATE <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(Date value) {
            addCriterion("BUYDATE <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<Date> values) {
            addCriterion("BUYDATE in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<Date> values) {
            addCriterion("BUYDATE not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(Date value1, Date value2) {
            addCriterion("BUYDATE between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(Date value1, Date value2) {
            addCriterion("BUYDATE not between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNull() {
            addCriterion("USEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNotNull() {
            addCriterion("USEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsedateEqualTo(Date value) {
            addCriterion("USEDATE =", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotEqualTo(Date value) {
            addCriterion("USEDATE <>", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThan(Date value) {
            addCriterion("USEDATE >", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThanOrEqualTo(Date value) {
            addCriterion("USEDATE >=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThan(Date value) {
            addCriterion("USEDATE <", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThanOrEqualTo(Date value) {
            addCriterion("USEDATE <=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateIn(List<Date> values) {
            addCriterion("USEDATE in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotIn(List<Date> values) {
            addCriterion("USEDATE not in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateBetween(Date value1, Date value2) {
            addCriterion("USEDATE between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotBetween(Date value1, Date value2) {
            addCriterion("USEDATE not between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andInstallplaceIsNull() {
            addCriterion("INSTALLPLACE is null");
            return (Criteria) this;
        }

        public Criteria andInstallplaceIsNotNull() {
            addCriterion("INSTALLPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andInstallplaceEqualTo(String value) {
            addCriterion("INSTALLPLACE =", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceNotEqualTo(String value) {
            addCriterion("INSTALLPLACE <>", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceGreaterThan(String value) {
            addCriterion("INSTALLPLACE >", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALLPLACE >=", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceLessThan(String value) {
            addCriterion("INSTALLPLACE <", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceLessThanOrEqualTo(String value) {
            addCriterion("INSTALLPLACE <=", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceLike(String value) {
            addCriterion("INSTALLPLACE like", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceNotLike(String value) {
            addCriterion("INSTALLPLACE not like", value, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceIn(List<String> values) {
            addCriterion("INSTALLPLACE in", values, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceNotIn(List<String> values) {
            addCriterion("INSTALLPLACE not in", values, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceBetween(String value1, String value2) {
            addCriterion("INSTALLPLACE between", value1, value2, "installplace");
            return (Criteria) this;
        }

        public Criteria andInstallplaceNotBetween(String value1, String value2) {
            addCriterion("INSTALLPLACE not between", value1, value2, "installplace");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleIsNull() {
            addCriterion("MAINTAINCYCLE is null");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleIsNotNull() {
            addCriterion("MAINTAINCYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleEqualTo(String value) {
            addCriterion("MAINTAINCYCLE =", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleNotEqualTo(String value) {
            addCriterion("MAINTAINCYCLE <>", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleGreaterThan(String value) {
            addCriterion("MAINTAINCYCLE >", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTAINCYCLE >=", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleLessThan(String value) {
            addCriterion("MAINTAINCYCLE <", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleLessThanOrEqualTo(String value) {
            addCriterion("MAINTAINCYCLE <=", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleLike(String value) {
            addCriterion("MAINTAINCYCLE like", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleNotLike(String value) {
            addCriterion("MAINTAINCYCLE not like", value, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleIn(List<String> values) {
            addCriterion("MAINTAINCYCLE in", values, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleNotIn(List<String> values) {
            addCriterion("MAINTAINCYCLE not in", values, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleBetween(String value1, String value2) {
            addCriterion("MAINTAINCYCLE between", value1, value2, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintaincycleNotBetween(String value1, String value2) {
            addCriterion("MAINTAINCYCLE not between", value1, value2, "maintaincycle");
            return (Criteria) this;
        }

        public Criteria andMaintainteamIsNull() {
            addCriterion("MAINTAINTEAM is null");
            return (Criteria) this;
        }

        public Criteria andMaintainteamIsNotNull() {
            addCriterion("MAINTAINTEAM is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainteamEqualTo(String value) {
            addCriterion("MAINTAINTEAM =", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamNotEqualTo(String value) {
            addCriterion("MAINTAINTEAM <>", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamGreaterThan(String value) {
            addCriterion("MAINTAINTEAM >", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTAINTEAM >=", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamLessThan(String value) {
            addCriterion("MAINTAINTEAM <", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamLessThanOrEqualTo(String value) {
            addCriterion("MAINTAINTEAM <=", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamLike(String value) {
            addCriterion("MAINTAINTEAM like", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamNotLike(String value) {
            addCriterion("MAINTAINTEAM not like", value, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamIn(List<String> values) {
            addCriterion("MAINTAINTEAM in", values, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamNotIn(List<String> values) {
            addCriterion("MAINTAINTEAM not in", values, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamBetween(String value1, String value2) {
            addCriterion("MAINTAINTEAM between", value1, value2, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andMaintainteamNotBetween(String value1, String value2) {
            addCriterion("MAINTAINTEAM not between", value1, value2, "maintainteam");
            return (Criteria) this;
        }

        public Criteria andVerificatIsNull() {
            addCriterion("VERIFICAT is null");
            return (Criteria) this;
        }

        public Criteria andVerificatIsNotNull() {
            addCriterion("VERIFICAT is not null");
            return (Criteria) this;
        }

        public Criteria andVerificatEqualTo(String value) {
            addCriterion("VERIFICAT =", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatNotEqualTo(String value) {
            addCriterion("VERIFICAT <>", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatGreaterThan(String value) {
            addCriterion("VERIFICAT >", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFICAT >=", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatLessThan(String value) {
            addCriterion("VERIFICAT <", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatLessThanOrEqualTo(String value) {
            addCriterion("VERIFICAT <=", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatLike(String value) {
            addCriterion("VERIFICAT like", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatNotLike(String value) {
            addCriterion("VERIFICAT not like", value, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatIn(List<String> values) {
            addCriterion("VERIFICAT in", values, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatNotIn(List<String> values) {
            addCriterion("VERIFICAT not in", values, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatBetween(String value1, String value2) {
            addCriterion("VERIFICAT between", value1, value2, "verificat");
            return (Criteria) this;
        }

        public Criteria andVerificatNotBetween(String value1, String value2) {
            addCriterion("VERIFICAT not between", value1, value2, "verificat");
            return (Criteria) this;
        }

        public Criteria andEquiplevelIsNull() {
            addCriterion("EQUIPLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEquiplevelIsNotNull() {
            addCriterion("EQUIPLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEquiplevelEqualTo(String value) {
            addCriterion("EQUIPLEVEL =", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelNotEqualTo(String value) {
            addCriterion("EQUIPLEVEL <>", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelGreaterThan(String value) {
            addCriterion("EQUIPLEVEL >", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPLEVEL >=", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelLessThan(String value) {
            addCriterion("EQUIPLEVEL <", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelLessThanOrEqualTo(String value) {
            addCriterion("EQUIPLEVEL <=", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelLike(String value) {
            addCriterion("EQUIPLEVEL like", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelNotLike(String value) {
            addCriterion("EQUIPLEVEL not like", value, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelIn(List<String> values) {
            addCriterion("EQUIPLEVEL in", values, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelNotIn(List<String> values) {
            addCriterion("EQUIPLEVEL not in", values, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelBetween(String value1, String value2) {
            addCriterion("EQUIPLEVEL between", value1, value2, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquiplevelNotBetween(String value1, String value2) {
            addCriterion("EQUIPLEVEL not between", value1, value2, "equiplevel");
            return (Criteria) this;
        }

        public Criteria andEquipstatusIsNull() {
            addCriterion("EQUIPSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andEquipstatusIsNotNull() {
            addCriterion("EQUIPSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEquipstatusEqualTo(String value) {
            addCriterion("EQUIPSTATUS =", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusNotEqualTo(String value) {
            addCriterion("EQUIPSTATUS <>", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusGreaterThan(String value) {
            addCriterion("EQUIPSTATUS >", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPSTATUS >=", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusLessThan(String value) {
            addCriterion("EQUIPSTATUS <", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusLessThanOrEqualTo(String value) {
            addCriterion("EQUIPSTATUS <=", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusLike(String value) {
            addCriterion("EQUIPSTATUS like", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusNotLike(String value) {
            addCriterion("EQUIPSTATUS not like", value, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusIn(List<String> values) {
            addCriterion("EQUIPSTATUS in", values, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusNotIn(List<String> values) {
            addCriterion("EQUIPSTATUS not in", values, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusBetween(String value1, String value2) {
            addCriterion("EQUIPSTATUS between", value1, value2, "equipstatus");
            return (Criteria) this;
        }

        public Criteria andEquipstatusNotBetween(String value1, String value2) {
            addCriterion("EQUIPSTATUS not between", value1, value2, "equipstatus");
            return (Criteria) this;
        }
    }

    /**
     * biz_equipment
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * biz_equipment null
     */
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
}