（注：Spring MVC框架是Spring框架的Web框架部分。Spring框架是一个全栈框架，展示层的SpringMVC、业务层的Spring、持久层的SpringData）
Spring MVC中的M、V、C分别代表数据模型、视图、控制器。

Spring MVC运行原理：
1.客户端（浏览器）发送请求至DispatcherServlet；

2.DispatcherServlet通过使用HandlerMapping定位到需要使用的具体Controller；

3.DispatcherServlet将请求交由Controller来处理（Controller会去调用由程序员暴露出来的Service接口）；

4.Controller调用相应的逻辑处理后，返回ModelAndView（数据和视图）给DispatcherServlet；

5.DispatcherServlet查询ViewResolver视图解析器，找到ModelAndView指定的视图；

6.将ModelAndView中的数据（Model）绑定到对应的View中，并渲染给用户。