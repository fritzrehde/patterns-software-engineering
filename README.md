# Patterns in Software Engineering

This repo contains Java code examples for the [`Patterns in Software Engineering`](https://ase.in.tum.de/lehrstuhl_1/teaching/1206-pse-ws22) (WS 22/23) university course at TUM.
These examples were created in preparation for the exam (which mainly featured programming exercises involving these patterns).


## Design Patterns

Name | Description
:-- | :--
[Composite Pattern](composite-pattern) | recursive nesting of children; allow arbitrary depth
[Facade Pattern](facade-pattern) | no spaghetti design, reduce coupling
[Bridge Pattern](bridge-pattern) | delay binding of interface to subclass to startup time
[Proxy Pattern](proxy-pattern) | instantiation expensive => delay until used, access expensive => "smaller" local object
[Adapter Pattern](adapter-pattern) | connects incompatible parts (wrapper)
[Observer Pattern](observer-pattern) | decouples subject from observer
[Strategy Pattern](strategy-pattern) | switch between algorithms at runtime based on context and policy
[State Pattern](state-pattern) | prevent large switch statements
[Template Method Pattern](template-method-pattern) | prevent duplicate/reused code
[Command Pattern](command-pattern) | map commands onto menu structure
[Mediator Pattern](mediator-pattern) | reduce dependencies/communication between/decouple objects
[Factory Pattern](factory-pattern) | low coupling high cohesion, defer instantiation to subclasses
[Abstract Factory Pattern](abstract-factory-pattern) | customized factory with less if statements
[Flyweight Pattern](flyweight-pattern) | share immutable expensive objects
[Builder Pattern](builder-pattern) | seperate construction of elements of complex aggregate


## Testing Patterns

Name | Description
:-- | :--
[Reflection Testing](reflection-testing) | allows inspection of runtime attributes of classes, interfaces, fields and methods
[Mock Object Pattern with EasyMock](mock-object-easymock) | mocked objects simulate the behaviour of real objects; [EasyMock](https://easymock.org) is an older, simpler mocking library
[Mock Object Pattern with Mockito](mock-object-mockito) | [Mockito](https://site.mockito.org) is a more feature-rich fork of EasyMock
[Dependency Injection with Guice](dependency-injection-guice) | the binding of subclasses to an interface is performed by the dependency injection framework; [Guice](https://github.com/google/guice) manages dependencies using a special class called a Module
[Dependency Injection with Spring](dependency-injection-spring) | [Spring](https://spring.io/projects/spring-framework) uses the concept of inversion of control to inject dependencies
