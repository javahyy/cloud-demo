
Spring Cloud入门教程-Config Server从github 远程读取配置文件
https://blog.csdn.net/qq_27828675/java/article/details/83504743
其中 
spring.cloud.config.server.git.uri 为GitHub 项目名
spring.cloud.config.server.git.search-paths 为存放配置文件的目录
spring.cloud.config.server.git.username 为github  账号
spring.cloud.config.server.git.password  密码
spring.cloud.config.label=master  分支名


SpringCloud Config 配置中心
https://www.jianshu.com/p/41c2cd7c498a

假如需要设置保存到指定路径的话，可以在配置文件中加入basedir。

spring cloud config中配置占位符searchPaths: {application}的坑
https://blog.csdn.net/weixin_35022258/java/article/details/79019033


访问：
http://localhost:8101/配置文件名字-随意字符.yml
如访问 blog.yml
地址为：
http://localhost:8101/blog-a.yml
