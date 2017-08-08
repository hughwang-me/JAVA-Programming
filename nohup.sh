#!/usr/bin/env bash
git pull origin master
mvn clean package
nohup java -jar target/JAVA-Programming.jar &