1、有配置服务端，那么势必就会有与之对应的客户端，SpringCloud 文档中集成也非常简单；
2、但是这里有点需要注意，就是 bootstrap 配置文件，
官方建议我们在bootstrap中放置不更改的属性，我们同样也需要在这里做一些简单不易于改变的配置；
3、这里还顺便列举下配置路径的规则：
配置服务的路径规则：

/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties















