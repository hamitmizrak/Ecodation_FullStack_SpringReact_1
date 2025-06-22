
# Node image
FROM node:18.17.1

# Description
LABEL  version="1.0"
LABEL  description="This is project React Js and other project Backend Spring Boot"
LABEL  maintainer =["hamitmizrak@gmail.com","https://github.com/hamitmizrak/devops_backend","https://github.com/hamitmizrak/devops_frontend"]

# Dizin create
WORKDIR /app

COPY ["package.json","package-lock.json", "./"]

RUN ls 
RUN node -v 
RUN npm -v 
RUN npm install --production

# Clear cache
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

COPY . .
EXPOSE  80 443

CMD ["npm","start"]

# Node image
FROM node:18.17.1

# Description
LABEL  version="1.0"
LABEL  description="This is project React Js and other project Backend Spring Boot"
LABEL  maintainer =["hamitmizrak@gmail.com","https://github.com/hamitmizrak/devops_backend","https://github.com/hamitmizrak/devops_frontend"]

# Dizin create
WORKDIR /app

COPY ["package.json","package-lock.json", "./"]

RUN ls 
RUN node -v 
RUN npm -v 
RUN npm install --production

# Clear cache
RUN apt-get clean && rm -rf /var/lib/apt/lists/*

COPY . .
EXPOSE  80 443

CMD ["npm","start"]