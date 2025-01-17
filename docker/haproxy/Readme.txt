# HaProxy Example
# Reff: https://www.haproxy.com/blog/how-to-run-haproxy-with-docker

sudo docker network create --driver=bridge mynetwork

sudo docker run -d --name web1 --net mynetwork jmalloc/echo-server:latest
   
sudo docker run -d --name web2 --net mynetwork jmalloc/echo-server:latest
   
sudo docker run -d --name web3 --net mynetwork jmalloc/echo-server:latest



touch haproxy.cfg

vim haproxy.cfg

global
  stats socket /var/run/api.sock user haproxy group haproxy mode 660 level admin expose-fd listeners
  log stdout format raw local0 info

defaults
  mode http
  timeout client 10s
  timeout connect 5s
  timeout server 10s
  timeout http-request 10s
  log global

frontend stats
  bind *:8404
  stats enable
  stats uri /
  stats refresh 10s

frontend myfrontend
  bind :80
  default_backend webservers

backend webservers
  server s1 web1:8080 check
  server s2 web2:8080 check
  server s3 web3:8080 check


sudo docker run -d --name haproxy --net mynetwork -v $(pwd):/usr/local/etc/haproxy:ro -p 80:80 -p 8404:8404 haproxytech/haproxy-alpine:2.4

sudo docker ps



