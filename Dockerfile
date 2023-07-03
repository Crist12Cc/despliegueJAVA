FROM quay.io/wildfly/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh ele1990 Root1234.$ --silent
EXPOSE 8080
EXPOSE 9990
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]