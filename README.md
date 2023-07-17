## 目的
我们希望通过pom依赖自动装配一个线程池ThreadPool

## 步骤
- 在模块springboot-threadPool-starter中创建ThreadPoolAutoConfiguration用于注入线程池bean
- 在模块springboot-threadPool-starter的resources中创建约定
- 在springboot-main模块中引入对应的依赖坐标，并在项目中使用autowire打印出我们的自动注入的线程池（可以打断点看看import源码）

## 参考
[springboot自动装配原理](https://2290653824.github.io/pages/0eaa16/)
