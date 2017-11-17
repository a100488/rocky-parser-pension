package com.guige.account.pojo.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.guige.account.pojo.constant.CodeConstant;
import lombok.Data;

import java.util.List;

@SuppressWarnings("all")
@Data
public class PagingVo<T> {

	private static final long serialVersionUID = -5214737781026620938L;

	private int pageIndex = CodeConstant.DEFAULT_PAGE_INFEX;

	private int pageSize = CodeConstant.DEFAULT_PAGE_SIZE;

	private long total;

	private T searchObject;
	
	private List<T> results;
	@JsonIgnore
	public T getSearchObject() {
		return searchObject;
	}

	public void setSearchObject(T searchObject) {
		this.searchObject = searchObject;
	}
	
}
