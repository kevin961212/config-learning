单点手动动态刷新ConfigClient配置

1、当ConfigServer启动后，假如我们新增配置内容的话，是不是要重新启动一下ConfigServer呢？
2、答案肯定是不需要重新启动的，因为 SpringCloud 给我们提供了一个刷新的触发机制，
这样便可以在不重新的情况下重新加载最新配置文件内容；

通过curl手动刷新

curl -X POST http://localhost:8082/refresh


