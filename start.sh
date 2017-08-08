#!/usr/bin/env bash
git pull origin master
mvn clean package
java -jar target/JAVA-Programming.jar