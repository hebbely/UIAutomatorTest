package com.hebbe.uiautomatortest;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;


import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by Hebbe on 2018/1/17.
 */
@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 22)
public class AutomatorTest {
    /*
    private static final String PACKAGE_ESPRESSOTEST = "com.hebbe.espressotest";
    private static final String PACKAGE_SETTING = "com.android.settings";

    @Test
    public void testEspressoTestApp() throws Exception {
        //初始化一个UiDevice对象
        UiDevice mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        // 点击home键，回到home界面
        mDevice.pressHome();
        String launcherPackage = mDevice.getLauncherPackageName();
        assertThat(launcherPackage,notNullValue());
        mDevice.wait(Until.hasObject(By.pkg(launcherPackage).depth(0)),3);

        // 启动espressotest App
        Context context = InstrumentationRegistry.getContext();
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(PACKAGE_ESPRESSOTEST);
        // 清除以前的实例
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);

        // 等待应用程序启动
        mDevice.wait(Until.hasObject(By.pkg(PACKAGE_ESPRESSOTEST).depth(0)),3);
        //通过id找到输入框一
        UiObject edt1 = mDevice.findObject(new UiSelector().resourceId("com.hebbe.espressotest:id/editText").className(EditText.class));
        //往里面输入字符3
        edt1.setText("3");
        //通过id找到输入框二
        UiObject edt2 = mDevice.findObject(new UiSelector().resourceId("com.hebbe.espressotest:id/editText2").className(EditText.class));
        //往里面输入字符4
        edt2.setText("4");
        //通过文本"计算"找到按钮
        UiObject btn = mDevice.findObject(new UiSelector().text("计算").className(Button.class));
        //执行点击事件，计算结果
        btn.click();
        //通过id找到显示结果的textview
        UiObject tvResult = mDevice.findObject(new UiSelector().resourceId("com.hebbe.espressotest:id/textView").className(TextView.class));
        //判断结果与预期是否匹配
        assertEquals(tvResult.getText(),"计算结果：7");

        //点击返回关闭对话框
        mDevice.pressBack();
    }

    @Test
    public void testSettingApp() throws Exception {
        //初始化一个UiDevice对象
        UiDevice mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        Context context = InstrumentationRegistry.getContext();
        //回到home界面
        mDevice.pressHome();
        // 启动设置
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(PACKAGE_SETTING);
        // 清除以前的实例
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
        //通过id找到scrollview
        UiScrollable scrollview = new UiScrollable(new UiSelector().className(ScrollView.class).resourceId("com.android.settings:id/dashboard"));
        //滑动到底部
        scrollview.flingForward();
        //通过文本找到关于手机
        UiObject aboutPhone = scrollview.getChild(new UiSelector().text("关于手机"));
        //点击跳转到手机信息界面
        aboutPhone.click();
        //通过description找到向上返回的ImageButton
        UiObject ibtnBack = mDevice.findObject(new UiSelector().className(ImageButton.class).description("向上导航"));
        //点击返回
        ibtnBack.click();
        //滑动到包含"提示音和通知"的地方
        scrollview.scrollTextIntoView("提示音和通知");
        //通过显示的文本找到控件
        UiObject notify = scrollview.getChild(new UiSelector().text("提示音和通知"));
        //点击跳转到下一个界面
        notify.click();
        //通过显示的文本"手机铃声"找到控件
        UiObject sound = mDevice.findObject(new UiSelector().text("手机铃声"));
        //点击跳转到铃声对话框
        sound.click();
        //通过id找到铃声列表
        UiScrollable listview = new UiScrollable(new UiSelector().className(ListView.class).resourceId("android:id/select_dialog_listview"));
        //活动到包含"Beat Plucker"处
        listview.scrollTextIntoView("Beat Plucker");
        //通过显示的文本找到该项
        UiObject beat = listview.getChild(new UiSelector().text("Beat Plucker"));
        //执行点击选中铃声
        beat.click();
        //通过文本"确定"找到对话框中的确定按钮
        UiObject btnConfirm = mDevice.findObject(new UiSelector().text("确定").className(Button.class));
        //点击确定关闭对话框
        btnConfirm.click();
        //通过id找到显示结果的TextView
        UiObject tvSound = mDevice.findObject(new UiSelector().resourceId("android:id/summary").className(TextView.class));
        //比较与预期结果是否一致
        assertEquals(tvSound.getText(),"Beat Plucker");
        //点击home键
        mDevice.pressHome();
        //点击最近应用键
        mDevice.pressRecentApps();
        //通过类名找到显示最近app的控件TaskStackView
        UiScrollable taskStackView = new UiScrollable(new UiSelector().className("com.android.systemui.recents.views.TaskStackView"));
        //滑动到包含"EspressoTests"处
        taskStackView.scrollTextIntoView("EspressoTest");
        //通过显示的文本找到item
        UiObject espressoTestApp = taskStackView.getChild(new UiSelector().text("EspressoTest"));
        //点击切换到前面的espressoTestsApp
        espressoTestApp.click();
    }
    */
}