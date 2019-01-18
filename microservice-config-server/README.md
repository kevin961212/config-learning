
1、在讲到配置时，不得不说 SpringCloud 提供了一套解决分布式的配置管理方案，
它既包含了服务端ConfigServer也包含了客户端ConfigClient；
2、SpringCloud 将配置文件当作源代码一样存储到 git 或者 svn 服务器上，
虽然说这样没有什么管理界面配置啥的，既然能用 svn 上传上去，那也能做成管理界面，
只是花的工作量多少而已了，而既然都说了是配置，那就是只要会稍微学些git或者svn的提交文件方式，
基本上任何都极易掌握；
3、当我们把配置文件放在 git 上的时候，我们如果要做到更新的话，
我们需要借助于 git 网页上的 push 操作来触发更新操作；
4、该项目实现 ConfigServer 是如何和 Git 服务器相关联存储配置。


注：在自动刷新的时候，将refresh的执行放到某一个Client不是很合理，
我们可以放到server中，让server来负责其刷新机制

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
 3、启动 microservice-config-server 模块服务，启动1个端口；

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

