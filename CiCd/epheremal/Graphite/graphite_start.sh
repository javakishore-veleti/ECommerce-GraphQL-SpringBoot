
docker stop graphite || true
docker rm graphite || true

docker run -d\
 --name graphite\
 --restart=always\
 -p 9080:80\
 -p 2003-2004:2003-2004\
 -p 2023-2024:2023-2024\
 -p 8125:8125/udp\
 -p 8126:8126\
 graphiteapp/graphite-statsd