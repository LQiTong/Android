package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 1)super（参数）：调用基类中的某一个构造函数（应该为构造函数中的第一条语句）
        // 2)this（参数）：调用本类中另一种形成的构造函数（应该为构造函数中的第一条语句）
        // 3)super:　它引用当前对象的直接父类中的成员（用来直接访问父类中被隐藏的父类中成员数据或函数，
        //      基类与派生类中有相同成员定义时如：super.变量名 super.成员函数据名（实参）
        // 4)this：它代表当前对象名（在程序中易产生二义性之处，应使用this来指明当前对象；
        //      如果函数的形参与类中的成员数据同名，这时需用this来指明成员变量名）
        // 5）调用super()必须写在子类构造方法的第一行，否则编译不通过。每个子类构造方法的第一条语句，
        //      都是隐含地调用super()，如果父类没有这种形式的构造函数，那么在编译的时候就会报错。
        // 6）super()和this()类似,区别是，super()从子类中调用父类的构造方法，this()在同一类内调用其它方法。
        // 7）super()和this()均需放在构造方法内第一行。
        // 8）尽管可以用this调用一个构造器，但却不能调用两个。
        // 9）this和super不能同时出现在一个构造函数里面，因为this必然会调用其它的构造函数，
        //      其它的构造函数必然也会有super语句的存在，所以在同一个构造函数里面有相同的语句，
        //      就失去了语句的意义，编译器也不会通过。
        // 10）this()和super()都指的是对象，所以，均不可以在static环境中使用。
        //      包括：static变量,static方法，static语句块。
        // 11）从本质上讲，this是一个指向本对象的指针, 然而super是一个Java关键字
        super.onCreate(savedInstanceState);
        // 设置内容视图
        setContentView(R.layout.activity_main);
        // 设置支撑bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // 浮动操作按钮
        FloatingActionButton fab = findViewById(R.id.fab);
        // 浮动操作按钮的点击事件监听
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // 将菜单充气；如果存在，这会将项目添加到操作栏。
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // 处理此处单击的操作栏项。只要您在androidmanifest.xml中指定父活动，操作栏将自动处理单击Home/Up按钮的操作。
        int id = item.getItemId();

        // noinspection SimplifiableIfStatement
        // 简化检查
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
