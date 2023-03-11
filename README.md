# 自定义SpringIOC

> [笔记地址](https://dingxinliang88.github.io)
> 左侧全部文章选择`DesignPattern`标签，选择自定义SpringIOC


**使用须知：**

## 1、 使用到的设计模式

* 工厂模式。这个使用工厂模式 + 配置文件的方式。
* 单例模式。Spring IOC管理的bean对象都是单例的，此处的单例不是通过构造器进行单例的控制的，而是spring框架对每一个bean只创建了一个对象。
* 模板方法模式。AbstractApplicationContext类中的finishBeanInitialization()方法调用了子类的getBean()方法，因为getBean()的实现和环境息息相关。
* 迭代器模式。对于MutablePropertyValues类定义使用到了迭代器模式，因为此类存储并管理PropertyValue对象，也属于一个容器，所以给该容器提供一个遍历方式。

spring框架其实使用到了很多设计模式，如AOP使用到了代理模式，选择JDK代理或者CGLIB代理使用到了策略模式，还有适配器模式，装饰者模式，观察者模式等。

## 2、符合大部分设计原则

## 3、整个设计和Spring的设计还是有一定的出入

spring框架底层是很复杂的，进行了很深入的封装，并对外提供了很好的扩展性。而我们自定义SpringIOC有以下几个目的：

* 了解Spring底层对对象的大体管理机制。
* 了解设计模式在具体的开发中的使用。
* 以后学习spring源码，通过该案例的实现，可以降低spring学习的入门成本。

## 4、配置文件格式：

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans>
    <bean id="userDao" class="com.juzi.dao.impl.UserDaoImpl">
        <property name="password" value="zhangsan"/>
        <property name="username" value="zhangsan"/>
    </bean>

    <bean id="userService" class="com.juzi.service.impl.UserServiceImpl">
        <property name="userDao" ref="userDao"/>
    </bean>
</beans>
```
## 5、使用说明：

克隆仓库

```bash
git clone https://gitee.com/ding-xinliang/my-spring-ioc.git
```

刷新`pom.xml`文件

安装到本地仓库

```bash
mvn clean && install
```

项目中导入坐标：

```xml
<dependency>
    <groupId>cn.juzi</groupId>
    <artifactId>my_spring_ioc</artifactId>
    <version>0.0.1</version>
</dependency>
```

正常使用SpringIOC 功能



