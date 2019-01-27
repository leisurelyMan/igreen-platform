package com.igreen.common.dao;

import com.igreen.common.model.IpeAiResult;

import java.util.List;

public interface IpeAiResultManualMapper {

    int insertBatch(List<IpeAiResult> record1List);

}