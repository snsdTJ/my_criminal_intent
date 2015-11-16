/************************************************************
 *	版权所有  (c)2011,   hxf<p>	
 *  文件名称	：CrimeFragment.java<p>
 *
 *  创建时间	：2015年11月16日 下午5:23:51 
 *  当前版本号：v1.0
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
	 * 在fragment中，fragment生命周期方法onCreate(Bundle savedInstanceState)方法一般用来初始化数据
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.mCrime = new Crime();
		
	}
	
	/*
	 * 在fragment中，fragment生命周期方法 onCreateView（）方法才是用来生成视图， 初始化控件。
	 */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_crime, container, false);
		
		//初始化控件
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
		mDateButton.setEnabled(false);//禁止按钮可以保证它不响应用语的点击事件
		
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
