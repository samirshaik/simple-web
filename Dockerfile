FROM registry.access.redhat.com/jboss-eap-7/eap70-openshift:latest

LABEL "Maintainer"="Zenmonics Inc." 
LABEL "Version"="1.0.0" 
LABEL "Description"="Connect-External"

### Set Environment
ENV JBOSS_HOME /opt/eap


### Open Ports
EXPOSE 8080 9990 9999

### Start EAP
ENTRYPOINT $JBOSS_HOME/bin/openshift-launch.sh

# deploy app
ADD target/simple-web-1.0.0-SNAPSHOT.war $JBOSS_HOME/standalone/deployments/simple-web.war

CMD /bin/bash
