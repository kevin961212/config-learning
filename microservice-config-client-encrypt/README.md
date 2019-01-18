配置客户端ConfigClient链接经过对称加解密的配置微服务


1、Git服务端的文件内容进行了加密处理，那么是不是配置客户端拿到内容之后需要解密呢？
2、答案显然不是的，因为这样解密的话，先不说实现起来的难易程度，单从表面上来讲，
若是加解密频繁换的话，那客户端是不是每次都得升级解密算法呢？
3、而 SpringCloud 配置客户端不需要做什么加解密的配置，加解密的配置在服务端做就好了；



配置中加密和解密：
例如：foobar
加密
curl -X POST http://localhost:8080/encrypt -d foobar
解密
curl -X POST http://localhost:8080/decrypt -d 4126ff42a0e70b88be94f0f782
fb7296a985f7cf3b3f9eb0ce01f268d5408e77



