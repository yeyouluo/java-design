## 责任链模式
避免请求的发送者和接受者之间的耦合关系，将多个对象形成一条链，使多个对象都有机会处理请求；并沿着这条链传递请求，直到有一个对象处理它为止。

### 关键代码
Handler 里面聚合它自己，在 HanleRequest 里判断是否合适，如果没达到条件则向下传递，向谁传递之前 set 进去。

### 注意事项
不能保证请求一定被处理，有可能到了链的末端还得不到处理，因此需要考虑全面。 

### Apache commons chain实现
Commons Chain对责任链模式做了实现。参考[官网](https://commons.apache.org/proper/commons-chain/)。