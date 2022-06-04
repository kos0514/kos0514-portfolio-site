package com.app.ecotiya.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecotiya.api.model.MainAppModel;
import com.app.ecotiya.api.service.MainAppService;
import com.app.ecotiya.domain.repository.MCareerMapper;
import com.app.ecotiya.domain.repository.MInquiryKindsMapper;
import com.app.ecotiya.domain.repository.MSectionCommentMapper;
import com.app.ecotiya.domain.repository.MSectionTitleMapper;
import com.app.ecotiya.domain.repository.MSkillMapper;

@Service
public class MainAppServiceImpl implements MainAppService {

  @Autowired private MSectionTitleMapper mSectionTitleMapper;
  @Autowired private MSectionCommentMapper mSectionCommentMapper;
  @Autowired private MCareerMapper mCareerMapper;
  @Autowired private MSkillMapper mSkillMapper;
  @Autowired private MInquiryKindsMapper mInquiryKindsMapper;

  @Override
  public MainAppModel retrieve() {

    MainAppModel mainAppDataModel = new MainAppModel();
    mainAppDataModel.setSectionTitleList(mSectionTitleMapper.selectAll());
    mainAppDataModel.setSectionCommentList(mSectionCommentMapper.selectAll());
    mainAppDataModel.setCareerList(mCareerMapper.selectAll());
    mainAppDataModel.setSkillList(mSkillMapper.selectAll());
    mainAppDataModel.setInquiryKindsList(mInquiryKindsMapper.selectAll());

    return mainAppDataModel;
  }
}
