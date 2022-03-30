= forbiddenapis-playground

Playground to test the behavior of https://github.com/policeman-tools/forbidden-apis

== How to build

Running the build with your default JDK:

```shell
mvn clean install
```

Running the build with your default JDK,
but compiling tests into JDK 17 bytecode and running tests with JDK 17:

```shell
mvn clean install -Djdk17.java-home.path=<path to JDK 17>
```