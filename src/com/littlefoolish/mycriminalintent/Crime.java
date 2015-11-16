/************************************************************
 *	��Ȩ����  (c)2011,   hxf<p>	
 *  �ļ�����	��Crime.java<p>
 *
 *  ����ʱ��	��2015��11��16�� ����5:05:37 
 *  ��ǰ�汾�ţ�v1.0
 ************************************************************/
package com.littlefoolish.mycriminalintent;

import java.util.UUID;

/************************************************************
 *  ����ժҪ	��<p>
 *  	����	: ģ�Ͳ��Crime��
 ************************************************************/
public class Crime {
	
	private UUID mId;
	
	private String mTitle;
	
	
	/**
	 * ���캯����Crime
	 * ��������:
	 * ����˵����
	 */
	public Crime() {
		//����Ψһ��ʶ��
		mId = UUID.randomUUID();
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
