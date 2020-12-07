#!/bin/bash

SRC_DIR=./
GEN_DIR=./gen
echo "create start!!!"


#java
mkdir -p ${GEN_DIR}/java
protoc -I=${SRC_DIR} --java_out=${GEN_DIR}/java ${SRC_DIR}/*.proto


#oc
mkdir -p ${GEN_DIR}/oc
protoc -I=${SRC_DIR} --objc_out=${GEN_DIR}/oc ${SRC_DIR}/*.proto

echo "create end!!!"
