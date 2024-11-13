package com.sky.context;

public class BaseContext {
  //工具类 用于用threadlocal来存储和获得当前的线程ID 启动一次程序 tomcat给分配一个线程
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
