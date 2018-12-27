# AUTHOR: SAMIR SHAIK : samir.shaik@zenmonics.com

# Simple Web
This is a simple web project which could be used to to perform a quick tests on Docker containers.

## Create a war artifact
- mvn clean package

## Build a new Docker image
- Open a command prompt at the root of the project where Dockerfile is located and run the following command: `docker build -t simple-web:1.0 .`

## Create a Docker containers (without volume mapping standalone-openshift.xml)
- docker run -d --name simple-web -p 8080:8080 simple-web:1.0

## Create a Docker containers (volume mapping standalone-openshift.xml)
- docker run -d --name simple-web -p 8080:8080 -v `<root-of-the-project>`\configuration\standalone-openshift.xml:/opt/eap/standalone/configuration/standalone-openshift.xml simple-web:1.0

## Access the application
- This servlet only logs DEBUG, INFO, WARN, ERROR and TRACE logs. After changing the log level you can view the application logs on the container to see if the log level has changed.
	http://localhost:8080/simple-web/hello-world

## Change log level while the container is actively running
- COMMAND: docker exec -it simple-web /bin/bash`
- COMMAND: cd /opt/eap/bin
- COMMAND: ./jboss-cli.sh
- COMMAND: connect
- COMMAND: /subsystem=logging/console-handler=CONSOLE/:write-attribute(name=level,value=DEBUG)
- COMMAND: /subsystem=logging/root-logger=ROOT/:write-attribute(name=level,value=DEBUG)
- Invoke the application 
- COMMAND: docker logs simple-web
	
## Few Docker commands
- View all the images: `docker image ls`
- View the actively running containers: `docker ps` or `docker container ls`
- View all the running/stopped containers: `docker container ls -a`
- Remove a stopped container: `docker rm <container-id>`
- Stop a running container: `docker stop <container-id>`
- Remove a actively running container: `docker rm -f <container-id>`
- SSH into a running container: `docker exec -it <container-id>/<container-name> /bin/bash`
- View the application logs in the running container: `docker logs <container-id>/<container-name>`
