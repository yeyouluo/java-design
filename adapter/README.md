## 适配器模式
将一个类的接口转换为客户希望的另一个接口。适配器模式可以让原本接口不兼容的类变得兼容。

### 何时使用
系统的行为和数据都正确，但接口不符时，考虑使用适配器。  
适配器模式主要应用于希望复用一些现有的类，但接口与复用环境不一致的情况。  
适配器模式在开发阶段一般不考虑（但不排除为了适配三方接口的情况），在维护阶段应用较多。

### 关键代码
适配器继承或依赖已有的对象，实现想要的目标接口。