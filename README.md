---
title: SpringCloud
date: 2020-05-11 20:00:00
tags: SpringCloud
---

![SpringCloud](https://i.loli.net/2020/05/11/VXWP8n9TkcOAhL4.png)

SpringCloud 微服务架构的集大成者

SpringCloud的**基础功能**：

- 服务治理： Spring Cloud Eureka
- 客户端负载均衡： Spring Cloud Ribbon
- 服务容错保护： Spring Cloud Hystrix
- 声明式服务调用： Spring Cloud Feign
- API网关服务：Spring Cloud Zuul
- 分布式配置中心： Spring Cloud Config

Eureka 负责自动化管理服务地址 不然的话就要手动维护静态配置（ip）极为麻烦



Eureka的治理机制：

- 服务提供者

- - **服务注册：启动的时候会通过发送REST请求的方式将自己注册到Eureka Server上**，同时带上了自身服务的一些元数据信息。
  - **服务续约：**在注册完服务之后，**服务提供者会维护一个心跳**用来持续告诉Eureka Server: "我还活着 ” 、
  - **服务下线：当服务实例进行正常的关闭操作时，它会触发一个服务下线的REST请求**给Eureka Server, 告诉服务注册中心：“我要下线了 ”。

- 服务消费者

- - **获取服务：当我们启动服务消费者**的时候，它会发送一个REST请求给服务注册中心，来获取上面注册的服务清单
  - **服务调用：服务消费者在获取服务清单后，通过服务名**可以获得具体提供服务的实例名和该实例的元数据信息。在进行服务调用的时候，**优先访问同处一个Zone中的服务提供方**。



- Eureka Server(服务注册中心)：

- - **失效剔除：**默认每隔一段时间（默认为60秒） 将当前清单中超时（默认为90秒）**没有续约的服务剔除出去**。
  - **自我保护：**。EurekaServer 在运行期间，会统计心跳失败的比例在15分钟之内是否低于85%(通常由于网络不稳定导致)。 Eureka Server会将当前的**实例注册信息保护起来**， 让这些实例不会过期，尽可能**保护这些注册信息**。

![2](https://i.loli.net/2020/05/11/82ihkGBC6pZA95q.png)



搞懂了eureka，那么其余的就很简单

## RestTemplate和Ribbon

RestTemplate是spring封装好的工具类，可以直接进行远程调用。而Ribbon是防止大量用户并发的负载均衡。默认策略是轮询，还有其他随机，或者进行自定义。

## Hystrix

在**高并发**的情况下，由于单个服务的延迟，可能导致**所有的请求都处于延迟状态**，甚至在几秒钟就使服务处于负载饱和的状态，资源耗尽，直到不可用，最终导致这个分布式系统都不可用，这就是“雪崩”。

hystrix提供了断路器，线程隔离。还有个hystrix仪表盘来反馈实时信息。

## Feign

Ribbon和Hystrix了，可以发现的是：他俩作为基础工具类框架**广泛地应用**在各个微服务的实现中。我们会发现对这两个框架的**使用几乎是同时出现**的。

为了**简化**我们的开发，Spring Cloud Feign出现了！它基于 Netflix Feign 实现，**整合**了 Spring Cloud Ribbon 与 Spring Cloud Hystrix, 除了整合这两者的强大功能之外，它还提 供了**声明式的服务调用**(不再通过RestTemplate)。

> Feign是一种声明式、模板化的HTTP客户端。在Spring Cloud中使用Feign, 我们可以做到使用HTTP请求远程服务时能与调用本地方法一样的编码体验，开发者完全感知不到这是远程方法，更感知不到这是个HTTP请求。

个人理解这是面向接口式开发，让开发者更便利。

## Zuul

**API网关**的概念应运而生。在SpringCloud中了提供了基于Netfl ix Zuul实现的API网关组件**Spring Cloud Zuul**。

Zuul天生就拥有线程隔离和断路器的自我保护功能，以及对服务调用的客户端负载均衡功能。也就是说：**Zuul也是支持Hystrix和Ribbon**。

## SpringCloud Config

随着业务的扩展，我们的服务会越来越多，越来越多。每个服务都有自己的配置文件。

既然是配置文件，给我们配置的东西，那**难免会有些改动**的。

比如我们的Demo中，每个服务都写上**相同**的配置文件。万一我们有一天，配置文件中的密码需要更换了，那就得**三个都要重新更改**。

> 在分布式系统中，某一个基础服务信息变更，都**很可能**会引起一系列的更新和重启

Spring Cloud Config项目是一个解决分布式系统的配置管理方案。它包含了Client和Server两个部分，**server提供配置文件的存储、以接口的形式将配置文件的内容提供出去，client通过接口获取数据、并依据此数据初始化自己的应用**。

- 简单来说，使用Spring Cloud Config就是将配置文件放到**统一的位置管理**(比如GitHub)，客户端通过接口去获取这些配置文件。
- 在GitHub上修改了某个配置文件，应用加载的就是修改后的配置文件。



最后，

参考代码	-->	https://github.com/leib1368/springcloud

参考文档	--> 	https://www.springcloud.cc/

参考视频	-->	bilibili.com/video/BV1jJ411S7xr