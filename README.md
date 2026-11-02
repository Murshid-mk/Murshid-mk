# awsdatabse

Database name is : databasedemo

docker run -d -p 8080:8080 \
  -e DB_HOST="xxxxxxxxxxx.rds.amazonaws.com:3306" \
  -e DB_USER="admin" \
  -e DB_PASSWORD="xxxxxxxxxxxxxx" \
 febnotechkolkata/databasedemo:latest
 
 curl -X POST http://localhost:8080/api/items \
     -H "Content-Type: application/json" \
     -d '{"name": "Local Docker Item"}'
     
     curl -X GET http://localhost:8080/api/items