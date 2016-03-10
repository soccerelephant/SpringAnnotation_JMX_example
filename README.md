# SpringAnnotation_JMX_example

 @ManagedResource is used to annotate a POJO as a MBean.
 @ManagedAttribute i used to expose a property getter and setter.
 
 How to instrument MBean:
 
 Fire up a Java Visual VM from ...\java\jdk1.8.0_25\bin\jvisualvm.exe, then
 from menu Tools/Plugins, install VisualVM-JConsole and VisualVM-MBeans, After
 that, MBeans are visible after server is started. From MBeans tab,
 MBeans->Soccer->JMX->metrics should display attributes of MBean.
