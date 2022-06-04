package com.app.ecotiya.domain.entity;

public class MSectionComment {

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_comment.section_kind_code
   *
   * @mbg.generated
   */
  private String sectionKindCode;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_comment.section_comment_line
   *
   * @mbg.generated
   */
  private Integer sectionCommentLine;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_comment.title_flg
   *
   * @mbg.generated
   */
  private Boolean titleFlg;
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database column
   * m_section_comment.section_comment
   *
   * @mbg.generated
   */
  private String sectionComment;

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_comment.section_kind_code
   *
   * @return the value of m_section_comment.section_kind_code
   * @mbg.generated
   */
  public String getSectionKindCode() {
    return sectionKindCode;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_comment.section_kind_code
   *
   * @param sectionKindCode the value for m_section_comment.section_kind_code
   * @mbg.generated
   */
  public void setSectionKindCode(String sectionKindCode) {
    this.sectionKindCode = sectionKindCode == null ? null : sectionKindCode.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_comment.section_comment_line
   *
   * @return the value of m_section_comment.section_comment_line
   * @mbg.generated
   */
  public Integer getSectionCommentLine() {
    return sectionCommentLine;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_comment.section_comment_line
   *
   * @param sectionCommentLine the value for m_section_comment.section_comment_line
   * @mbg.generated
   */
  public void setSectionCommentLine(Integer sectionCommentLine) {
    this.sectionCommentLine = sectionCommentLine;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_comment.title_flg
   *
   * @return the value of m_section_comment.title_flg
   * @mbg.generated
   */
  public Boolean getTitleFlg() {
    return titleFlg;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_comment.title_flg
   *
   * @param titleFlg the value for m_section_comment.title_flg
   * @mbg.generated
   */
  public void setTitleFlg(Boolean titleFlg) {
    this.titleFlg = titleFlg;
  }

  /**
   * This method was generated by MyBatis Generator. This method returns the value of the database
   * column m_section_comment.section_comment
   *
   * @return the value of m_section_comment.section_comment
   * @mbg.generated
   */
  public String getSectionComment() {
    return sectionComment;
  }

  /**
   * This method was generated by MyBatis Generator. This method sets the value of the database
   * column m_section_comment.section_comment
   *
   * @param sectionComment the value for m_section_comment.section_comment
   * @mbg.generated
   */
  public void setSectionComment(String sectionComment) {
    this.sectionComment = sectionComment == null ? null : sectionComment.trim();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_section_comment
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
    MSectionComment other = (MSectionComment) that;
    return (this.getSectionKindCode() == null
            ? other.getSectionKindCode() == null
            : this.getSectionKindCode().equals(other.getSectionKindCode()))
        && (this.getSectionCommentLine() == null
            ? other.getSectionCommentLine() == null
            : this.getSectionCommentLine().equals(other.getSectionCommentLine()))
        && (this.getTitleFlg() == null
            ? other.getTitleFlg() == null
            : this.getTitleFlg().equals(other.getTitleFlg()))
        && (this.getSectionComment() == null
            ? other.getSectionComment() == null
            : this.getSectionComment().equals(other.getSectionComment()));
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * m_section_comment
   *
   * @mbg.generated
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result + ((getSectionKindCode() == null) ? 0 : getSectionKindCode().hashCode());
    result =
        prime * result
            + ((getSectionCommentLine() == null) ? 0 : getSectionCommentLine().hashCode());
    result = prime * result + ((getTitleFlg() == null) ? 0 : getTitleFlg().hashCode());
    result = prime * result + ((getSectionComment() == null) ? 0 : getSectionComment().hashCode());
    return result;
  }
}
