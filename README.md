# SpringAnnotation_JMX_example

 @ManagedResource is used to annotate a POJO as a MBean.
 @ManagedAttribute i used to expose a property getter and setter.
 
 How to instrument MBean:
 
 Fire up a Java Visual VM from ...\java\jdk1.8.0_25\bin\jvisualvm.exe, then
 from menu Tools/Plugins, install VisualVM-JConsole and VisualVM-MBeans, After
 that, MBeans are visible after server is started. From MBeans tab,
 MBeans->Soccer->JMX->metrics should display attributes of MBean.
 
 
 How to view MBean attributes through rest API:
 
 endpoint  of   http://localhost:8080/manager/jmxproxy/    will display attributes as JSON.
 
 
 How to configure Tomcat to instrument MBean:
 
 Create a setenv.bat (on Windows) or setenv.sh (on *nix) in Tomcat bin
 directory. Add this line in the setenv file:
 
 export CATALINA_OPTS="-Dcom.sun.management.jmxremote.port=8090 -Dcom.sun.management.jmxremote.authenticate=false    -Dcom.sun.management.jmxremote.ssl=false"
 
 In tomcat-users.xml, add jmx role:
 
 ```html
 <role rolename="manager-gui"/>
 <role rolename="manager-jmx"/>
 <user username="tomcat" password="tomcat" roles="manager-gui,manager-jmx"/>
 ```
 
 This article is a good reference:
 
 http://mrkimi01.blogspot.com/2014/03/jmx-tomcat-and-visualvm.html
