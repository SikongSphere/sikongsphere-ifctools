# sikongsphere-ifctools

[![2022-10-08-14-44-44.png](https://i.postimg.cc/zf58kGVg/2022-10-08-14-44-44.png)](https://postimg.cc/tsrKqydq)

## 概述

SikongSphere-ifctools旨在构建基于工业基础类（Industry Foundation Class，简称IFC）标准的建筑信息模型开源生态。它关注如何对IFC标准进行实现和功能接口的扩展，扮演了核心工具库的角色，而非某一种具体数据产品。

标准、多样性、业务友好性是SikongSphere-ifctools的核心理念。

- 标准：作为建筑行业内BIM标准的参编单位，SikongSphere将遵循行业标准来进行代码实现。同样，sikongsphere-ifctools作为Sikongsphere的核心工具库，也会严格遵循国际标准，兼容现有的技术生态。
- 多样性：本项目提供了大量的接口，其中会支持例如文件解析、文件格式转换、建筑模型生成、数据模型的序列化反序列化、压缩解压以及加密等多种功能，涵盖了数据产品需要用到的方方面面的功能。
- 业务友好性：本项目的功能接口在设计时，在设计思想层面上，会兼容装配式建筑的建筑和管理模式，而不是完全照搬现有的纯软件设计的思路。一方面会方便用户理解其中逻辑，另一方面也会优化BIM数据管理逻辑。

#### 介绍

Sikongsphere-ifctools是司空学社组织的开源项目，是国内第一个完全实现IFC标准的开源核心模型库。该项目的定位为基于Java语言的IFC（industry foundation class）开源实现，并涵盖了相关工具包，旨在为建筑模型的信息化夯实基础。关于IFC的信息，可参阅[buildingsmart官网](https://www.buildingsmart.org/)。

#### 架构

从架构上，可以分为三层：Model层、扩展层和SDK层

- Model层：负责所有IFC标准的具体实现

- SDK层：负责与用户进行交互

- 扩展层：一些扩展功能模块

#### 参与贡献🚀🧑‍💻

搭建开发环境和贡献者指南，请参考：

[贡献者](https://gitee.com/sikongsphere/sikongsphere-ifctools/contributors?ref=develop)

#### 状态

Version 0.0.1：已发布🎉

🔗请访问[0.0.1 版本说明 ](https://gitee.com/sikongsphere/sikongsphere-ifctools/wikis/0.0.1%20%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E?sort_id=6433688)获得更详细的信息。

🔜 Version 0.0.2 正在开发中

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request
