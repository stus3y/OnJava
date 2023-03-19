package com.OnJava.Chapter11.innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

// 用于控制系统的复用框架
public class Controller {
    /**
     * 事件列表
     */
    private List<Event> eventList = new ArrayList<>();

    /**
     * 增加事件
     * @param c
     */
    public void addEvent(Event c) { eventList.add(c); }

    /**
     * 执行事件
     */
    public void run() {
        while (eventList.size() > 0)
            for(Event e: new ArrayList<>(eventList))
                // 判断事件是否就绪
                if (e.ready()) {
                    System.out.println(e);
                    // 执行
                    e.action();
                    // 移除事件列表
                    eventList.remove(e);
                }
    }
}
