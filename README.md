# Learn Spring Framework
![](https://img.shields.io/badge/Spring-v5.3.24-grey?style=flat-square&logo=spring&labelColor=green&logoColor=white)
![](https://img.shields.io/badge/License-MIT-grey?style=flat-square&logo=license&labelColor=blue&logoColor=white)

## Introduction
This branch is to demonstrate how to use the `@PostConstruct` annotation to instruct Spring
executes after the bean creation.

## Instruction
1. Add `javax.annotation-api` dependency.
https://github.com/ronthl/learn-spring-framework/blob/981ac92922e492a87f4aadb5f8e163c35a41e2a2/pom.xml#L23-L27
2. Using `@PostConstruct` in the `Parrot` class to instruct spring call the `init` method after creating a bean
for the `Parrot` class.
https://github.com/ronthl/learn-spring-framework/blob/dd42b93970e9f7f10ea884928c1c9bcc7e5f9779/src/main/java/main/Parrot.java#L12-L15
3. Run the `main` method in the `Main` class, you'll see the Parrot will have the name `Kiki`.

## Notes
Spring only supports `javax.annotation-api` (annotation-api v1).
And it does not support `jakarta.annotation-api` (annotation-api v2)
even the annotation-api v1 is archived.