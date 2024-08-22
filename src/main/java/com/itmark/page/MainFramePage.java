package com.itmark.page;

import cn.hutool.core.lang.Console;
import com.itmark.constant.BoxAppConstant;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @description: 主页面框架
 * @author: MAKUAN
 * @date: 2024/8/22 14:43
 */
public class MainFramePage {
    JFrame jFrame = new JFrame(BoxAppConstant.APP_TITLE);

    /**
     * 定义一个可切换页面的组件
     * 设置第几个禁用 tabbedPane.setEnabledAt(0,false);
     */
    JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.LEFT,JTabbedPane.SCROLL_TAB_LAYOUT);
    public void init(){

        tabbedPane.addTab("切换",new JList<String>(new String[]{"切换1","切换2","切换3"}));
        tabbedPane.addTab("管理",new JList<String>(new String[]{"管理1","管理2","管理3"}));
        tabbedPane.addTab("设置",new JList<String>(new String[]{"设置1","设置2","设置3"}));
        tabbedPane.addTab("关于",new JList<String>(new String[]{"关于1","关于2","关于3"}));

        // 设置默认被选中
        tabbedPane.setSelectedIndex(0);

        // 设置监听器
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                Console.log("被选中了：{}"+selectedIndex);
            }

        });

        // 放入frame
        jFrame.add(tabbedPane);

        // 设置窗口大小
        jFrame.setBounds(400,400,400,400);

        // 是否可以重新设置窗口大小
        jFrame.setResizable(false);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }

}
