
1. Main Maven 프로젝트 생성
```powershell
mvn archetype:generate -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeArtifactId=pom-root -DarchetypeVersion=RELEASE -DgroupId=com.beginsecure -DartifactId=module-xpert -DinteractiveModel=false
```

`mvn archetype:generate`: Maven 프로젝트 생성 명령어 <br/>
`-DarchetypeGroupId=<아카이브 그룹 ID>`: Maven 아카이브의 그룹 ID를 지정. `org.apache.maven.archetypes`, `org.springframework` 등 여러 그룹을 지정할 수 있음<br/>

`-DarchetypeArtifactId=pom-root`: Maven 아카이브의 아티팩트 ID를 지정<br/>

`-DarchetypeVersion=RELEASE`: Maven 아카이브의 버전을 지정<br/>

`-DgroupId=com.beginsecure`: 새로 생성될 프로젝트의 그룹 ID를 지정<br/>

`-DartifactId=<프로젝트이름>`: 새로 생성될 프로젝트의 아티팩트 ID를 지정<br/>

`-DinteractiveModel=false`: 상호작용 모드를 끔으로 설정. 이것은 대화형으로 사용자 입력을 받지 않고 기본값을 사용하여 생성 프로세스를 실행한다는 것을 의미.

2. module Maven Project 생성
```powershell
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-achetype-quickstart -DarchetypeVersion=RELEASE -DgroupId=com.beginsecure -DartifactId=core -Dpackage=com.beginsecure.core -DinteractiveMode=false
```
```powershell
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-achetype-quickstart -DarchetypeVersion=RELEASE -DgroupId=com.beginsecure -DartifactId=api -Dpackage=com.beginsecure.core -DinteractiveMode=false
```
```powershell
mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-achetype-quickstart -DarchetypeVersion=RELEASE -DgroupId=com.beginsecure -DartifactId=batch -Dpackage=com.beginsecure.core -DinteractiveMode=false
```


## 프로젝트 구조
```tree
├─api
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─beginsecure
│  │  │  │          ├─controller
│  │  │  │          └─producer
│  │  │  └─resources
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─beginsecure
│  └─target
│      ├─classes
│      │  └─com
│      │      └─beginsecure
│      │          ├─controller
│      │          └─producer
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      ├─maven-archiver
│      ├─maven-status
│      │  └─maven-compiler-plugin
│      │      ├─compile
│      │      │  └─default-compile
│      │      └─testCompile
│      │          └─default-testCompile
│      ├─surefire-reports
│      └─test-classes
│          └─com
│              └─beginsecure
├─batch
│  ├─src
│  │  ├─main
│  │  │  ├─java
│  │  │  │  └─com
│  │  │  │      └─beginsecure
│  │  │  └─resources
│  │  └─test
│  │      └─java
│  │          └─com
│  │              └─beginsecure
│  └─target
│      ├─classes
│      │  └─com
│      │      └─beginsecure
│      ├─generated-sources
│      │  └─annotations
│      ├─generated-test-sources
│      │  └─test-annotations
│      ├─maven-archiver
│      ├─maven-status
│      │  └─maven-compiler-plugin
│      │      ├─compile
│      │      │  └─default-compile
│      │      └─testCompile
│      │          └─default-testCompile
│      ├─surefire-reports
│      └─test-classes
│          └─com
│              └─beginsecure
└─core
    ├─src
    │  ├─main
    │  │  ├─java
    │  │  │  └─com
    │  │  │      └─beginsecure
    │  │  │          ├─consumer
    │  │  │          └─service
    │  │  └─resources
    │  └─test
    │      └─java
    │          └─com
    │              └─beginsecure
    └─target
        ├─classes
        │  └─com
        │      └─beginsecure
        │          ├─consumer
        │          └─service
        ├─generated-sources
        │  └─annotations
        ├─generated-test-sources
        │  └─test-annotations
        ├─maven-archiver
        ├─maven-status
        │  └─maven-compiler-plugin
        │      ├─compile
        │      │  └─default-compile
        │      └─testCompile
        │          └─default-testCompile
        ├─surefire-reports
        └─test-classes
            └─com
                └─beginsecure
```

## POM.XML 구조
1. Main pom.xml
```XML
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.2.4</version>
		<relativePath />
	</parent>
  <groupId>com.beginsecure</groupId>
  <artifactId>module-xpert</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>pom</packaging>
  <name>module-xpert</name>
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <java.version>17</java.version>
    <maven.compiler.source>${java.version}</maven.compiler.source>
    <maven.compiler.target>${java.version}</maven.compiler.target>
  </properties>

  <modules>
    <module>core</module>
    <module>api</module>
    <module>batch</module>
  </modules>

  <dependencyManagement>
    ...
  </dependencyManagement>

</project>
```

2. module pom.xml<br>
main pom에 설정된 dependency를 module pom에서도 사용한다면 main pom version을 가져가기 때문에 version을 기입하지 않아도 됨
```XML
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <artifactId>module-xpert</artifactId>
    <groupId>com.beginsecure</groupId>
    <version>1.0-SNAPSHOT</version>
  </parent>

  <groupId>com.beginsecure</groupId>
  <artifactId>api</artifactId>
  <version>1.0-SNAPSHOT</version>

  <name>api</name>
  <!-- FIXME change it to the project's website -->
  <url>http://www.example.com</url>

  <dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
  </dependency>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
    </dependency>


    <dependency>
      <groupId>com.fasterxml.jackson.core</groupId>
      <artifactId>jackson-databind</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.kafka</groupId>
      <artifactId>spring-kafka</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <scope>provided</scope>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-jdbc</artifactId>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
    </dependency>
  </dependencies>

  <build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to
      parent pom) -->
      <plugins>
        <!-- clean lifecycle, see
        https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see
        https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.3.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
        <!-- site lifecycle, see
        https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
        <plugin>
          <artifactId>maven-site-plugin</artifactId>
          <version>3.7.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-project-info-reports-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>
```