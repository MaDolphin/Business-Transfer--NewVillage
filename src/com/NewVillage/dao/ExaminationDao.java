package com.NewVillage.dao;

import com.NewVillage.entity.Examination;
import java.util.*;
/**
 * Created by 珏 on 2016/6/3.
 */
public interface ExaminationDao {
    void addExamination(Examination examination);
    List<Examination> queryExaminationByNewID(Integer newId);
}
