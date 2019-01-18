配置服务端ConfigServer设置安全认证

虽然之前对内容进行了加密，但是为了更安全的安全隔离服务与服务之间也需要设置简单的安全认证。


访问配置文件的格式：
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties

命中默认的配置application.yml（优先级高）：
http://localhost:8080/master/xxx-default.yml

命中设置的配置foobar-dev.yml：
http://localhost:8080/master/foobar-dev.yml

查看默认的配置
http://localhost:8080/xxx/dedault/master

查看设置的配置
http://localhost:8080/foobar/dev/master

bootstrap.*里面的配置   ---->连接Config server，加载远程配置    --->加载application.*里面的配置


配置文件配置git上的uri

一、ConfigServer 配置管理微服务（正常测试）（添加一个配置文件 application.yml 来做测试）：

 1、注解：EnableConfigServer
 2、编辑 application.yml 文件，注意只填写 cloud.config.server.git.uri 属性；
 3、启动 springms-config-server 模块服务，启动1个端口；

 4、在浏览器输入地址 http://localhost:8220/abc-default.properties 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 5、在浏览器输入地址 http://localhost:8220/abc-default.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 6、在浏览器输入地址 http://localhost:8220/abc-hehui.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 7、在浏览器输入地址 http://localhost:8220/aaa-bbb.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 8、在浏览器输入地址 http://localhost:8220/aaa-bbb.properties 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；

 总结一：按照 /{application}-{profile}.yml 和 /{application}-{profile}.properties 这种规则来测试的，当找不到路径的话，会默认找到 application.yml 文件读取字段内容；

 9、在浏览器输入地址 http://localhost:8220/master/abc-default.properties 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 10、在浏览器输入地址 http://localhost:8220/master/abc-default.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 11、在浏览器输入地址 http://localhost:8220/master/abc-hehui.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 12、在浏览器输入地址 http://localhost:8220/master/aaa-bbb.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 13、在浏览器输入地址 http://localhost:8220/master/aaa-bbb.properties 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；
 14、在浏览器输入地址 http://localhost:8220/springms-config-server-dev.yml 正常情况下会输出配置文件的内容（内容为：profile: profile-default）；

 总结二：按照 /{label}/{application}-{profile}.yml 和 /{label}/{application}-{profile}.properties 这种规则来测试，当找不到路径的话，会默认找到 application.yml 文件读取字段内容；
 总结三：所以不管怎么测试路径规则，找不到的话，反正也不会抛什么异常，反正一律会映射到 application.yml 文件上；

