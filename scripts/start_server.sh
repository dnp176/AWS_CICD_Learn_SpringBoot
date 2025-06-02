#!/bin/bash

echo "=== Starting application ==="

# Ensure WAR file exists
if [ -f /home/ubuntu/deployments/app.war ]; then
  nohup java -jar /home/ubuntu/deployments/app.war > /home/ubuntu/deployments/app.log 2>&1 &
  echo "Application started."
else
  echo "WAR file not found. Deployment failed."
  exit 1
fi
