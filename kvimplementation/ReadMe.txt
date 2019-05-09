Project Name : kvimplentation :
    Provides the implementation of the key value pair over HTTP request.
    
    Project is implemented using JAX-RS Jersey 2.16 impelentation of Restful web service
    JSON is used as the Media Type
    Maven 2.5.1 is used as the build tool
    Apache Tomcat 7.0 is used as the Application Server
    PostMan tool is used to hit and check the response
    
Install :
    1. Directky pull the project from the Github and use TomCat 7.0 As Server.
    
Project Component
    1. Dummy Database Class :
            Instead of providing the Database to store the values, i have used a Dummt Database class which uses HashMap to store the Key Value.
    
    2. Key Value Model Class :
            Model class is just an implementation of a class which has key value data and getters and setters of the key value data.
           
    3. Key Value Service Class :
            Key Value Service class has below implementation metods
            
            getAllMessages() - which returs all the key value pairs
            
            getItem() - which returs the particular key value pair and not all.
            
            addMessage() - which lets user to add set of key value pair
            
            updateMessage() - which lets user to update the key value pair
            
            removeMessage() - to delete a particular set of key value pair
       
    4. Key Value Resource Class :
            Resourcr class will contain the mapping methods using annotations.
