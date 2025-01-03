package com.app.kos0514.domain.entity;

public class MSectionTitle {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_title.section_kind_code
   *
   * @mbg.generated
   */
  private String sectionKindCode;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_title.section_title
   *
   * @mbg.generated
   */
  private String sectionTitle;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_title.section_sub_title
   *
   * @mbg.generated
   */
  private String sectionSubTitle;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_title.remarks1
   *
   * @mbg.generated
   */
  private String remarks1;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_title.remarks2
   *
   * @mbg.generated
   */
  private String remarks2;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_title.show_flg
   *
   * @mbg.generated
   */
  private Boolean showFlg;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_title.section_kind_code
   *
   * @return the value of m_section_title.section_kind_code
   * @mbg.generated
   */
  public String getSectionKindCode() {
    return sectionKindCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_title.section_kind_code
   *
   * @param sectionKindCode the value for m_section_title.section_kind_code
   * @mbg.generated
   */
  public void setSectionKindCode(String sectionKindCode) {
    this.sectionKindCode = sectionKindCode == null ? null : sectionKindCode.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_title.section_title
   *
   * @return the value of m_section_title.section_title
   * @mbg.generated
   */
  public String getSectionTitle() {
    return sectionTitle;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_title.section_title
   *
   * @param sectionTitle the value for m_section_title.section_title
   * @mbg.generated
   */
  public void setSectionTitle(String sectionTitle) {
    this.sectionTitle = sectionTitle == null ? null : sectionTitle.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_title.section_sub_title
   *
   * @return the value of m_section_title.section_sub_title
   * @mbg.generated
   */
  public String getSectionSubTitle() {
    return sectionSubTitle;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_title.section_sub_title
   *
   * @param sectionSubTitle the value for m_section_title.section_sub_title
   * @mbg.generated
   */
  public void setSectionSubTitle(String sectionSubTitle) {
    this.sectionSubTitle = sectionSubTitle == null ? null : sectionSubTitle.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_title.remarks1
   *
   * @return the value of m_section_title.remarks1
   * @mbg.generated
   */
  public String getRemarks1() {
    return remarks1;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_title.remarks1
   *
   * @param remarks1 the value for m_section_title.remarks1
   * @mbg.generated
   */
  public void setRemarks1(String remarks1) {
    this.remarks1 = remarks1 == null ? null : remarks1.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_title.remarks2
   *
   * @return the value of m_section_title.remarks2
   * @mbg.generated
   */
  public String getRemarks2() {
    return remarks2;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_title.remarks2
   *
   * @param remarks2 the value for m_section_title.remarks2
   * @mbg.generated
   */
  public void setRemarks2(String remarks2) {
    this.remarks2 = remarks2 == null ? null : remarks2.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_title.show_flg
   *
   * @return the value of m_section_title.show_flg
   * @mbg.generated
   */
  public Boolean getShowFlg() {
    return showFlg;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_title.show_flg
   *
   * @param showFlg the value for m_section_title.show_flg
   * @mbg.generated
   */
  public void setShowFlg(Boolean showFlg) {
    this.showFlg = showFlg;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_section_title
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
    MSectionTitle other = (MSectionTitle) that;
    return (this.getSectionKindCode() == null
            ? other.getSectionKindCode() == null
            : this.getSectionKindCode().equals(other.getSectionKindCode()))
        && (this.getSectionTitle() == null
            ? other.getSectionTitle() == null
            : this.getSectionTitle().equals(other.getSectionTitle()))
        && (this.getSectionSubTitle() == null
            ? other.getSectionSubTitle() == null
            : this.getSectionSubTitle().equals(other.getSectionSubTitle()))
        && (this.getRemarks1() == null
            ? other.getRemarks1() == null
            : this.getRemarks1().equals(other.getRemarks1()))
        && (this.getRemarks2() == null
            ? other.getRemarks2() == null
            : this.getRemarks2().equals(other.getRemarks2()))
        && (this.getShowFlg() == null
            ? other.getShowFlg() == null
            : this.getShowFlg().equals(other.getShowFlg()));
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_section_title
   *
   * @mbg.generated
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result + ((getSectionKindCode() == null) ? 0 : getSectionKindCode().hashCode());
    result = prime * result + ((getSectionTitle() == null) ? 0 : getSectionTitle().hashCode());
    result =
        prime * result + ((getSectionSubTitle() == null) ? 0 : getSectionSubTitle().hashCode());
    result = prime * result + ((getRemarks1() == null) ? 0 : getRemarks1().hashCode());
    result = prime * result + ((getRemarks2() == null) ? 0 : getRemarks2().hashCode());
    result = prime * result + ((getShowFlg() == null) ? 0 : getShowFlg().hashCode());
    return result;
  }
}
