### @Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

- @Component 注解是一个类级别的注解，自动使用类路径扫描来检测和配置 bean；@Bean 注解是一个方法级别的注解，显示的声明了单个 bean，没有让 srping 自动去执行；@Bean 较 @Component 来说更加灵活，能够允许我们精确的创建和配置 bean；
- 当想要将第三方库中的组件装配到自己的应用中时，是无法在其类上添加 @Component 注解的，此时可以使用 @Bean 注解。