/************************************************************
 *	��Ȩ����  (c)2011,   hxf<p>	
 *  �ļ�����	��Crime.java<p>
 *
 *  ����ʱ��	��2015��11��16�� ����5:05:37 
 *  ��ǰ�汾�ţ�v1.0
 ************************************************************/
package com.littlefoolish.mycriminalintent;

import java.util.Date;
import java.util.UUID;

/************************************************************
 *  ����ժҪ	��<p>
 *  	����	: ģ�Ͳ��Crime��
 ************************************************************/
public class Crime {
	
	private UUID mId;
	
	private String mTitle;
	
	private Date  mDate;
	
	private boolean mSolved;
	
	
	/**
	 * ���캯����Crime
	 * ��������:
	 * ����˵����
	 */
	public Crime() {
		//����Ψһ��ʶ��
		mId = UUID.randomUUID();
		//���ɷ�����ʱ��
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
