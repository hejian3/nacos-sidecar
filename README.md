##### NodeJS+Python+Nacos + Spring Cloud Alibaba Sidecar + OpenFeign + Gateway

###### 实现思路

- Node服务通过Spring Cloud Alibaba Sidecar 注册到Nacos上
- Python服务通过Spring Cloud Alibaba Sidecar 注册到Nacos上
- Node通过网关调用Java服务
- Python通过网关调用Java服务
- Node与Python互相调用通过网关即可

###### 环境

| 组件                | 版本           |
| ------------------- | -------------- |
| JDK                 | 8              |
| Nacos               | 2.0.1          |
| Springboot          | 2.3.11.RELEASE |
| SpringCloud         | Hoxton.RELEASE |
| SpringCloud Alibaba | 2.1.2.RELEASE  |
| OpenFeign           | 2.2.0.RELEASE  |
| Gateway             | 2.2.0.RELEASE  |
| Node                | 14.17.0        |
| Python              | 3.9.5          |

###### 服务地址

| 服务                    | 地址           |
| ----------------------- | -------------- |
| Nacos                   | 127.0.0.1:8848 |
| nacos-sidecar-gateway   | 127.0.0.1:8585 |
| nacos-sidecar-consumer  | 127.0.0.1:8282 |
| nacos-sidecar-provider  | 127.0.0.1:8181 |
| python-sidecar-consumer | 127.0.0.1:8484 |
| python-sidecar-provider | 127.0.0.1:8383 |
| nodejs                  | 127.0.0.1:8080 |
| python                  | 127.0.0.1:9999 |

###### 代码结构

```
nacos-sidecar
│   README.md 
│
└───nacos-sidecar-gateway
│
└───sidecar-nodejs-consumer
│
└───sidecar-nodejs-provider
│
└───sidecar-python-consumer
│
└───sidecar-python-provider
│   
└───node
│    │   node-service.js
└───python
│    │   hello.py
│    │   server.py
```

###### 运行

1. 启动Nacos服务

2. 启动NodeJs服务

   ```javascript
   node ./node/node-service.js	
   ```

3. 启动网关服务(nacos-sidecar-gateway)

4. 启动NodeJs服务提供者

5. 启动NodeJs服务消费者

6. 验证NodeJs效果

   ```html
   curl http://localhost:8585/nodejs/hello
   ```

7. 启动Python服务

   ```
   python ./python/server.py
   ```

8. 启动Python服务提供者

9. 启动Python服务消费者

10. 验证python效果

    ```
    curl http://localhost:8585/python/hello
    ```

###### 资料

[Polyglot support with Sidecar](https://cloud.spring.io/spring-cloud-netflix/multi/multi__polyglot_support_with_sidecar.html)

##### 后记

可以直接通过网关访问服务，不需要通过消费者

