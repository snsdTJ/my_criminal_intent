/************************************************************
 *	版权所有  (c)2011,   hxf<p>	
 *  文件名称	：Crime.java<p>
 *
 *  创建时间	：2015年11月16日 下午5:05:37 
 *  当前版本号：v1.0
 ************************************************************/
package com.littlefoolish.mycriminalintent;

import java.util.Date;
import java.util.UUID;

/************************************************************
 *  内容摘要	：<p>
 *  	描述	: 模型层的Crime类
 ************************************************************/
public class Crime {
	
	private UUID mId;
	
	private String mTitle;
	
	private Date  mDate;
	
	private boolean mSolved;
	
	
	/**
	 * 构造函数：Crime
	 * 函数功能:
	 * 参数说明：
	 */
	public Crime() {
		//生成唯一标识符
		mId = UUID.randomUUID();
		//生成发生的时间
		mDate = new Date();
	}


	public Date getDate() {
		return mDate;
	}


	public void setDate(Date date) {
		mDate = date;
	}


	public boolean isSolved() {
		return mSolved;
	}


	public void setSolved(boolean solved) {
		mSolved = solved;
	}


	public String getTitle() {
		return mTitle;
	}


	public void setTitle(String title) {
		mTitle = title;
	}


	public UUID getId() {
		return mId;
	}

}
