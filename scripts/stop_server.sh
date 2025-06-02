#!/bin/bash

echo "=== Stopping existing application (if running) ==="
PID=$(ps -ef | grep 'SimpleAWSApp' | grep -v grep | awk '{print $2}')

if [ -z "$PID" ]; then
  echo "No existing application running."
else
  echo "Killing process ID: $PID"
  kill -9 $PID
fi
