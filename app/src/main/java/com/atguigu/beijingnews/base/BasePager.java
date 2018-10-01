package com.atguigu.beijingnews.base;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.atguigu.beijingnews.MainActivity;
import com.atguigu.beijingnews.R;

/**
 * Created by xinpengfei on 2016/10/17.
 * 微信:18091383534
 * Function :各个页面的公共类
 * 标题栏和内容部分:主页，新闻，商城，购物车，设置页面都继承BasePager
 */

public class BasePager {

    public Context context;
    public Button btn_cart;
    public TextView tv_title;
    public ImageButton ib_menu;
    public FrameLayout fl_base_content;
    public ImageButton ib_switch_list_grid;

    /**
     * 代表每个页面的视图
     */
    public View rootView;

    public BasePager(Context context) {
        this.context = context; // 接收上下文要放在第一行代码里
        rootView = initView();
    }

    /**
     * 初始化公共视图
     */
    private View initView() {
        View view = View.inflate(context, R.layout.basepager, null);
        ib_menu = (ImageButton) view.findViewById(R.id.ib_menu);
        tv_title = (TextView) view.findViewById(R.id.tv_title);
        fl_base_content = (FrameLayout) view.findViewById(R.id.fl_base_content);
        ib_switch_list_grid = (ImageButton) view.findViewById(R.id.ib_swich_list_grid);
        btn_cart = (Button) view.findViewById(R.id.btn_cart);

        ib_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2.左侧菜单收起
                MainActivity mainActivity = (MainActivity) context;
                mainActivity.getSlidingMenu().toggle(); // 开<-->关
            }
        });
        return view;
    }

    /**
     * 由子类重写该方法，子视图和FrameLayout结合成一个页面；绑定数据
     */
    public void initData() {

    }
}
