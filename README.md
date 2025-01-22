生产计划管理系统
Production Plan Management System
项目简介
Project Introduction
生产计划管理系统是一个基于Spring Boot和HTML的轻量级管理系统，旨在帮助农业生产者高效管理生产计划。系统支持完整的CRUD（创建、读取、更新、删除）操作，涵盖从种植前准备到后期管理的各个环节，包括土壤检测、种子选择、播种、施肥、灌溉、病虫害防治、收获等。
The Production Plan Management System is a lightweight management system built with Spring Boot and HTML, designed to help agricultural producers manage their production plans efficiently. It supports full CRUD (Create, Read, Update, Delete) operations, covering all aspects from pre-planting preparation to post-management, including soil testing, seed selection, sowing, fertilizing, irrigation, pest control, and harvesting.
功能特性
Features
添加新的生产计划
Add new production plans with detailed fields such as soil testing, seed selection, sowing time, fertilizing methods, irrigation plans, pest control measures, and more.
查看所有计划
View all existing production plans in a tabular format with pagination and sorting options.
编辑现有计划
Edit existing plans by modifying any field and saving the changes.
删除计划
Delete plans that are no longer needed.
前后端分离架构
Separated front-end and back-end architecture with RESTful API support, ensuring scalability and maintainability.
跨域资源共享（CORS）支持
CORS support allows the front-end to interact seamlessly with the back-end from different origins.
技术栈
Technology Stack
后端
Backend:
Spring Boot: 用于快速开发基于Spring框架的应用程序。
Spring Boot: For rapid application development using the Spring framework.
Spring Data JPA: 提供数据持久化功能，简化数据库操作。
Spring Data JPA: For data persistence and simplified database operations.
Spring Web: 提供RESTful API支持，处理HTTP请求和响应。
Spring Web: For RESTful API support and handling HTTP requests and responses.
前端
Frontend:
HTML/CSS: 构建用户界面，提供简洁易用的操作体验。
HTML/CSS: For building the user interface with a user-friendly experience.
JavaScript (AJAX): 实现动态交互，与后端API进行数据交互。
JavaScript (AJAX): For dynamic interactions and data exchange with the backend API.
数据库
Database:
关系型数据库（如MySQL或H2）用于存储生产计划数据。
Relational database (e.g., MySQL or H2) for storing production plan data.
如何运行
How to Run
环境依赖
Prerequisites
Java Development Kit (JDK) 1.8 或更高版本
Java Development Kit (JDK) 1.8 or higher
Maven: 用于项目构建和依赖管理
Maven: For project building and dependency management
数据库（推荐MySQL）
Database (MySQL recommended)
代码结构
Code Structure
src/main/java/org/productionplan: 包含所有Java代码，包括实体类、控制器、服务层和仓库。
Contains all Java code, including entity classes, controllers, services, and repositories.
src/main/resources/static: 存放前端HTML、CSS和JavaScript文件。
Stores front-end HTML, CSS, and JavaScript files.
src/main/resources/templates: 如果使用Thymeleaf模板引擎，可以存放模板文件。
Stores template files if using Thymeleaf.
src/main/resources/application.properties: 配置文件，用于设置数据库连接、服务器端口等。
Configuration file for database connection, server port, etc.
