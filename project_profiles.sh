#!/bin/bash

echo -e "profiles deployment"

#profile_prod(){
#  mvn spring-boot:run -Dspring.profiles.active=prod
#}
#profile_prod
# H2DB (Development)
# spring.profiles.active=dev
# mvn spring-boot:run -Dspring.profiles.active=dev

# MYSQL (Production)
# spring.profiles.active=prod
# mvn spring-boot:run -Dspring.profiles.active=prod

# POSTGRESQL (Test)
# spring.profiles.active=test
# mvn spring-boot:run -Dspring.profiles.active=test

######################################################################################
######################################################################################
echo -e "Spring Boot & Redis & Docker kurulumları başlıyor..."

# User Variable
PROFILES="Profile Seçimi"
DOCKER="Docker Seçimi"

chmod +x ./countdown.sh

######################################################################################
######################################################################################
maven_deployment(){
  # git pull httpp
  # cd isim
  mvn clean package -DskipTests
}

docker_manuel(){
  docker-compose up
  # docker-compose up -d
}


# logout
logout() {
    sleep 2
    echo -e "\n###### ${DOCKER} ######  "
    read -p "Sistemi Kapatıp Tekrar Açmak ister misiniz ? e/h " logoutResult
    if [[ $logoutResult == "e" || $logoutResult == "E" ]]; then
        echo -e "Docker Kurulumu ..."

      ./countdown.sh
      echo -e "Maven deployment ..."
      maven_deployment

      ./countdown.sh
      echo -e "Docker deployment ..."
      docker_manuel

    else
        echo -e "Sistem Kapatılmadı"
    fi
}
# Logout Çağırmak
logout


######################################################################################
######################################################################################
# Updated
springboot_profiles_chooise() {
    sleep 2
    echo -e "\n###### ${PROFILES} ######  "

    # Güncelleme Tercihi
    echo -e "Profile İçin Seçim Yapınız\n1-)Profiles Development\n2-)Profiles Production\n3-)dist-upgrade\n4-)Çıkış"
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
springboot_profiles_chooise
