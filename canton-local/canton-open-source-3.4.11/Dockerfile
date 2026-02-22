FROM eclipse-temurin:17-jre

WORKDIR /opt/canton

# Copy Canton distribution
COPY . /opt/canton

# Make scripts executable
RUN chmod +x /opt/canton/bin/canton

EXPOSE 6865

ENTRYPOINT ["/opt/canton/bin/canton"]