package com.igreen.boss.util.xls;

 /**
 * 对于需要个性化显示的字段，需要实现此接口。 
 */
public interface CellWriter{
	Object getCellValue(Object obj);
}
