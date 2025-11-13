# AI Bot

AI Bot是一个基于Spring Boot的智能机器人项目。

## 项目结构

```
ai-bot/
├── ai-bot-common/     # 公共模块
├── ai-bot-core/       # 核心业务模块
├── ai-bot-start/      # 启动模块
├── docs/              # 文档
└── pom.xml           # 主pom文件
```

## 技术栈

- Java 17
- Spring Boot 3.5.6
- Maven
- Lombok

## 快速开始

### 环境要求

- JDK 17+
- Maven 3.6+

### 运行项目

```bash
# 编译项目
mvn clean compile

# 运行项目
mvn spring-boot:run -pl ai-bot-start

# 打包项目
mvn clean package
```

## 开发指南

### 模块说明

- **ai-bot-common**: 公共工具类、常量定义等
- **ai-bot-core**: 核心业务逻辑、服务层
- **ai-bot-start**: 应用启动入口、配置文件

### 代码规范

项目遵循阿里巴巴Java开发规范，详见 `.amazonq/rules/` 目录下的规范文件。

## 许可证

本项目采用 Apache License 2.0 许可证。
