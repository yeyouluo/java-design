# java-design
《大话设计模式》代码Java版本

**设计模式**就是前人总结的从设计的角度解决一些问题的套路。

------

**[读书笔记](https://github.com/yeyouluo/java-design/blob/master/Note.md)**

------

###  设计模式6大原则

**1、开闭原则（Open Close Principle）**

**对扩展开放，对修改关闭**。

在程序需要进行拓展的时候，不能去修改原有的代码，实现热插拔效果。

多使用接口和抽象类。

**2、里氏代换原则（Liskov Substitution Principle）**

任何基类（接口或者父类）可以出现的地方，子类一定可以出现。

这个原则是对开闭原则的补充。

实现开闭原则的关键步骤是**抽象化**。

**3、依赖倒转原则（Dependence Inversion Principle）**

针对接口编程，依赖于抽象而不依赖于具体。

这个原则是开闭原则的基础。

**4、接口隔离原则（Interface Segregation Principle）**

使用多个隔离的接口，比使用单个接口要好。更好地降低耦合度。

**5、迪米特法则，又称最少知道原则（Demeter Principle）**

一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

**6、合成复用原则（Composite Reuse Principle）**

尽量使用合成/聚合的方式，而不是使用继承。

### 设计模式分类

​           [简单工厂模式](https://github.com/yeyouluo/java-design/tree/master/simple-facotory)
- 创建型模式：<u>*专注生产对象，不直接使用new*</u>
  - [工厂方法模式](https://github.com/yeyouluo/java-design/tree/master/factory-method)
  - 抽象工厂模式
  - 原型模式
  - 建造者模式
  - 单例模式
- 结构型模式：*<u>关注类和对象的组合</u>*
  - 适配器模式
  - 桥接模式
  - 组合模式
  - [装饰器模式](https://github.com/yeyouluo/java-design/tree/master/decorator)
  - 外观模式
  - 享元模式
  - [代理模式](https://github.com/yeyouluo/java-design/tree/master/proxy)
- 行为模式（类行为型模式）：*<u>关注对象之间的通信</u>*
  - 解释器模式
  - 模板方法模式
- 行为模式（对象行为型模式）：*<u>关注对象之间的通信</u>*
  - [策略模式](https://github.com/yeyouluo/java-design/tree/master/strategy)
  - 观察者模式
  - 状态模式
  - 备忘录模式
  - 迭代器模式
  - 命令模式
  - 职责链模式
  - 中介者模式
  - 访问者模式

## 设计模式其他有价值的参考资料

- [菜鸟教程：设计模式](http://www.runoob.com/design-pattern/design-pattern-tutorial.html)