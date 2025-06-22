#! /bin/bash  
echo "merhabalar"

# variable
UPDATED="Güncelleme"
CLEANER=Temizleme
DELETED=Silme
VERSION=Version
SYSTEM_VARIABLE="Sistem Değişkeni" 
INSTALL="Yükle" 
PORT="Portlar"
SYSTEM_INFORMATION="Sistem hakkında"
WHICH="Konum hakkında"

# system variable
echo   -e "\n######"  $SYSTEM_VARIABLE  "######"
echo $JAVA_HOME
echo $PWD
echo $BASH
echo $BASH_VERSION
echo $HOME 


# Math
# echo  "scale=2; sqrt(16)" | bc -l #l: Math demek
# echo  "scale=2; 2^5" | bc -l

sleep 2
# Güncelleme
echo -e "\n######" $UPDATED "######"
read -p "Günceleme yapmak istiyor musunuz E/H " updatedResult
if [[ $updatedResult == "E"  ||  $updatedResult == "e" ]]
then
    echo -e "Güncelleme Başlandı "  
    sudo apt-get update
else 
    echo -e "apt-get Update List Güncelleme Yapılmadı!!!\n "    
fi    

# Temizleme
sleep 2
echo -e "\ntemizlik istiyor musunuz? E / H "
read result
echo "Temizlik ${result} "
if [ $result == "E" ]
then
    echo  -e "\n######"  $CLEANER  "######"
    sudo apt-get clean
    sudo apt-get autoremove -y
elif [ $result = "e" ]
then
    echo  -e "\n######"  $CLEANER  "######"
    sudo apt-get clean
    sudo apt-get autoremove -y
else
     echo  -e "## Temizleme Güncelleme yapılmadı"
fi

# Yükle
sleep 2
echo -e "\n######  Genel Yükleme ######"
read -p  "Genel Yükleme istiyor musunuz? E / H " updatedResult
if [[ $updatedResult == "E"  ||  $updatedResult == "e" ]]
then
    echo -e "Güncelleme Başlandı "  
    echo  -e "######"  $INSTALL  "######"
    sudo apt-get install vim -y
    sudo apt-get install unrar -y 
    sudo apt-get install rar
    sudo apt-get install openssh-server -y
    sudo apt install curl -y
    sudo apt install net-tools
    # snap install opera
    # apt-get install nginx -y
    # apt-get install nodejs

else 
    echo -e "Genel Güncelleme Yapılmadı!!!\n "    
fi 


# system variable


sleep 2
echo -e "\n######  Port Yükleme ######"
read -p  "Port aktif etmek istiyor musunuz? E / H " updatedResult
if [[ $updatedResult == "E"  ||  $updatedResult == "e" ]]
then
	echo   -e "\n######"  $PORT "######"
	netstat -nlptu
	sudo ufw allow 22
	sudo ufw allow 80
	sudo ufw allow 9000
	sudo ufw allow 8080
	sudo ufw allow 1111
	sudo ufw allow 2222
	sudo ufw allow 3333
	sudo ufw allow 4444
else 
    echo -e "Genel Güncelleme Yapılmadı!!!\n "    
fi 


# system variable
sleep 4
echo   -e "\n######"  $SYSTEM_INFORMATION "######"
free -m


# VS CODE
sleep 2
echo   -e "\n###### VSCODE ######"
read -p "VSCODE Yükleme istiyor musunuz? E / H " updatedResult
if [[ $updatedResult == "E"  ||  $updatedResult == "e" ]]
then
	echo   -e "\n###### VSCODE"  $INSTALL "######"
	sudo snap install code --classic
else 
    echo -e "VSCODE Güncellemesi Yapılmadı!!!\n "    
fi 


# JAVA
sleep 2
echo   -e "\n###### JAVA ######"
read -p "JAVA Yükleme istiyor musunuz? E / H " updatedResult
if [[ $updatedResult == "E"  ||  $updatedResult == "e" ]]
then
	# Java
	echo   -e "\n###### JAVA"  $INSTALL "######"
	echo   -e "\n######"  $WHICH "######"
	which java
	which git
	sudo apt-get update
	java -version
	sudo apt install openjdk-11-jdk -y
	sudo add-apt-repository ppa:openjdk-r/ppa -y
	# JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/bin/"             
	# vim deneme2.sh  #-s <(echo -e "/foo/\ndd\n:wq")
	echo -e "#Java Home\nJAVA_HOME=\"/usr/lib/jvm/java-11-openjdk-amd64/bin/\" " >> ~/.bashrc 
	# echo -e "Dosya adı:\c"
	# read dosyaAdi
	# if [ -f $ dosyaAdi ]
	# then
	# 	if [ -w $dosyaAdi]
	# 	then 
	# 		echo "Dosya yazılabilinir çıkmak için Ctrl+d basınız"
	# 	else
	# 		echo "Dosya yazılamaz"
	# 	fi
	# else
	# 	echo "dosya mevcut değil"
	# fi
	# git version


	# java version
	echo   -e "\n######"  "java" $VERSION  "######"
	java --version
else 
    echo -e "Java Güncelleme Yapılmadı!!!\n "    
fi 


# GİT
sleep 2
read -p "GİT Yükleme istiyor musunuz? E / H " updatedResult
if [[ $updatedResult == "E"  ||  $updatedResult == "e" ]]
then

	# Git
	echo   -e "\n###### GİT"  $INSTALL "######"
	sudo apt-get update
	sudo apt-get install git -y
	git version
	git config --global user.name "hamitmizrak"
	git config --global user.email "hamitmizrak@gmail.com"
	git config --global -l 
	echo    -e "\n######"  "git" $VERSION  "######"
	git --version 

else 

    echo -e "Git Güncelleme Yapılmadı!!!\n "    

fi 


# vs code 
echo   -e "\n###### VSCODE  ######"
code .