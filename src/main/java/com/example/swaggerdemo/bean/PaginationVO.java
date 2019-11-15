package com.example.swaggerdemo.bean;

/**
 * 分页控件VO对象
 * @author zqc
 *2014-1-22 上午09:22:55
 */
public class PaginationVO {



private int page=1;//当前页，默认第一页

private int totalItems=-1;//总记录条数
private int rows=10;//每页显示记录数，默认一页10条




public PaginationVO()
{
}

public PaginationVO(int curPage, int rows)
{
	this.page=curPage;
	this.rows=rows;
}

public int getRows() {
	return rows;
}

public void setRows(int rows) {
	this.rows = rows;
}

public int getTotalPageNumbers()
{
	if(totalItems%rows==0)
		return totalItems/rows;
	else
		return totalItems/rows+1;
}

public int getTotalItems() {
	return totalItems;
}

public void setTotalItems(int totalItems) {
	this.totalItems = totalItems;
}

/**
 * 得到记录起始位置
 * @return
 */
public int getStart()
{
	
	if(page>this.getTotalPageNumbers())
		page=this.getTotalPageNumbers();
	if(page<1)
		page=1;	
	return (page - 1) * rows;
}

/**
 * 得到记录结束位置
 * @return
 */
public int getEnd()
{
	if(getStart()+rows>totalItems)
		return totalItems;
	else
		return getStart()+rows;
}

public int getPage() {
	return page;
}

public void setPage(int page) {
	this.page = page;
}

}
