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
package me.luzhuo.mvp.presenter;

import android.content.Context;
import android.text.TextUtils;

import me.luzhuo.mvp.callback.GlobalNetCallBack;
import me.luzhuo.mvp.callback.impl.BaseGlobalNetCallBack;
import me.luzhuo.mvp.model.INetWork;
import me.luzhuo.mvp.model.impl.INetWorkImpl;
import me.luzhuo.mvp.ui.view.ISplashView;

/**
 * =================================================
 * <p>
 * Author: Luzhuo
 * <p>
 * Version: 1.0
 * <p>
 * Creation Date: 2016/7/8 16:46
 * <p>
 * Description: 控制层, 处理model和ui之间的逻辑
 * <p>
 * Revision History:
 * <p>
 * Copyright: Copyright 2016 Luzhuo. All rights reserved.
 * <p>
 * =================================================
 **/
public class SplashPersenter {
	private INetWork mINetWork;
	private ISplashView mISplashView;
	private Context context;
	
	public SplashPersenter(ISplashView iSplashView){
		mINetWork = new INetWorkImpl();
		mISplashView = iSplashView;
		context = (Context)iSplashView;
	}
	
	public void doUILogic(){
		mISplashView.showLoadingDialog();
		mINetWork.getNetData(callback);
	}

	GlobalNetCallBack callback = new BaseGlobalNetCallBack(){
		@Override
		public void netData(String data) {
			if(!TextUtils.isEmpty(data)) mISplashView.startNextActivity();
			else mISplashView.showNextWorkError();

			mISplashView.hideLoadingDialog();
		}
	};
}
