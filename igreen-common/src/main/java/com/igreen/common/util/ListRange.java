package com.igreen.common.util;

import java.util.List;

/**
 * 分页对象
 * 
 * @author panjingxiao
 */
public class ListRange {
	
	private List<?> rows;
	
	/**
	 * 总记录数
	 */
	private Integer records;
	
	
	/**
	 * 当前页码
	 */
	private Integer page;
	
	/**
	 * 总页数
	 */
	private Integer total;
	
	/**
	 * 每页记录数
	 */
	private Integer pageRows;
	

	public ListRange() {
		super();
	}
	
	public ListRange(List<?> rows, Integer records, Integer page, Integer pageRows) {
		super();
		this.rows = rows;
		this.records = records;
		this.page = page;
		this.pageRows = pageRows;
		this.total = records/pageRows + 1;
	}


	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageRows() {
		return pageRows;
	}

	public void setPageRows(Integer pageRows) {
		this.pageRows = pageRows;
	}
	
}