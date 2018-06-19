Camel Web Application with Rest Web Service

Routes:

    1. Rest API

        i.  GET - /CamelWebAppWithRestService/cxf/sample/rest/order/{orderNo}
        
        ii. PUT - /CamelWebAppWithRestService/cxf/sample/rest/order

    2. Timer Route - A Timer is triggered for every 10 seconds

    3. Servlet Route - /CamelWebAppWithRestService/camel/hello

Notes : 

    1. Add spring web context listener to start spring container

    2. Add CXF Servlet and corresponding servlet mapping to expose web service 

    3. Add camel-context xml as contextconfiglocation param

    4. Add log configuration and dependency