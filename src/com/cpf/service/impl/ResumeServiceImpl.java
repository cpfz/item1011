package com.cpf.service.impl;

import com.cpf.dao.ResumeDao;
import com.cpf.entity.Resume;
import com.cpf.entity.User;
import com.cpf.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Service
public class ResumeServiceImpl implements ResumeService{
    @Autowired
    private ResumeDao resumeDao;
    @Override
    public Resume queryByUserId(int id) {
        return resumeDao.queryByUserId(id);
    }

    @Override
    public void saveResume(Resume resume) {
        resumeDao.saveResume(resume);
    }

    @Override
    public void updateResume(Resume resume) {
        resumeDao.updateResume(resume);
    }
}
