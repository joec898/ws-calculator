# ws-calculator

A simple soap web service with client consumer using JAX-WS with 
https://mvnrepository.com/artifact/com.sun.xml.ws/rt

bootstrapped from: 
https://www.youtube.com/watch?v=k6sBPJYUQd8

Steps:

1) create a simple maven project

2) add a maven module -- service

3) add a maven module -- client

  -- using Web Service/Web Service Client to import wsdl in Eclipse, or
  
  -- open cmd from Show in/System Explorer in Eclipse, to run:
     wsimport -p client -keep http://localhost:8888/cal?wsdl
	

Java Compiler is set at 1.8