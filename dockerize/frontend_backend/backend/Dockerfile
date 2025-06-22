# JDK sürümü
FROM openjdk:17

# Bilgilerndirme
LABEL maintainer="hamitmizrak@gmail.com"

# Çevresel değişkeni tanımla ve değer atama
ENV APP_NAME="Backend Project"
ENV APP_VERSION="1.0"
ENV PORT="4444"

# Print environment variables
RUN echo "App name: $APP_NAME"
RUN echo "App version: $APP_VERSION"
RUN echo "Port: $PORT"

# Script çalıştır
RUN ECHO "Merhabalar bu alan javascript alanıdır"
#RUN ECHO "sudo apt-get update && apt-get upgrade"

# Dizin oluşturmak
WORKDIR /var/www/html

# localdeki dosyaları image içine yazmaya yaramaktadır.
COPY . /var/www/html

# Persist Data (Kalıcık Veri)
VOLUME /tmp

# basit bir sağlık kontrolü eklenmiştir.
# HEALTHCHECK komutu, konteynerin sağlığını belirlemek için kullanılan bir wget komutu tanımlar.
# Sağlık kontrolü her 30 saniyede bir çalışacak ve 3 saniye içinde yanıt alınamazsa konteyner sağlıksız olarak işaretlenecektir.
HEALTHCHECK --interval=30s --timeout=3s \
  CMD wget --quiet --tries=1 --spider http://localhost || exit 1

# Port
EXPOSE 4444

# Değişken
ARG JAR_FILE=/target/*.jar

# Değişkeni ekle
ADD ${JAR_FILE} blog_react

ENTRYPOINT ["java","-jar","/blog_react"]