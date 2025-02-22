package com.load.model;
import java.util.ArrayList;
import java.util.List;
public class SchoolInfoExample {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    public SchoolInfoExample() {
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
	 public Criteria andIdIsNull() {
		 addCriterion("id is null");
		return (Criteria) this;
		}
  public Criteria andIdIsNotNull(){
		addCriterion("id is not null");
		return (Criteria) this;
		}
  public Criteria andIdEqualTo(Integer value) {
		  addCriterion("id =", value, "id");
		return (Criteria) this;
		}
   public Criteria andIdNotEqualTo(Integer value) {
		  addCriterion("id <>", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdGreaterThan(Integer value) {
		 addCriterion("id >", value, "id");
		return (Criteria) this;
		}
  public Criteria andIdGreaterThanOrEqualTo(Integer value) {
		  addCriterion("id >=", value, "Id");
		return (Criteria) this;
		}
   public Criteria andIdLessThan(Integer value) {
		  addCriterion("id <", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdLessThanOrEqualTo(Integer value) {
		  addCriterion("id <=", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdIn(List<Integer> values) {
		  addCriterion("id in", values, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotIn(List<Integer> values) {
		  addCriterion("id not in", values, "id");
		return (Criteria) this;
		}
     public Criteria andIdBetween(Integer value1, Integer value2) {
		   addCriterion("id between", value1, value2, "id");
		return (Criteria) this;
		}
     public Criteria andIdNotBetween(Integer value1, Integer value2) {
		   addCriterion("id not between", value1, value2, "id");
		return (Criteria) this;
		}
    public Criteria andIdLike(Integer value) {
		  addCriterion("id like", value, "id");
		return (Criteria) this;
		}
    public Criteria andIdNotLike(Integer value) {
		  addCriterion("id not like", value, "id");
		return (Criteria) this;
		}
 public Criteria andNameIsNull() {
		 addCriterion("name is null");
		return (Criteria) this;
		}
  public Criteria andNameIsNotNull(){
		addCriterion("name is not null");
		return (Criteria) this;
		}
  public Criteria andNameEqualTo(String value) {
		  addCriterion("name =", value, "name");
		return (Criteria) this;
		}
   public Criteria andNameNotEqualTo(String value) {
		  addCriterion("name <>", value, "name");
		return (Criteria) this;
		}
    public Criteria andNameGreaterThan(String value) {
		 addCriterion("name >", value, "name");
		return (Criteria) this;
		}
  public Criteria andNameGreaterThanOrEqualTo(String value) {
		  addCriterion("name >=", value, "Name");
		return (Criteria) this;
		}
   public Criteria andNameLessThan(String value) {
		  addCriterion("name <", value, "name");
		return (Criteria) this;
		}
    public Criteria andNameLessThanOrEqualTo(String value) {
		  addCriterion("name <=", value, "name");
		return (Criteria) this;
		}
    public Criteria andNameIn(List<String> values) {
		  addCriterion("name in", values, "name");
		return (Criteria) this;
		}
    public Criteria andNameNotIn(List<String> values) {
		  addCriterion("name not in", values, "name");
		return (Criteria) this;
		}
     public Criteria andNameBetween(String value1, String value2) {
		   addCriterion("name between", value1, value2, "name");
		return (Criteria) this;
		}
     public Criteria andNameNotBetween(String value1, String value2) {
		   addCriterion("name not between", value1, value2, "name");
		return (Criteria) this;
		}
    public Criteria andNameLike(String value) {
		  addCriterion("name like", value, "name");
		return (Criteria) this;
		}
    public Criteria andNameNotLike(String value) {
		  addCriterion("name not like", value, "name");
		return (Criteria) this;
		}
 public Criteria andPassWordIsNull() {
		 addCriterion("pass_word is null");
		return (Criteria) this;
		}
  public Criteria andPassWordIsNotNull(){
		addCriterion("pass_word is not null");
		return (Criteria) this;
		}
  public Criteria andPassWordEqualTo(String value) {
		  addCriterion("pass_word =", value, "passWord");
		return (Criteria) this;
		}
   public Criteria andPassWordNotEqualTo(String value) {
		  addCriterion("pass_word <>", value, "passWord");
		return (Criteria) this;
		}
    public Criteria andPassWordGreaterThan(String value) {
		 addCriterion("pass_word >", value, "passWord");
		return (Criteria) this;
		}
  public Criteria andPassWordGreaterThanOrEqualTo(String value) {
		  addCriterion("pass_word >=", value, "PassWord");
		return (Criteria) this;
		}
   public Criteria andPassWordLessThan(String value) {
		  addCriterion("pass_word <", value, "passWord");
		return (Criteria) this;
		}
    public Criteria andPassWordLessThanOrEqualTo(String value) {
		  addCriterion("pass_word <=", value, "passWord");
		return (Criteria) this;
		}
    public Criteria andPassWordIn(List<String> values) {
		  addCriterion("pass_word in", values, "passWord");
		return (Criteria) this;
		}
    public Criteria andPassWordNotIn(List<String> values) {
		  addCriterion("pass_word not in", values, "passWord");
		return (Criteria) this;
		}
     public Criteria andPassWordBetween(String value1, String value2) {
		   addCriterion("pass_word between", value1, value2, "passWord");
		return (Criteria) this;
		}
     public Criteria andPassWordNotBetween(String value1, String value2) {
		   addCriterion("pass_word not between", value1, value2, "passWord");
		return (Criteria) this;
		}
    public Criteria andPassWordLike(String value) {
		  addCriterion("pass_word like", value, "passWord");
		return (Criteria) this;
		}
    public Criteria andPassWordNotLike(String value) {
		  addCriterion("pass_word not like", value, "passWord");
		return (Criteria) this;
		}
 public Criteria andCreateTimeIsNull() {
		 addCriterion("create_time is null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeIsNotNull(){
		addCriterion("create_time is not null");
		return (Criteria) this;
		}
  public Criteria andCreateTimeEqualTo(String value) {
		  addCriterion("create_time =", value, "createTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeNotEqualTo(String value) {
		  addCriterion("create_time <>", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeGreaterThan(String value) {
		 addCriterion("create_time >", value, "createTime");
		return (Criteria) this;
		}
  public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
		  addCriterion("create_time >=", value, "CreateTime");
		return (Criteria) this;
		}
   public Criteria andCreateTimeLessThan(String value) {
		  addCriterion("create_time <", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLessThanOrEqualTo(String value) {
		  addCriterion("create_time <=", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeIn(List<String> values) {
		  addCriterion("create_time in", values, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotIn(List<String> values) {
		  addCriterion("create_time not in", values, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeBetween(String value1, String value2) {
		   addCriterion("create_time between", value1, value2, "createTime");
		return (Criteria) this;
		}
     public Criteria andCreateTimeNotBetween(String value1, String value2) {
		   addCriterion("create_time not between", value1, value2, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeLike(String value) {
		  addCriterion("create_time like", value, "createTime");
		return (Criteria) this;
		}
    public Criteria andCreateTimeNotLike(String value) {
		  addCriterion("create_time not like", value, "createTime");
		return (Criteria) this;
		}
 public Criteria andUpdateTimeIsNull() {
		 addCriterion("update_time is null");
		return (Criteria) this;
		}
  public Criteria andUpdateTimeIsNotNull(){
		addCriterion("update_time is not null");
		return (Criteria) this;
		}
  public Criteria andUpdateTimeEqualTo(String value) {
		  addCriterion("update_time =", value, "updateTime");
		return (Criteria) this;
		}
   public Criteria andUpdateTimeNotEqualTo(String value) {
		  addCriterion("update_time <>", value, "updateTime");
		return (Criteria) this;
		}
    public Criteria andUpdateTimeGreaterThan(String value) {
		 addCriterion("update_time >", value, "updateTime");
		return (Criteria) this;
		}
  public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
		  addCriterion("update_time >=", value, "UpdateTime");
		return (Criteria) this;
		}
   public Criteria andUpdateTimeLessThan(String value) {
		  addCriterion("update_time <", value, "updateTime");
		return (Criteria) this;
		}
    public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
		  addCriterion("update_time <=", value, "updateTime");
		return (Criteria) this;
		}
    public Criteria andUpdateTimeIn(List<String> values) {
		  addCriterion("update_time in", values, "updateTime");
		return (Criteria) this;
		}
    public Criteria andUpdateTimeNotIn(List<String> values) {
		  addCriterion("update_time not in", values, "updateTime");
		return (Criteria) this;
		}
     public Criteria andUpdateTimeBetween(String value1, String value2) {
		   addCriterion("update_time between", value1, value2, "updateTime");
		return (Criteria) this;
		}
     public Criteria andUpdateTimeNotBetween(String value1, String value2) {
		   addCriterion("update_time not between", value1, value2, "updateTime");
		return (Criteria) this;
		}
    public Criteria andUpdateTimeLike(String value) {
		  addCriterion("update_time like", value, "updateTime");
		return (Criteria) this;
		}
    public Criteria andUpdateTimeNotLike(String value) {
		  addCriterion("update_time not like", value, "updateTime");
		return (Criteria) this;
		}
 public Criteria andIsDeleteIsNull() {
		 addCriterion("is_delete is null");
		return (Criteria) this;
		}
  public Criteria andIsDeleteIsNotNull(){
		addCriterion("is_delete is not null");
		return (Criteria) this;
		}
  public Criteria andIsDeleteEqualTo(Integer value) {
		  addCriterion("is_delete =", value, "isDelete");
		return (Criteria) this;
		}
   public Criteria andIsDeleteNotEqualTo(Integer value) {
		  addCriterion("is_delete <>", value, "isDelete");
		return (Criteria) this;
		}
    public Criteria andIsDeleteGreaterThan(Integer value) {
		 addCriterion("is_delete >", value, "isDelete");
		return (Criteria) this;
		}
  public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
		  addCriterion("is_delete >=", value, "IsDelete");
		return (Criteria) this;
		}
   public Criteria andIsDeleteLessThan(Integer value) {
		  addCriterion("is_delete <", value, "isDelete");
		return (Criteria) this;
		}
    public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
		  addCriterion("is_delete <=", value, "isDelete");
		return (Criteria) this;
		}
    public Criteria andIsDeleteIn(List<Integer> values) {
		  addCriterion("is_delete in", values, "isDelete");
		return (Criteria) this;
		}
    public Criteria andIsDeleteNotIn(List<Integer> values) {
		  addCriterion("is_delete not in", values, "isDelete");
		return (Criteria) this;
		}
     public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
		   addCriterion("is_delete between", value1, value2, "isDelete");
		return (Criteria) this;
		}
     public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
		   addCriterion("is_delete not between", value1, value2, "isDelete");
		return (Criteria) this;
		}
    public Criteria andIsDeleteLike(Integer value) {
		  addCriterion("is_delete like", value, "isDelete");
		return (Criteria) this;
		}
    public Criteria andIsDeleteNotLike(Integer value) {
		  addCriterion("is_delete not like", value, "isDelete");
		return (Criteria) this;
		}

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }
        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }
        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }
        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
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
}
