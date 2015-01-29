package net.hwanee.www.bean;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {

	private List<Board> rows = new ArrayList<Board> ();
	private int page;
	private int max;
	private int total;
	
	public List<Board> getRows() {
		return rows;
	}
	public void setRows(List<Board> rows) {
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
}
