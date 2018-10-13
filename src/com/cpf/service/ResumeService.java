package com.cpf.service;

import com.cpf.entity.Resume;
import com.cpf.entity.User;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
public interface ResumeService {
    public Resume queryByUserId(int id);
    public void saveResume(Resume resume);
    public void updateResume(Resume resume);

}
