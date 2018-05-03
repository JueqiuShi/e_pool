package com.cc.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Util {
	/**
	 * ����ת��
	 * 
	 * @param context
	 * @param des
	 */
	public static void startActivity(Context context, Class des) {
		Intent intent = new Intent();
		intent.setClass(context, des);
		context.startActivity(intent);
		// �ر�ԴActivity
		((Activity) context).finish();
	}

	public static void startActivity(Context context, Class des, Bundle bundle) {
		Intent intent = new Intent();
		intent.setClass(context, des);
		intent.putExtras(bundle);
		context.startActivity(intent);
		// �ر�ԴActivity
		((Activity) context).finish();

	}
	public static void toast(String str,Context context){
		Toast.makeText(context, str, 0).show();
	}
}
