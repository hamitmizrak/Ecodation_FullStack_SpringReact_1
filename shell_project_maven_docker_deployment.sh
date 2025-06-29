#! /bin/bash
#!/bin/bash
# bash (tercihiniz olsun) ancak bh eskidi

# Eğer database_memory_persist varsa sil
echo "Backend (Spring Boot) - Frontend(React JS) Starting Dockerize"

#########################################################
# User Variable
UPDATED="Güncelleme"
CLEANER="Temizleme"
INSTALL="Yükleme"
DELETED="Silme"
CHMOD="Erişim İzni"
INFORMATION="Genel Bilgiler Ports | NETWORKING"
UFW="Uncomplicated Firewall Ggüvenlik duvarı Yöentim Araçı"
LOGOUT="Sistemi Tekrar Başlatmak"
CHECK="Yüklenecek Paket bağımlılıkları"
PACKAGE="Paket Sistemde Yüklü mü"
JDK="JDK Kurmak"
JENKINS="Jenkins"
TOMCAT="Apache Tomcat"
POSTGRESQL="Postgresql"
SONARQUBE="SonarQube"
DOCKER_PULL="Docker Pulling"
LOGIN="Docker Login"
LOGOUT="Docker Logout"
PORTAINER="Docker Portainer"
DOCKERCOMPOSE="Docker Compose"


#########################################################
# Maven deployment
#chmod +x shell_maven_docker.sh
#chmod +x shell_manuel_project.sh
chmod +x shell_countdown.sh


#########################################################
# Version info
version_info(){
  ./shell_countdown.sh
  mvn -v
  git -v
  java -version
  javac -version
  docker version
}
version_info

#########################################################
# docker_network
docker_network(){
  # Backend ve Frontent ortaklaşa çalışması için network external olmalıdır.
  ./shell_countdown.sh
  echo -e "######### Docker Network eğer oluşturmazsak frontend ve backend servisler ortaklaşa çalışamıyacaktır#########\n"
  docker network rm fullstack_network
  docker network ls
  docker network create fullstack_network
  ./shell_countdown.sh
  docker network ls
}
docker_network

#########################################################
# Database File Delete
database_memory_file_delete() {

    # Geri Sayım
    ./shell_countdown.sh

    echo -e "\n###### ${DELETED} ######  "
    # shellcheck disable=SC2162
    read -p "database_memory_persist Dosyasını Silmek İstiyor musunuz ? e/h " databaseMemoryDeleteResult
    if [[ $databaseMemoryDeleteResult == "e" || $databaseMemoryDeleteResult == "E" ]]; then
        echo -e "database_memory_file Silmeye Başladı ..."
        # Geri Sayım
        ./shell_countdown.sh
        #mvn clean package
        rm -rf database_memory_persist
        echo -e "Bulunduğum dizin => $(pwd)\n"
    else
        echo -e "database_memory_persist Dosyasını Silinmedi...."
    fi
}
database_memory_file_delete

#########################################################
# Target JAR File Delete
target_file_delete() {
    # Geri Sayım
    ./shell_countdown.sh
    echo -e "\n###### ${DELETED} ######  "
    # shellcheck disable=SC2162
    read -p "Target JAR File Delete Dosyasını Silmek İstiyor musunuz ? e/h " targetFileDeleteResult
    if [[ $databaseMemoryDeleteResult == "e" || $databaseMemoryDeleteResult == "E" ]]; then
        echo -e "Maven Compiler Yükleme Başladı ..."
        # Geri Sayım
        ./shell_countdown.sh

        #mvn clean package
        rm -rf target
    else
        echo -e "Target File Silme İşlemi Yapılmadı...."
    fi
}
target_file_delete

#########################################################
# Maven deployment
maven_deployment() {
    # Geri Sayım
    ./shell_countdown.sh
    echo -e "\n###### ${INSTALL} ######  "
    # shellcheck disable=SC2162
    read -p "Maven Compile Yapmak İstiyor musunuz ? e/h " mavenCompileInstallResult
    if [[ $mavenCompileInstallResult == "e" || $mavenCompileInstallResult == "E" ]]; then
        echo -e "Maven Compiler Yükleme Başladı ..."
        # Geri Sayım
        ./shell_countdown.sh
        echo -e "Bulunduğum dizin => $(pwd)\n"
        sleep 1
        echo -e "######### MAVEN #########\n"
        # Yükleme
        #mvn clean package
        ##cd ..
        # Maven Compile
        #mvn clean package
        mvn clean package -DskipTests
    else
        echo -e "Maven Yüklenmesi Yapılmadı...."
    fi
}
maven_deployment

