package com.github.wxiaoqi.security.generator.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.WordUtils;

public class CriticalUtil {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CriticalUtil() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
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
        oredCriteria.add(criteria);
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
        
        //判断null
        public Criteria andColumnIsNull(String column) {
            addCriterion(column+" is null");
            return (Criteria) this;
        }
      //判断 !null
        public Criteria andColumnIsNotNull(String column) {
            addCriterion(column+" is null");
            return (Criteria) this;
        }
        //判断=
        public Criteria andColumnEqualTo(String column,String value) {
            addCriterion(column +" =", value, columnToJava(column));
            return (Criteria) this;
        }
        //判断<>
        public Criteria andColumnNotEqualTo(String column,String value) {
            addCriterion(column +" <>", value, columnToJava(column));
            return (Criteria) this;
        }
      //判断>
        public Criteria andColumnGreaterThan(String column,String value) {
            addCriterion(column +" >", value, columnToJava(column));
            return (Criteria) this;
        }
      //判断>=
        public Criteria andColumnGreaterThanOrEqualTo(String column,String value) {
        	addCriterion(column +" >=", value, columnToJava(column));
            return (Criteria) this;
        }
        //判断<
        public Criteria andColumnLessThan(String column,String value) {
        	addCriterion(column +" <", value, columnToJava(column));
            return (Criteria) this;
        }
        //判断<=
        public Criteria andColumnLessThanOrEqualTo(String column,String value) {
        	addCriterion(column +" <=", value, columnToJava(column));
            return (Criteria) this;
        }
      //判断like
        public Criteria andColumnLike(String column,String value) {
        	addCriterion(column +" like", value, columnToJava(column));
            return (Criteria) this;
        }
      //判断like
        public Criteria andColumnNotLike(String column,String value) {
            addCriterion(column +" not like", value, columnToJava(column));
            return (Criteria) this;
        }

        public Criteria andColumnIn(String column,List<String> values) {
            addCriterion(column +" in", values, columnToJava(column));
            return (Criteria) this;
        }

        public Criteria andColumnNotIn(String column,List<String> values) {
            addCriterion(column +" not in", values, columnToJava(column));
            return (Criteria) this;
        }

        public Criteria andColumnBetween(String column,String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            addCriterion(column +" between", value1, value2, columnToJava(column));
            return (Criteria) this;
        }

        public Criteria andColumnNotBetween(String column,String value1, String value2) {
            addCriterion(column +" not between", value1, value2, columnToJava(column));
            return (Criteria) this;
        }
        //所有匹配
        public Criteria forAll(String column,String op,Object obj) {
        	if(op.indexOf("in")>=0){
        		List<String> values=(List<String>) obj;
        		addCriterion(column +" "+op+" ", values, columnToJava(column));
        	}else if(op.indexOf("bet")>=0){
        		Map<String,String> values=(Map<String, String>) obj;
        		String value1=values.get("min");
        		String value2=values.get("max");
        		addCriterion(column +" "+op+" ", value1, value2, columnToJava(column));
        	}else{
        		String value=(String) obj;
        		addCriterion(column +" "+op+"", value, columnToJava(column));
        	}
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
    //首字母转小写
    public static String toLowerCaseFirstOne(String s) {
    	if (Character.isLowerCase(s.charAt(0))) {
    		return s;
    	} else {
    		return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    	}
    }
    /**
     * 列名转换成Java属性名
     */
    public static String columnToJava(String columnName) {
    	return toLowerCaseFirstOne(WordUtils.capitalizeFully(columnName, new char[]{'_'}).replace("_", ""));
    }
}