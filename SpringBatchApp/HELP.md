# Read Me First
The following was discovered as part of building this project:

* The original package name 'io.changsoft.batch.spring-batch-app' is invalid and this project uses 'io.changsoft.batch.springbatchapp' instead.

# Building the application

## Compile the application
You need to clean the target directory and compile the application. 
To do this run:

`./mvnw clean install`

## Create an application image
Create an image based on the containerisation technology you are using.
> Either podman or docker

An image can be created by running the command below in the root of the project:

`podman build .`