#########################################################
# Docker backend_frontend_deployment
backend_frontend_deployment() {
    # Geri Sayım
    ./shell_countdown.sh
    echo -e "\n###### ${INSTALL} ######  "
    # shellcheck disable=SC2162
    read -p "Docker Backend ve Frontend Compile Yapmak İstiyor musunuz ? e/h " mavenCompileInstallResult
    if [[ $mavenCompileInstallResult == "e" || $mavenCompileInstallResult == "E" ]]; then
        echo -e "Backend ve Frontend Compiler Yükleme Başladı ..."
        # Geri Sayım
        ./shell_countdown.sh
        echo -e "Bulunduğum dizin => $(pwd)\n"
        sleep 1

        ./shell_countdown.sh
        echo -e "######### Docker Network Listesi #########\n"
        docker network ls
        #docker network create fullstack_network
        #docker network rm fullstack_network

        ./shell_countdown.sh
        echo -e "######### BACKEND/FRONTEND #########\n"
        # 2 tane docker-compose aynı anda çalışsın
        docker-compose -f docker-compose-backend.yml -f docker-compose-frontend.yml up --build
        # docker compose durdur
        #docker-compose -f docker-compose-backend.yml down
        #docker-compose -f docker-compose-frontend.yml down
        #docker-compose -f docker-compose-backend.yml down -f docker-compose-frontend.yml down

        ./shell_countdown.sh
        echo -e "######### Docker Backend Actuator Health #########\n"
        # curl http://localhost:4444/actuator/health

        ./shell_countdown.sh
        echo -e "######### Docker Backend application/json testi #########\n"
        # curl -H "Accept: application/json" http://container_blog_springboot_react:4444/blog/category/api/v1/list

        ./shell_countdown.sh
        echo -e "######### Docker Backend Container Listesi #########\n"
        docker ps
        #docker stop container_blog_springboot
        docker ps | grep container_blog_springboot
        docker logs container_blog_springboot
        cat /container_blog_springboot

        ./shell_countdown.sh
        echo -e "######### Docker Frontend Container Listesi #########\n"
        docker ps
        docker ps | grep container_blog_react

        ./shell_countdown.sh
        echo -e "######### Docker Frontend Bash Terminal #########\n"
        docker logs container_blog_react
        #docker exec -it container_blog_react sh
        #ping container_blog_springboot
        #curl http://container_blog_springboot:4444/blog/category/api/v1/list

        ./shell_countdown.sh
        echo -e "######### Docker Network Listesini Bulma #########\n"
        docker network ls | grep fullstack_network

    else
        echo -e "Backend-Frontend Yüklenmesi Yapılmadı...."
    fi
}
backend_frontend_deployment


#########################################################
# Docker deployment (Backend)
docker_deployment_backend() {

    # Geri Sayım
    ./shell_countdown.sh

    echo -e "\n###### ${INSTALL} ######  "
    # shellcheck disable=SC2162
    read -p "Sadece Backend için Docker Deployment Backend Yapmak İstiyor musunuz ? e/h " backenddockerCompileInstallResult
    if [[ $backenddockerCompileInstallResult == "e" || $backenddockerCompileInstallResult == "E" ]]; then
        echo -e "Docker Deployment Backend Yükleme Başladı ..."

        # Geri Sayım
        ./shell_countdown.sh

        echo -e "Bulunduğum dizin => $(pwd)\n"
        sleep 1
        echo -e "######### BACKEND DOCKER COMPOSE #########\n"

        # Yükleme
        # docker-compose up
        # docker-compose up -d
        docker-compose -f docker-compose-backend.yml up --build
    else
        echo -e "docker deployment Yüklenmesi Yapılmadı...."
    fi
}
#docker_deployment_backend

#########################################################
# Profiles
springboot_profiles_chooise() {
    sleep 2
    echo -e "\n###### ${PROFILES} ######  "

    # Güncelleme Tercihi
    echo -e "Profile İçin Seçim Yapınız\n1-)Profiles Development\n2-)Profiles Production\n3-)Profiles Test\n4-)Çıkış"
    read chooise

    # Girilen sayıya göre tercih
    case $chooise in
        1)
            read -p "Profiles Development Yükleme mi İstiyor musunuz ? e/h " listUpdatedResult
            if [[ $listUpdatedResult == "e" || $listUpdatedResult == "E" ]]; then
                echo -e "Profiles Development"
                # Geriye Say
               # Profiles Dev
                mvn spring-boot:run -Dspring.profiles.active=dev
            else
                echo -e "Profiles Development Güncellenemesi yapılmadı"
            fi
            ;;
        2)
            read -p "Profiles Production Yükseltmek İstiyor musunuz ? e/h " systemListUpdatedResult
            if [[ $systemListUpdatedResult == "e" || $systemListUpdatedResult == "E" ]]; then
                echo -e "Profiles Production."
               # Profiles Prod
               mvn spring-boot:run -Dspring.profiles.active=prod
            else
                echo -e "Profiles Production Güncellenmesi  yapılmadı..."
            fi
            ;;
        3)
            read -p "Profiles Test Yüklememi İstiyor musunuz ? e/h " kernelUpdatedResult
            if [[ $kernelUpdatedResult == "e" || $kernelUpdatedResult == "E" ]]; then
                echo -e "Test ..."
                # Profiles Test
                mvn spring-boot:run -Dspring.profiles.active=test
            else
                echo -e "Profiles Test Yüklememi Yapılmadı..."
            fi
            ;;
        *)
            echo -e "Lütfen Sadece Size Belirtilen Seçeneği Seçiniz"
            ;;
    esac
}
#springboot_profiles_chooise

#########################################################
#ls -al
#cd frontend/blog/
#npm start

# Docker deployment (Frontend)
docker_deployment_frontend() {
    # Geri Sayım
    ./shell_countdown.sh

    echo -e "\n###### ${INSTALL} ######  "
    # shellcheck disable=SC2162
    read -p "Sadece Frontend Docker Deployment Frontend Yapmak İstiyor musunuz ? e/h " frontenddockerCompileInstallResult
    if [[ $frontenddockerCompileInstallResult == "e" || $frontenddockerCompileInstallResult == "E" ]]; then
        echo -e "Sadece Frontend Docker Deployment Frontend Yükleme Başladı ..."

        # Geri Sayım
        ./shell_countdown.sh

        echo -e "Bulunduğum dizin => $(pwd)\n"
        sleep 1
        echo -e "######### DOCKER COMPOSE #########\n"

        # Yükleme
        # docker-compose up
        # docker-compose up -d
        docker-compose -f docker-compose-frontend.yml up --build
    else
        echo -e "docker Frontend deployment Yüklenmesi Yapılmadı...."
    fi
}
#docker_deployment_frontend


#########################################################
#########################################################
#########################################################
#########################################################
#########################################################
