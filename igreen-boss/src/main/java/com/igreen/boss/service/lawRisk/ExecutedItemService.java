package com.igreen.boss.service.lawRisk;

import com.igreen.common.model.ExecutedItem;
import com.igreen.common.util.ListRange;
import com.igreen.common.util.ResponseModel;

public interface ExecutedItemService {

	ResponseModel addExecutedItem(ExecutedItem executedItem, Integer id);

	ExecutedItem getOneExecutedItem(Integer executedItemId);

	ListRange executedItemIdList(ExecutedItem executedItem, Integer currentPage, Integer pageRows);

}
