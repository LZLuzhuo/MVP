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
package me.luzhuo.mvp.ui.view;

/**
 * =================================================
 * <p>
 * Author: Luzhuo
 * <p>
 * Version: 1.0
 * <p>
 * Creation Date: 2016/8/21 19:46
 * <p>
 * Description: 定义可能有的ui操作
 * <p>
 * Revision History:
 * <p>
 * Copyright: Copyright 2016 Luzhuo. All rights reserved.
 * <p>
 * =================================================
 **/
public interface ISplashView {
	/**
	 * 显示加载对话框
	 */
	void showLoadingDialog();

	/**
	 * 开启下个界面
	 */
	void startNextActivity();

	/**
	 * 显示错误信息
	 */
	void showNextWorkError();

	/**
	 * 关闭加载对话框
	 */
	void hideLoadingDialog();
}
