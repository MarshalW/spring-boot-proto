# Spring Boot 原型项目

## 构建和运行

```bash
git clone git@github.com:MarshalW/spring-boot-proto.git
cd spring-boot-proto

mvn spring-boot:run
```

访问 http://localhost:8080

原型版本列表：

- v0.1.0 初始版本，最基本的 Application 和首页访问 http://localhost:8080
- v0.2.4 实现单独的 restful api 示例, http://localhost:8080/users
- v0.3.0 实现最基本的 MyBatis 集成示例, controller+repository，http://localhost:8080/users
- v0.4.0 实现了标准的 MyBatis 集成示例，controller+service+repository+entity, http://localhost:8080/users http://localhost:8080/users/:id

