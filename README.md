当前所学记录  
* java.net.URL类,可以获取网站地址的html,jsp文件.  
* java.rmi.Remote类,实现远程代理模式.  
  * 遇到的问题:  
    - [x]端口注册问题
    ```java
    java.rmi.ConnectException: Connection refused to host: localhost; nested exception is: 
    ...
    ```
    * 一定要执行过这条语句
    ```java
    LocateRegistry.createRegistry(1099);
    ```
