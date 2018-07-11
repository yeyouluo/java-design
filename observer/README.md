## 观察者模式
观察者模式定义了一种一对多的依赖关系，让多个观察者同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够更新自己的状态。  
观察者模式也叫发布-订阅模式。  
观察者模式是一种很常用的模式，比如对ZooKeeper、kafka、redis的监听。


### 关键代码
在抽象类里有一个 ArrayList 存放观察者们

### 现成的观察者模式
1. JDK内置的观察者模式
2. [Guava EventBus](http://uule.iteye.com/blog/2096279)
3. [Spring事件驱动机制](http://www.importnew.com/26782.html)