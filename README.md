# 将公共组件抽离，方便其它项目引用和维护，github和gitee同步更新

1、cloud-commons-base 常用底层基础类封装

2、cloud-commons-pay 支付、公众号相关工具类以及bean

3、cloud-commons-utils 常用底层工具类类封装

# 依赖方式

1、项目主工程增加 oss.sonatype 远程maven
~~~
<distributionManagement>
  <repository>
    <id>sonatype-releases</id>
    <name>sonatype repository</name>
    <url>https://oss.sonatype.org/service/local/staging/deploy/maven2</url>
  </repository>
  <snapshotRepository>
    <id>sonatype-snapshots</id>
    <name>Nexus Snapshot Repository</name>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
  </snapshotRepository>
</distributionManagement>

<repositories>
  <repository>
    <id>oss-snapshots</id>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
      <enabled>false</enabled>
    </releases>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
~~~

2、版本号查看[https://oss.sonatype.org/content/repositories/snapshots/com/github/liuweijw/commons/](https://oss.sonatype.org/content/repositories/snapshots/com/github/liuweijw/commons/)

3、项目工程依赖
~~~
<dependency>
  <groupId>com.github.liuweijw.commons</groupId>
  <artifactId>cloud-commons-utils</artifactId>
  <version>${cloud-commons.version}</version>
</dependency>
<dependency>
  <groupId>com.github.liuweijw.commons</groupId>
  <artifactId>cloud-commons-base</artifactId>
  <version>${cloud-commons.version}</version>
</dependency>
<dependency>
  <groupId>com.github.liuweijw.commons</groupId>
  <artifactId>cloud-commons-pay</artifactId>
  <version>${cloud-commons.version}</version>
</dependency>
~~~
