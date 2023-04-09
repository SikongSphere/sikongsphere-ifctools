## SikongSphere-IfcTools 0.2.0-beta

### New Features

- Added the ability to convert IFC files to IFCJSON files and convert IFCJSON to IFC file

- Added experimental API

  ```mermaid
  classDiagram
  class SikongSphereSession {
  	-IfcClassContainer classContainer
  	-SikongSphereSession()
  	+SikongSphereSession getOrCreate()
  	+Convertor convert()
  	+Creator create()
  	+Query query()
  }
  
  class Convertor~T~ {
  	<<Interface>>
  	+T readFile(String path)
  	+void writeFile(T entity, String path)
  }
  
  class AbstractConvertor~T~ {
  	+Convertor convert(Class clazz)
  }
  
  class IfcModelConvertor {
  	+IfcModel readIfcFile(String path)
  	+void writeIfcFile(IfcModel path)
  	+IfcModel readJson(String json)
  	+String writeJson(IfcModel model)
  	+void writeJsonFile(IfcModel model, String path)
  }
  
  class CityGMLConvertor {
  	
  }
  
  class Creator {
  	<<Interface>>
  }
  
  class AbstractCreator {
  	
  }
  
  class Query~T,E~ {
  	+List<E> selectByClass(T model, Class clazz)
  }
  
  class AbstractQuery {
  	
  }
  
  Convertor <|.. AbstractConvertor
  Creator <|.. AbstractCreator
  Query <|.. AbstractQuery
  AbstractConvertor <|-- IfcModelConvertor
  AbstractConvertor <|-- CityGMLConvertor
  AbstractQuery <|-- IfcModelQuery
  AbstractQuery <|-- CityGMLQuery
  ```

- Added experimental graph API

- Added several Query API

  - filter by class name
  - filter by class instance
  - filter equal step number
  - filter less than step number
  - filter greater than step number

### Fix Bugs

- Fixed an issue where backslashes in strings could not be parsed
- Fixed scientific notation parsing bug