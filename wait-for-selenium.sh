#!/bin/sh

echo "⏳ Waiting for Selenium Grid to be ready..."

until curl -s http://selenium-hub:4444/status | grep -q '"ready": true'; do
  echo "Selenium Grid is not ready yet, retrying in 2 seconds..."
  sleep 2
done

echo "✅ Selenium is ready. Starting tests..."
exec java -cp app.jar org.testng.TestNG testng.xml