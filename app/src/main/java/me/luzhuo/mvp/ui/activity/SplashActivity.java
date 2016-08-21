/* Copyright 2016 Luzhuo. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.luzhuo.mvp.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import me.luzhuo.mvp.R;
import me.luzhuo.mvp.presenter.SplashPersenter;
import me.luzhuo.mvp.ui.view.ISplashView;

/**
 * =================================================
 * <p>
 * Author: Luzhuo
 * <p>
 * Version: 1.0
 * <p>
 * Creation Date: 2016/8/21 19:47
 * <p>
 * Description: MVP架构
 * <p>
 * Revision History:
 * <p>
 * Copyright: Copyright 2016 Luzhuo. All rights reserved.
 * <p>
 * =================================================
 **/
public class SplashActivity extends Activity implements ISplashView {
	SplashPersenter mSplashPersenter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mSplashPersenter = new SplashPersenter(this);
	}
	
	@Override
	protected void onResume() {
		mSplashPersenter.doUILogic();
		super.onResume();
	}
	
	/**
	 * UI具体展示
	 */
	@Override
	public void showLoadingDialog() {
		System.out.println("showLoadingDialog:1");
	}

	@Override
	public void startNextActivity() {
		System.out.println("startNextActivity:2:1");
	}

	@Override
	public void showNextWorkError() {
		System.out.println("showNextWorkError:2:2");
	}

	@Override
	public void hideLoadingDialog() {
		System.out.println("hideLoadingDialog:3");
	}

}
