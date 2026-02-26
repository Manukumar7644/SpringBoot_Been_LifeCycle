# SpringBoot_Been_LifeCycle

**The life cycle of a bean in the Spring Framework refers to the series of steps and methods that a bean goes through from its instantiation to its eventual destruction. This life cycle is managed by the Spring container, which is responsible for creating, configuring, and destroying beans according to the defined bean scope (singleton, prototype, etc.).

Bean Life Cycle Stages

Instantiation: The Spring container starts and creates an instance of the bean as per the request.

Dependency Injection: Dependencies are injected into the bean.

Initialization: Custom initialization logic can be executed using various methods.

Usage: The bean is ready for use.

Destruction: The bean is destroyed when the Spring container is closed.**

Implementing Bean Life Cycle

Using XML Configuration

You can define custom initialization and destruction methods in the Spring XML configuration file.
***
<beans>
   <bean id="hw" class="beans.HelloWorld" init-method="init" destroy-method="destroy"/>
</beans>
