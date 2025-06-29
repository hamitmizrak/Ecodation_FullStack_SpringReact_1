# mvn clean package
# mvn clean package -DskipTests

# docker image build -t imageAdi .
# docker container run -d -p 3000:3000 --rm --name blog

# React için Node tabanlı imaj
FROM node:18

# Bilgilendirme
LABEL maintainer="hamitmizrak@gmail.com"

# Çevresel değişkenler
ENV APP_NAME="Full Stack React JS"
ENV VERSION="v1.0.0"
ENV PORT="3000"

# Çevresel Değişkenleri RUN
RUN echo "App Name: $APP_NAME"
RUN echo "Version: $VERSION"
RUN echo "Port: $PORT"

# Çalışma dizini
WORKDIR /usr/src/app

# package.json ve lock dosyasını kopyala
COPY package*.json ./

# Bağımlılıkları yükle
RUN npm install

# Tüm dosyaları kopyala (src, public, vs.)
COPY . .

# Geliştirme portunu aç
EXPOSE 3000

# React uygulamasını başlat
CMD ["npm", "start"]

# Kalıcılık
# VOLUME /tmp

# HEALTHCHECK: Sağlık kontrolünü Eklesin
# HEALTHCHECK: Bu container çalışıyor mu ?
HEALTHCHECK --interval=30s --timeout=10s --start-period=5s --retries=3 \
    CMD curl -f http://localhost:3000/ || exit 1






