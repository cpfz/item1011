package com.cpf.service;

import com.cpf.entity.Resume;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface ResumeService {
    public Resume queryByUserId(int id);
    public void saveResume(Resume resume);
}
