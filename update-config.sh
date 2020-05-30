#!/bin/sh
cp mysql-creds.json mysql-creds.json.backup
vault read -format=json database/creds/role-handson > mysql-creds.json

sed  "s|USERNAME|`cat mysql-creds.json | jq -r '.data.username'`|g" application-template.yml > application.yml
sed -i -e "s|PASSWORD|`cat mysql-creds.json | jq -r '.data.password'`|g" application.yml

consul kv put config/application/data @application.yml

rm application.yml-e

sleep 30

vault lease revoke $(cat mysql-creds.json.backup | jq -r '.lease_id')