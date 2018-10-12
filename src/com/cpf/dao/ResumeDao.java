package com.cpf.dao;

import com.cpf.entity.Resume;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2018/10/12 0012.
 */
@Repository
public interface ResumeDao {
    public Resume queryByUserId(int id);
    public void saveResume(Resume resume);
}
