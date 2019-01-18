配置客户端ConfigClient链接经过对称加解密的配置微服务

配置客户端不需要做任何加解密的配置，加解密的配置在服务端做就好了



配置中加密和解密：
例如：foobar
加密
curl -X POST http://localhost:8080/encrypt -d foobar
解密
curl -X POST http://localhost:8080/decrypt -d 4126ff42a0e70b88be94f0f782
fb7296a985f7cf3b3f9eb0ce01f268d5408e77



