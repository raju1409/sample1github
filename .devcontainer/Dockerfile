# .devcontainer/Dockerfile
FROM mcr.microsoft.com/vscode/devcontainers/java:11

# Install Tomcat
RUN curl -SL https://archive.apache.org/dist/tomcat/tomcat-9/v9.0.52/bin/apache-tomcat-9.0.52.tar.gz | tar -xz --strip-components=1 -C /usr/local/tomcat

# Copy your JSP files to Tomcat's webapps folder
COPY ./src/main/webapp /usr/local/tomcat/webapps/ROOT
