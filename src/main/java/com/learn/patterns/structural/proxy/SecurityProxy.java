package com.learn.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

  private Object obj;

  private SecurityProxy(Object obj) {
    this.obj = obj;
  }

  public static Object newInstance(Object obj) {
    return Proxy.newProxyInstance(
        obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    if(method.getName().contains("post")) {
      throw new IllegalArgumentException("Post are not currently allowed");
    }
    return method.invoke(this.obj, args);
  }
}
