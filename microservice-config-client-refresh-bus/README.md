通过bus/refresh半自动刷新ConfigClient配置

1、之前讲到了手动刷新配置，但是如果微服务多的话，那么是不是需要对每台服务进行手动刷新呢？
2、答案肯定是不需要的，我们也可以采用 rabbitmq 消息中间件产品来增强刷新机制；

Erlang
安装MQ
在命令行输入该命令可以进去监控页面
rabbitmq-plugins enable rabbitmq_management
进入监控页面：http://localhost:15672
账号和密码都是：guest
到curl下
curl -X POST http://localhost:8083/bus/refresh
执行半自动刷新，可以起两个端口作为批量测试（批量刷新）
    测试：localhost:8083/profile
    测试：localhost:8084/profile

如果想要自动刷新，需要到码云上添加Web Hooks的URL，密码随意设置
    http://192.168.0.104:8083/bus/refresh   (外网IP)
    测试：localhost:8083/profile
    注：在自动刷新的时候，将refresh的执行放到某一个Client不是很合理，
    我们可以放到server中，让server来负责其刷新机制