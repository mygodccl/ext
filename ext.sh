#!/usr/bin/env bash
app_name='ext'
docker stop ${app_name}
echo'----stop container----'
docker rm ${app_name}
echo'----rm container----'
docker run -p 8088:9527 --name ${app_name} \
-d ccl/${app_name}:0.1
echo'----start container----'