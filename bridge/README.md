## 桥接模式
将抽象部分与它的实现相分离，使它们都可以独立变化。  
桥接模式是合成/复用原则的生动体现。

### 对桥接模式的通俗理解
实现系统可能有多角度分类，每一种分类都有可能变化，为了减少它们之间的耦合，就把这种多角度分离出来让它们独立变化。

### 关键代码
抽象类依赖实现类。