# ifcJSON 规范

以下是 `ifcJSON` 的总体规范。

## 目录

-  <a href="#intro">一、概述</a>
   - [1.1 目标](#objectives)
   - [1.2 发展战略](#strategy)
-  [二、ifcJSON 文档规范](#spec)
  - <a href="#key">2.1 必需的对象、键或实体</a>
  - <a href="#value">2.2 空值、'userdefined' 值和'notdefined' 值</a>
  - <a href="#header">2.3 表头</a>
  - <a href="#identifier">2.4 标识符</a>
  - <a href="#tree">2.5 树结构</a>
  - <a href="#name">2.6 camelCase、CamelCaps 或 snake_case名命名方式</a>
  - <a href="#extension">2.7 PredefinedTypes和ObjectTypes and Types</a>
  - <a href="#geom">2.8 几何</a>
  - <a href="#attr">2.9 属性和属性集</a>

- <a href="#schema">三、ifcJSON模式</a>

- <a href="#more">四、更多信息</a>

## <span id="intro">一、概述</span>

### <span id="objectives">1.1 目标</span>

`JSON`是世界通用的数据交换及使用的格式。因此，对于建筑数据格式`IFC`来说，也需要支持`JSON`格式。

`IFCJSON `主要旨在解决`IFC `的以下问题：

1. 许多开发人员以前从未见过或使用过`EXPRESS `或 `STP `实例文件，如果使用这些文件，将会额外增加数据提取的工作量。
2. `IFC`实例集通常作为文件进行交换，这与大多数设计、施工项目和产品中看到的相连接的、分布式的和快速变化的数据不一致。

实际上，我们可以遵循多种策略从而产生不同类型的 `JSON`。但本文档旨在为 `IFC` 推荐一种统一的的`JSON`规范。

### <span id="strategy">1.2 发展战略</span>

`IFC`格式转`JSON`格式的时候可以遵循以下多种标准：

1. 向下兼容性
2. 相互转换
3. 可读性强
4. 灵活性和可扩展性
5. 与代码集成、交互
6. 与`xml`格式相似
7. 与`EXPRESS`模式相似
8. 清晰的引用关系（平坦的或嵌套的）

但实际上，我们无法在同一时刻支持所有标准，我们必须做出选择，或者产生多种风格的`JSON`文件。在本文档中，我们为`IFC`文件仅提供一种统一的`JSON`转换格式。

其仅遵循以下标准：

1. 向下兼容性
2. 相互转换
3. 与`EXPRESS`模式相似

以下标准没那么重要，因此被排除在外。此 ifcJSON 版本首先尝试包含原始 IFC EXPRESS 模式中存在的所有内容。

因此不遵循以下标准：

1. 可读性强
2. 与代码集成
3. 清晰的引用结构
4. 直接可用性

## <span id="spec">二、ifcJSON文档规范</span>

下文为 ifcJSON 提供了更详细的规范。我们在此不提供完整的架构，而是列出一些一般性原则。

### <span id="key">2.1 必需的对象、键或实体</span>

部分元素在IFC EXPRESS Schema 中是必要的，但在 IFC4 JSON中不必要，从而允许更容易和更精准的数据交换（格式转换transactional data exchange）。您可以使用任何免费提供的验证器来检查 JSON 文件是否针对 IFC 的此 JSON 模式有效。

### <span id="value">2.2 空值、userdefined 值和notdefined值</span>

您可以自由地使用空值，但最好不要用其进行数据交换。`NOTDEFINED`、`USERDEFINED`的Enum 元素是可维护并可用的。

以下格式合理：

```json
{
    "type" : "IfcDoor",
    "globalId" : "157c866c-9c08-4348-a0ed-4d57cd66c9e2",
    "name" : "A common door",
    "description": "",
    "overallHeight" : null,
    "overallWidth" : null,
    "predefinedType": "NOTDEFINED"
}
```

以下格式可用，去除空值更优：

```json
{
    "type" : "IfcDoor",
	"globalId" : "157c866c-9c08-4348-a0ed-4d57cd66c9e2",
	"name" : "A common door"
}
```

建议这样做：

```json
{
    "type" : "IfcDoor",
    "globalId" : "157c866c-9c08-4348-a0ed-4d57cd66c9e2",
    "name" : "A common door",
    "description" : "Description of a standard door",
    "overallHeight" : 1.4,
    "overallWidth" : 0.7,
    "predefinedType" : "GATE"
}
```

### <span id="header">2.3 文件头</span>

文件头包含在 IFCJSON 文件中，是 SPF 文件中第一部分的直接翻译。

### <span id="identifier">2.4 标识符</span>

每一个实体都有全局唯一标识符（globalID）表示，UUID 含义详见https://tools.ietf.org/html/rfc4122 。尽管 globalId 属性仅适用于 EXPRESS 模式中 IfcRoot 实体的子类，但我们鼓励更广泛地使用此 globalId，以便在 JSON 文件中支持实体之间的引用。

```json
{
    "globalId": "028c968f-687d-484e-9c0a-5048a923b8c4"
}
```

通过使用 globalId 属性，能够引用JSON 中的实体对象。在下面的示例中，引用了具有 globalId（`6d7919fd-2c83-497b-b21c-d4209e5162bf`） 的 ownerHistory 对象。

```json
{
    "type" : "IfcRelContainedInSpatialStructure",
    "globalId" : "98fa75b8-371d-412a-be42-2326c68dfcf5",
    "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
    "name" : "Default Building",
    "description" : "Contents of Building Storey"
}
```

### <span id="tree">2.5 树结构</span>

通常，ifcJSON 结构是灵活的。对象可以多级嵌套，或通过引用 globalId 。建议尽可能使用树形结构(forward downward relationships)以提高可读性。IFC 中的所有对象都是可维护的，包括对象化关系（多对多、一对多等）。

示例：

```json
{
  "type" : "IfcProject",
  "globalId" : "22e66ddf-794d-40bb-8aa5-3dda450d8255",
  "name" : "Default Project",
  "description" : "Description of Default Project",
  "isDecomposedBy" : {
    "type" : "IfcRelAggregates",
    "globalId" : "57bfe2d2-b505-4bba-8278-f867834a0be0",
    "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
    "name" : "ProjectContainer",
    "description" : "ProjectContainer for Sites",
    "relatedObjects" : [ {
      "type" : "IfcSite",
      "globalId" : "f55eaf97-145e-4431-b2f3-69f9634f244b",
      "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
      "name" : "TU/e campus",
      "description" : "The High Tech campus of the Eindhoven University of Technology",
      "isDecomposedBy" : {
        "type" : "IfcRelAggregates",
        "globalId" : "d3e2bc1a-4cdb-49ed-9c4a-c60c97949121",
        "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
        "name" : "SiteContainer",
        "description" : "SiteContainer For Buildings",
        "relatedObjects" : [ {
          "type" : "IfcBuilding",
          "globalId" : "3ca7e585-4e3e-4969-a86f-f049f4fbde52",
          "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
          "name" : "Vertigo Building",
          "description" : "TU/e Department of the Built Environment"
        } ]
      }
    } ]
  }
}
```

### <span id="name">2.6 camelCase、CamelCaps 或 snake_case</span>

JSON 中最常用的表示法是驼峰式命名法，主要是为了使它与 JavaScript 和 Python 保持一致。因此，IFC 的 JSON 版本尽可能使用驼峰命名法。

以下命名方式有效：

```json
{
    "globalId": "028c968f-687d-484e-9c0a-5048a923b8c4"
}
```

以下命名方式无效：

```json
{
    "GlobalId": "028c968f-687d-484e-9c0a-5048a923b8c4"
	"global_id": "028c968f-687d-484e-9c0a-5048a923b8c4"
}
```

### <span id="extension">2.7 PredefinedTypes和ObjectTypes and Types</span>

在 `IFC EXPRESS `模式中定义对象的类型有多种方法。在 `ifcJSON` 中，遵循与原始 `IFC`模式相同的结构，可在`type`,`predefinedType`和`objectType`属性中包含类型信息。如` ifcJSON`模式中所示，`type`和`objectType`属性指的是一个字符串。`type`特此为` IFC`类型名称保留该属性；`predefinedType`属性仅适用于部分对象，并且该属性的允许值列在` ifcJSON` 模式（与` EXPRESS`模式相同）中。这些` predefinedType`值不需要用点括起来（即：不能写为 `".GATE."`，而只应是`"GATE"`）。

以下格式可用：

```json
{
    "type" : "IfcDoor",
    "globalId" : "157c866c-9c08-4348-a0ed-4d57cd66c9e2",
    "name" : "A common door",
    "description" : "Description of a standard door",
    "overallHeight" : 1.4,
    "overallWidth" : 0.7,
    "predefinedType" : "GATE"
}
```

以下格式有效，并允许使用用户定义的子类型：

```json
{
    "type" : "IfcDoor",
    "globalId" : "157c866c-9c08-4348-a0ed-4d57cd66c9e2",
    "name" : "A less common door",
    "description" : "Description of a standard door",
    "objectType" : "ThickMassiveWoodenDoor",
    "overallHeight" : 1.4,
    "overallWidth" : 0.7,
    "predefinedType" : "USERDEFINED"
}
```

### <span id="geom">2.8 几何</span>

几何数据的表达方式与它在` STEP `文件中的表达方式相似，因此允许包含表示数据和单位以及几何属性。

例：

```json
"representation" : {
  "type" : "IfcProductDefinitionShape",
  "representations" : [ {
    "type" : "IfcShapeRepresentation",
    "contextOfItems" : "e4c36548-94c3-4939-930f-94899539746b",
    "representationIdentifier" : "Body",
    "representationType" : "SweptSolid",
    "items" : [ {
      "type" : "IfcExtrudedAreaSolid",
      "sweptArea" : {
        "type" : "IfcArbitraryClosedProfileDef",
        "profileType" : "AREA",
        "outerCurve" : {
          "type" : "IfcPolyline",
          "points" : [ 
            {
              "type" : "IfcCartesianPoint",
              "coordinates" : [ 0.0, 0.0 ]
            }, {
              "type" : "IfcCartesianPoint",
              "coordinates" : [ 0.0, 0.1 ]
            }, {
              "type" : "IfcCartesianPoint",
              "coordinates" : [ 0.75, 0.1 ]
            }, {
              "type" : "IfcCartesianPoint",
              "coordinates" : [ 0.75, 0.0 ]
            }, {
              "type" : "IfcCartesianPoint",
              "coordinates" : [ 0.0, 0.0 ]
            } ]
        }
      },
      "position" : { ... },
      "extrudedDirection" : {
        "type" : "IfcDirection",
        "directionRatios" : [ 0.0, 0.0, 1.0 ]
      },
      "depth" : 2.1
    } ]
  } ]
}
```

### <span id="attr">2.9 属性和属性集</span>

在 ifcJSON 中，属性和属性集的包含方式与它们在 IFC EXPRESS 模式中的包含方式相同。

例子：

```json
{
    "type" : "IfcWall",
    "globalId" : "f92c2898-fd68-44ef-9178-3348e340017b",
    "isDefinedBy" : [ {
      "type" : "IfcRelDefinesByProperties",
      "globalId" : "d2ecfe17-45be-4b36-959d-1be3ec8193bd",
      "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
      "relatingPropertyDefinition" : {
        "globalId" : "486f7679-1a8a-4deb-8798-5a7e0c8c7d51",
        "ownerHistory" : "6d7919fd-2c83-497b-b21c-d4209e5162bf",
        "name" : "Pset_WallCommon",
        "hasProperties" : [ 
          {
            "type" : "IfcPropertySingleValue",
            "name" : "IsExternal",
            "description" : "IsExternal",
            "nominalValue" : {
              "type" : "IfcBoolean",
              "booleanValue" : true
            }
          }, {
            "type" : "IfcPropertySingleValue",
            "name" : "Reference",
            "description" : "Reference",
            "nominalValue" : {
              "type" : "IfcText",
              "stringValue" : "insert URL"
            }
          }
        ]
      }
    }]
}
```

## <span id="schema">三、ifcJSON schema</span>

与 IFC 的 XSD 模式规范和 OWL 本体一样，ifcJSON 模式也可以从 IFC 模式的 EXPRESS（ISO 10303 第 1 部分）自动转换。从 IFC-SPF 文件到 JSON 的往返转换也是可能的。架构和数据转换（尚）不可用。然而，此存储库中提供了一个 ifcJSON 模式，并允许验证哪个 ifcJSON 有效。

ifcJSON schema 定义了需要 ifcJSON 数据的结构，因此它的 schema 定义了 ifcJSON 数据的验证和交互控制。

示例 ifcJSON 数据：

```json
{
  "type": "IfcWall",
  "globalId": "028c968f-687d-484e-9c0a-5048a923b8c4",
  "name": "my wall",
  "description": "Description of the wall",
  "objectPlacement": null,
  "objectType": "null",
  "representation": null,
  "tag": "267108",
  "ownerHistory": null,
  "predefinedType": "SOLIDWALL"
}
```

对应的 ifcJSON Schema 片段：

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "$id": "http://example.com/product.schema.json",
  "title": "Wall",
  "description": "ifcJSON for Wall",
  "type": "object",
  "properties": {
  "type": "ifcWall",
  "globalId": {
    "type": "string",
    "maxLength": 22
  },
  "ownerHistory": {"oneOf":[
    {"type": "null"},
    {
	  "type": "object",
      "allOf": [{ "$ref": "#/properties/ifcOwnerHistory"}]
    }]
  },
  "name":{"oneOf":[
    {"type": "null"},
    {
	  "type": "string",
      "maxLength": 255
	}]
  },
  "description": {
    "type" : ["string", "null"]
  },
  "objectType": {"oneOf":[
    {"type": "null"},
    {
	  "type": "string",
      "maxLength": 255
	}]
  },
  "objectPlacement": {"oneOf":[
    {"type": "null" },
    {
	  "type": "object",
      "allOf": [{ "$ref": "#/properties/ifcLocalPlacement" }]
    }]
  },
  "representation": { 
    "type": "object",
    "allOf": [{ "$ref": "#/properties/ifcProductDefinitionShape" }]
  },
  "tag": {
    "type": "string",
    "maxLength": 255
  },
  "predefinedType": {
    "oneOf":[
      { "type": "null" },
      { "type": "string",
        "enum": ["MOVABLE",
          "PARAPET",
          "PARTITIONING",
          "PLUMBINGWALL",
          "SHEAR",
          "SOLIDWALL",
          "STANDARD",
          "POLYGONAL",
          "ELEMENTEDWALL",
          "USERDEFINED",
          "NOTDEFINED"]},
     ]
  }
}
```

## <span id="more">四、更多信息</span>

欢迎以各种可能的方式做出贡献。