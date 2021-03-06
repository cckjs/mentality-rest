#!/usr/bin/env bash
docker_mysql_image_name="mysql"
docker_mysql_image_tag="latest"
mysql_port="3306"
docker_mysql_port="3306"
mysql_data_path="/Users/user/yangyong/dev/mysql/data"
mysql_root_password="yangyong"
docker_mysql_name="young-mysql"
mysql_server_encode="utf8mb4"
mysql_collation_server_encode="utf8mb4_unicode_ci"
docker_mysql_command="--name $docker_mysql_name -p $mysql_port:$docker_mysql_port -v $mysql_data_path:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=$mysql_root_password -d $docker_mysql_image_name:$docker_mysql_image_tag --character-set-server=$mysql_server_encode --collation-server=$mysql_collation_server_encode"
docker run $docker_mysql_command