/************************************************************
 *	��Ȩ����  (c)2011,   hxf<p>	
 *  �ļ�����	��CrimeFragment.java<p>
 *
 *  ����ʱ��	��2015��11��16�� ����5:23:51 
 *  ��ǰ�汾�ţ�v1.0
 ************************************************************/
package com.littlefoolish.mycriminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;


public class CrimeFragment extends Fragment {
	
	private Crime mCrime;
	
	private EditText mTitleField;
	
	private Button mDateButton;
	
	private CheckBox mSolvedCheckBox;
	
	/*
	 * ��fragment�У�fragment�������ڷ���onCreate(Bundle savedInstanceState)����һ��������ʼ������
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.mCrime = new Crime();
		
	}
	
	/*
	 * ��fragment�У�fragment�������ڷ��� onCreateView����������������������ͼ�� ��ʼ���ؼ���
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_crime, container, false);
		
		//��ʼ���ؼ�
		mTitleField = (EditText) view.findViewById(R.id.crime_title);
		mTitleField.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				
				mCrime.setTitle(s.toString());
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
				// TODO Auto-generated method stub
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
			}
		});
		
		mDateButton = (Button) view.findViewById(R.id.crime_date);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM d,yyyy");
		String strDate = sdf.format(mCrime.getDate());
		mDateButton.setText(strDate);
		mDateButton.setEnabled(false);//��ֹ��ť���Ա�֤������Ӧ����ĵ���¼�
		
		mSolvedCheckBox = (CheckBox) view.findViewById(R.id.crime_solved);
		mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				
				mCrime.setSolved(isChecked);
				
			}
		});
		
		
		
		
		return view;
	}
}
