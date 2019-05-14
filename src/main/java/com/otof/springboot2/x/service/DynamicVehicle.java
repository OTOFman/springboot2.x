package com.otof.springboot2.x.service;

import java.lang.reflect.*;

public class DynamicVehicle {

//    public static void run() throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
//
//        //1. 根据接口Vehicle信息获取Vehicle的class对象
//        Class vehicleProxyClazz = Proxy.getProxyClass(Vehicle.class.getClassLoader(), Vehicle.class);
//        //2. 从上述方式构建的class中获取对应的constructor
//        Constructor constructor = vehicleProxyClazz.getConstructor(InvocationHandler.class);
//        //3. 根据2中创建的构造器来创建代理对象实例
//        Vehicle vehicleImpl = (Vehicle) constructor.newInstance((InvocationHandler) new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Bike bike = new Bike();
//                Object result = method.invoke(bike, args);
//                return result;
//            }
//        });
//        vehicleImpl.drive();
//    }

    public static void  run() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle proxyBikeObj = (Vehicle) proxyObject(bike);
        Vehicle proxyCarObj = (Vehicle) proxyObject(car);
        proxyBikeObj.drive();
        proxyCarObj.drive();
    }
//
//    private static Object proxyObject(Object target) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
//        Constructor constructor = proxyClazz.getConstructor(InvocationHandler.class);
//        Object objectImpl =  constructor.newInstance((InvocationHandler) new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                Object result = method.invoke(target, args);
//                return result;
//            }
//        });
//
//        return objectImpl;
//    }
        private static Object proxyObject(Object target) {
            return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                    target.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        Object result = method.invoke(target, args);
                        return result;
                    });
        }


}
