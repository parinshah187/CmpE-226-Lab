CmpE-226-Lab
============

Database Systems assignment using Java, MongoDB and Freemarker template tool to display retail shopping website products. Json file for all the products is also uploaded.

Steps to create database in mongodb:

1. Open mongo shell
2. use cmpe226 // To create database
3. db.adminCommand( { setParameter: true, textSearchEnabled : true}) 
4. db.createCollection("products")
5. db.products.ensureIndex({name : "text", description: "text"})
6. After that insert all the records by the commands written in population_script file.

Steps to run the project:

1. This is a maven project, download and import as a Maven project.
2. Maven-clean it and then maven-install it.
3. Then run the project on server.
4. Enter the URL : http://localhost:8080/CmpE-226-Lab/rest/users/products
5. navigate to different categories and click on any product for see the description and other product-specific attributes.
