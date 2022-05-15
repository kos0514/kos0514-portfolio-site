package com.app.ecotiya.domain.entity;

import com.app.ecotiya.domain.entity.base.AppBaseEntity;

public class MSkillDivision extends AppBaseEntity {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column m_skill_division.skill_division_id
   * @mbg.generated
   */private Integer skillDivisionId;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column m_skill_division.skill_division_name
   * @mbg.generated
   */private String skillDivisionName;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column m_skill_division.skill_field_code
   * @mbg.generated
   */private String skillFieldCode;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column m_skill_division.skill_division_id
   * @return  the value of m_skill_division.skill_division_id
   * @mbg.generated
   */public Integer getSkillDivisionId(){return skillDivisionId;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column m_skill_division.skill_division_id
   * @param skillDivisionId  the value for m_skill_division.skill_division_id
   * @mbg.generated
   */public void setSkillDivisionId(Integer skillDivisionId){this.skillDivisionId=skillDivisionId;}

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column m_skill_division.skill_division_name
   * @return  the value of m_skill_division.skill_division_name
   * @mbg.generated
   */public String getSkillDivisionName(){return skillDivisionName;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column m_skill_division.skill_division_name
   * @param skillDivisionName  the value for m_skill_division.skill_division_name
   * @mbg.generated
   */public void setSkillDivisionName(String skillDivisionName){this.skillDivisionName=skillDivisionName == null?null:skillDivisionName.trim();}

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database column m_skill_division.skill_field_code
   * @return  the value of m_skill_division.skill_field_code
   * @mbg.generated
   */public String getSkillFieldCode(){return skillFieldCode;}

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database column m_skill_division.skill_field_code
   * @param skillFieldCode  the value for m_skill_division.skill_field_code
   * @mbg.generated
   */public void setSkillFieldCode(String skillFieldCode){this.skillFieldCode=skillFieldCode == null?null:skillFieldCode.trim();}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table m_skill_division
   * @mbg.generated
   */@Override public boolean equals(Object that){if (this == that){return true;}if (that == null){return false;}if (getClass() != that.getClass()){return false;}MSkillDivision other=(MSkillDivision)that;return (this.getSkillDivisionId() == null?other.getSkillDivisionId() == null:this.getSkillDivisionId().equals(other.getSkillDivisionId())) && (this.getSkillDivisionName() == null?other.getSkillDivisionName() == null:this.getSkillDivisionName().equals(other.getSkillDivisionName())) && (this.getSkillFieldCode() == null?other.getSkillFieldCode() == null:this.getSkillFieldCode().equals(other.getSkillFieldCode())) && (this.getCreatedAt() == null?other.getCreatedAt() == null:this.getCreatedAt().equals(other.getCreatedAt())) && (this.getUpdatedAt() == null?other.getUpdatedAt() == null:this.getUpdatedAt().equals(other.getUpdatedAt())) && (this.isDelflg() == other.isDelflg());}

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table m_skill_division
   * @mbg.generated
   */@Override public int hashCode(){final int prime=31;int result=1;result=prime * result + ((getSkillDivisionId() == null)?0:getSkillDivisionId().hashCode());result=prime * result + ((getSkillDivisionName() == null)?0:getSkillDivisionName().hashCode());result=prime * result + ((getSkillFieldCode() == null)?0:getSkillFieldCode().hashCode());result=prime * result + ((getCreatedAt() == null)?0:getCreatedAt().hashCode());result=prime * result + ((getUpdatedAt() == null)?0:getUpdatedAt().hashCode());result=prime * result + (isDelflg()?1231:1237);return result;}
}
