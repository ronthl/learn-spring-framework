# Learn Spring Framework
![](https://img.shields.io/badge/Spring-v5.3.24-grey?style=flat-square&logo=spring&labelColor=green&logoColor=white)
![](https://img.shields.io/badge/License-MIT-grey?style=flat-square&logo=license&labelColor=blue&logoColor=white)

## Introduction
This branch is to demonstrate how to use the `@PreDestroy` annotation to instruct Spring
executes before removing beans.

## Instruction
1. Add `javax.annotation-api` dependency.
   https://github.com/ronthl/learn-spring-framework/blob/2e97708e266e63dd2219e840f2f2f711441be22c/pom.xml#L23-L27
2. Using `@PreDestroy` in the `Parrot` class to instruct spring call the `destroy` method
before removing the Parrot bean from the Spring context.
https://github.com/ronthl/learn-spring-framework/blob/2e97708e266e63dd2219e840f2f2f711441be22c/src/main/java/main/Parrot.java#L18-L21
3. Call `removeBeanDefinition` method to remove the Parrot bean.
   https://github.com/ronthl/learn-spring-framework/blob/2e97708e266e63dd2219e840f2f2f711441be22c/src/main/java/main/Main.java#L14
4. Run the `main` method in the `Main` class, you'll see the message:
`Kiki is being destroyed!`

## Notes
### Avoid using `@PreDestroy`
Generally I recommend developers avoid using the `@PreDestroy` annotation
and find a different approach to executing something before Spring clears the context,
mainly because you can expect Spring fail to clear the context.
Say you defined something sensitive (like closing a database connection) in the `@PreDestroy` method;
if Spring doesn't call the method, you may get into big problems.
### Supported `annotation-api` version
Spring only supports `javax.annotation-api` (annotation-api v1).
And it does not support `jakarta.annotation-api` (annotation-api v2)
even the annotation-api v1 is archived.