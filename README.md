# Lean Spring Framework
![](https://img.shields.io/badge/Spring-v5.3.24-grey?style=flat-square&logo=spring&labelColor=green&logoColor=white)
![](https://img.shields.io/badge/License-MIT-grey?style=flat-square&logo=license&labelColor=blue&logoColor=white)

## Introduction
This branch is to demonstrate how to add a bean programmatically to the Spring context.
To do that, we use the `registerBean()` method of the `ApplicationContext` instance.

**Note**: This approach is only available in Spring 5 and later.

## Instruction
1. Create an instance of a class you want to add to the Spring context
   https://github.com/ronthl/learn-spring-framework/blob/0578c411187a72afa097bc918f34231d91a320c5/src/main/java/main/Main.java#L13-L14
2. Add the instance to the Spring context with the `registerBean()` method
   https://github.com/ronthl/learn-spring-framework/blob/0578c411187a72afa097bc918f34231d91a320c5/src/main/java/main/Main.java#L16-L17
3. Get the bean from the Spring context
   https://github.com/ronthl/learn-spring-framework/blob/0578c411187a72afa097bc918f34231d91a320c5/src/main/java/main/Main.java#L31-L32
4. You can also add a instance to the Spring context as a primary bean.
   https://github.com/ronthl/learn-spring-framework/blob/0578c411187a72afa097bc918f34231d91a320c5/src/main/java/main/Main.java#L19-L28
