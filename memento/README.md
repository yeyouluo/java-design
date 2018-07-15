## 备忘录模式
在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存该状态。这样以后就可以将对象恢复到原先保存的状态。

### 关键代码
客户不与备忘录类耦合，与备忘录管理类耦合。

### 注意事项
为了节约内存，可使用原型模式+备忘录模式。