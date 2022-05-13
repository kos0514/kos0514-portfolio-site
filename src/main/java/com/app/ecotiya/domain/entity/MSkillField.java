package com.app.ecotiya.domain.entity;

import com.app.ecotiya.domain.entity.base.AppBaseEntity;

public class MSkillField extends AppBaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_skill_field.skill_field_id
     *
     * @mbg.generated
     */
    private Integer skillFieldId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_skill_field.skill_field_name
     *
     * @mbg.generated
     */
    private String skillFieldName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_skill_field.skill_field_id
     *
     * @return the value of m_skill_field.skill_field_id
     *
     * @mbg.generated
     */
    public Integer getSkillFieldId() {
        return skillFieldId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_skill_field.skill_field_id
     *
     * @param skillFieldId the value for m_skill_field.skill_field_id
     *
     * @mbg.generated
     */
    public void setSkillFieldId(Integer skillFieldId) {
        this.skillFieldId = skillFieldId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_skill_field.skill_field_name
     *
     * @return the value of m_skill_field.skill_field_name
     *
     * @mbg.generated
     */
    public String getSkillFieldName() {
        return skillFieldName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_skill_field.skill_field_name
     *
     * @param skillFieldName the value for m_skill_field.skill_field_name
     *
     * @mbg.generated
     */
    public void setSkillFieldName(String skillFieldName) {
        this.skillFieldName = skillFieldName == null ? null : skillFieldName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_skill_field
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MSkillField other = (MSkillField) that;
        return (this.getSkillFieldId() == null ? other.getSkillFieldId() == null : this.getSkillFieldId().equals(other.getSkillFieldId()))
            && (this.getSkillFieldName() == null ? other.getSkillFieldName() == null : this.getSkillFieldName().equals(other.getSkillFieldName()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_skill_field
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSkillFieldId() == null) ? 0 : getSkillFieldId().hashCode());
        result = prime * result + ((getSkillFieldName() == null) ? 0 : getSkillFieldName().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}