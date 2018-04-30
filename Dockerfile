FROM airhacks/wildfly
ADD target/api.war ${DEPLOYMENT_DIR}
