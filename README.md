
# config-learning

#### 项目介绍
spring cloud config配置中心的测试代码

#### 软件架构
软件架构说明


#### 使用说明

Spring Cloud Config连接git的服务端，端口（8080）
Spring Cloud Config连接git的客户端，端口（8081）
    测试：http://localhost:8081/profile（更多测试看microservice-config-server的README.md）
    
Spring Cloud Config加解密对称的服务端，端口（8010）
Spring Cloud Config加解密对称的客户端，端口（8012）
    测试：http://localhost:8012/profile
    
Spring Cloud Config加解密非对称RSA的服务端，端口（8020）
Spring Cloud Config加解密非对称RSA的客户端，端口（8022）
    测试：http://localhost:8022/profile
    
Spring Cloud Config使用安全认证的服务端，端口（8030）
Spring Cloud Config使用安全认证的客户端，端口（8031）
    测试：http://localhost:8031/profile
    
Spring Cloud Config与Eureka配合使用的服务端，端口（8040）
Spring Cloud Config与Eureka配合使用的客户端，端口（8041）
    测试：http://localhost:8041/profile
    
Spring Cloud Config之手动刷新，端口（8082），一次只能刷新一个客户端
    测试：curl -X POST http://localhost:8082/refresh
        http://localhost:8082/profile
        
Spring Cloud Config之半自动刷新，端口（8083），可以多个端口，测试批量刷新
    测试：curl -X POST http://localhost:8083/bus/refresh（随意选择一个客户端对所有的客户端进行半自动刷新）
    http://localhost:8083/profile
    http://localhost:8084/profile
如果想要自动刷新，需要到码云上添加Web Hooks的URL，密码随意设置   
