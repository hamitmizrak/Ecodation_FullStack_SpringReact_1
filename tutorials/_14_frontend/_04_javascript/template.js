// alert("merhabalar")

// console
// console.log("console log")

// alert
// alert("deneme1")
// window.alert("alert1")


// document.write("document data")

// double quotes: çift tırnak ("")
// single quotes: tek tırnak ('')
// backtick : tek tırnak (``)

// var (Global)
// let(Local) ES6
// const(Local) ES6
// var _$degiskenAdi88=44;
// console.log(_$degiskenAdi88)
// /*
// Değişken adları: kullanma
// sayıyla başlama
// _ve $ haricinde özel bir simgeyi kabul etmiyor
// kelimeler arasında tire kullanma
// */

// var value1=44;
// console.log(typeof value1)

// var value2=44.5656;
// console.log(typeof value2)

// var value3="JavaScript öğreniyorum";
// console.log(typeof value3)

// var value4=false;
// console.log(typeof value4)

// var value5=[]; //dizi
// console.log(typeof value5)

// var value6={}; //object
// console.log(typeof value6)

// //undefined
// let data;
// console.log(data)

// + - * / % x++ y-- ++X
// let x1=10;
// const x2=3;

// var x3=x1+x2;
// console.log(x3);

// var x4=x1-x2;
// console.log(x4);

// var x5=x1*x2;
// console.log(x5);

// var x6=x1/x2;
// console.log(x6);

// var x7=x1%x2;
// console.log(x7);

// kullanıcıdan veri almak
// NOT: prompt sonucu bir string'tir
// Eğer bize prompt gelen bir sayı lazım olursa biz bunu cast etmeliyiz
// let userData=prompt("Lütfen birşeyler yazınız");
// console.log(userData)

// CAST:
// String ==> Number
// //Number ==> String
// let value1 = "14";
// console.log(typeof value1)

// value1 = Number(typeof value1);
// console.log(typeof value1)

// let value2 = 2;
// let result = value1 / value2;
// console.log(result);

// //NaN: Not a Number: sayı değildir


// //Infinity: bir sayı/0 bölemezsiniz
// console.log(4/0)

// //isNaN eğer false bu bir sayıdır
// console.log(isNaN("asdf"))

// // //undefined
// // let data;
// // console.log(data)

// //new:  null:  zero:

// console.log("1.satır")
// console.log("2.satır")
// console.log("3.satır\n4.satır")
// escape character ==> \n

// break:döngüyü kırmak
// return:metotu kırmak
// continue:1 kereye mahsus es geç sonra döngüye devam et
// console.log(Math.min(2, 9, 8, -1555))
// console.log(Math.max(2, 9, 8, -1555))
// console.log(Math.abs(-44))
// console.log(Math.pow(2, 5))
// console.log(2 ** 5)
// console.log(Math.sqrt(16))

// console.log(Math.floor(2.9))//alt tabana
// console.log(Math.ceil(2.1))//üst taban
// console.log(Math.round(5.5))
// console.log(Math.round(5.4))
// console.log(Math.sin(45))


// console.log(Math.ceil(Math.random() * 10 + 1))

// ////////////////////////////////////////////////////////////////////////////////////

// ÖDEV 1
// Kullanıcıdan aldığımız 2 tane sayıyı toplayan JS algorithm ?
// 4işlem toplama çıkarma çarpma bölme
// let number1,number2,sum=0;
// number1=Number(prompt("Lütfen 1.sayıyı giriniz"));
// number2=Number(prompt("Lütfen 2.sayıyı giriniz"));
// sum=number1+number2;
// console.log(sum);


// //ÖDEV 2
// Math Ödev
// Kullanıcıda tarafından aldığımız 2 tane sayının
// s1-) Bu sayılardan en küçüğü nedir ?
// s2-) Bu sayılardan en büyüğü nedir ?
// s3-) Bu sayılardan en büyüğü karekökü nedir ?
// s4-) Bu sayılardan en büyüğü karekökünün üste yuvarlıyalım nedir ?
// s5-) Bu sayılardan en küçüğü mutlak değeri nedir ?
// s6-) Bu sayılardan en küçüğü alt taban en büyüğü üst taban şeklinde üstünü alalım

// ////////////////////////////////////////////////////////////////////////////////////
// SAYI
// let number1 = 14;
// console.log(typeof number1);
// //let sayi; :undefined
// //14/0      :Infinity
// //14/"asd"  :NaN

// let number2 = 14.531983;
// console.log(number2.toFixed(2))

// //bilimsel gösterim
// let bilimsel = 13E-4;
// console.log(bilimsel)

// //Binary(0-1)
// let binaryNumber = 0b010101010;
// console.log(binaryNumber);

// //Octal(8) (0-1-2-3-4-5-6-7)
// let octalNumber = 07562;
// console.log(octalNumber);

// //Decimal(10) (0-1-2-3-4-5-6-7-8-9)
// let decimalNumber = 1010;
// console.log(decimalNumber);

// //Hexedecimal(16) (0-1-2-3-4-5-6-7-8-9-A-B-C-D-E-F)
// let hexDecimalNumber = 0xfff;
// console.log(hexDecimalNumber);

// ////////////////////////////////////////////////////////////////////////////////////

// //String
// let vocabulary = "javame JAvaSCript java JAvaSCript";
// document.write(vocabulary + "<br/>");
// document.write(vocabulary.length + "<br/>");
// document.write(vocabulary.trim().length + "<br/>");

// document.write(vocabulary.toLowerCase() + "<br/>");
// document.write(vocabulary.toUpperCase() + "<br/>");

// document.write(vocabulary.startsWith("J") + "<br/>");
// document.write(vocabulary.endsWith(" ") + "<br/>");

// document.write(vocabulary.toLowerCase().concat("sona ekle") + "<br/>");

// document.write(vocabulary.replace(vocabulary, "değiştirdim") + "<br/>");

// document.write(vocabulary.substring(1) + "<br/>");
// document.write(vocabulary.substring(1, 4) + "<br/>"); //1<=Kelime<=4-1

// document.write(vocabulary.indexOf("JAvaSCript") + "<br/>"); //1<=Kelime<=4-1
// document.write(vocabulary.lastIndexOf("JAvaSCript") + "<br/>"); //1<=Kelime<=4-1

// document.write(vocabulary.charAt(0) + "<br/>");

// ÖRNEK
// 1.soru: Kullanıcıdan alınan x ve k değeri için
// 1.dereceden 2 bilinmeyenli denklem algoritması
// y=3x+4k;
// x=5;
// k=3

// ÖRNEK
// Kullanıcıdan alınan dereceyi fahranhayt'a değerine çeviren algoritma
// 2.soru
// Dereceyi Fahrenhayt
// (derece*9/5)+32

// let userData = Number(prompt("Lütfen dereceyi giriniz"));
// let result = (userData * 9 / 5) + 32;
// document.write(result + "<br/>");


// ÖRNEK
// Kullanıcıdan alınan 1 ve 2.sayı için hesap makinası uygulaması algoritması?

// ÖRNEK: Math
// Örnek-1 (Hesap Makinesi)
// kullanıcıdan alınan iki sayının dört işlem (Hesap Makinesi)
// Scanner, cast
// toplama
// çıkarma
// çarpma
// bölme
// bölümünden kalan
// bu iki sayıdan büyük olanın karekökü (Math.sqrt)
// bu iki sayıdan küçük olanın mutlak değeri (Math.sqrt)
// bu iki sayıdan küçük olanın alt değer büyük üst değer (Math.pow)



// ÖDEV-3
// kullanıcı tarafından girilen bir kelimenin (prompt)
// S-1) Kaç karakterlidir ?
// S-2) boşluklar alınarak Kaç karakterlidir ? (trim)
// S-3) bütün kelimeyi küçük harfle göstermek ?
// S-4) bütün kelimeyi büyük harfle göstermek ?
// S-5) ilk harf nedir  ? (charAt)
// S-6) girdiğiniz kelime java ile başlıyor mu  ?
// S-7) girdiğiniz kelimenin sonuna "-ben js öğreniyorum"   ?
// S-8) girdiğiniz 0 ile 4 arasındaki indexi ekranda gösterin   ?
// S-9) Kullanıcıdan alınan başka bir kelimeyle birinci olan kelimeyle yer değiştirmek ?


// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// JS: function
// Java: Method
// 1
// function returnsuzParametresiz() {
//     document.write("returnsuz Parametresiz<br/>")
// }
// returnsuzParametresiz()

// //2
// function returnsuzParametreli(surname) {
//     document.write("returnsuz Parametreli " + surname + "<br/>")
// }
// returnsuzParametreli("soyadım")

// //3
// function returnluParametresiz() {
//     return "returnlu Parametresiz<br/>";
// }
// let data = returnluParametresiz();
// document.write(data);

// //4
// function returnluParametreli(data1, data2) {
//     return "returnlu Parametresiz" + data1 + data2 + "<br/>";
// }
// let data2 = returnluParametreli(" javase", " javaee");
// document.write(data2);

// ////////////////////////////////////////////////////////////////////////////////////

// //Normal Function
// function normal() {
//     document.write("Normal Function <br/>")
// }
// normal();

// //Anonymous function (ES5)
// let anonymous = function () {
//     document.write("Anonymous Function <br/>")
// }
// anonymous();

// //Arrow Function (ES6)
// let arrow = () => {
//     document.write("Arrow Function <br/>")
// }
// arrow();

// ////////////////////////////////////////////////////////////////////////////////////
// Callback function
// function data1() {
//     alert("data1")
// }

// function data2() {
//     data1()
// }
// data2()

// function data1(number) {
//     alert(Math.pow(number, 2))
// }

// function data2(callback) {
//     callback(4)
// }
// //data2(data1)//call backfunction  ==> Monad

// //setInterval
// let sum = () => {
//     //
//     setInterval(() => { alert("set Interval last") }, 2000);
// }

// sum ()


// ////////////////////////////////////////////////////////////////////////////////////

// break; döngüyü durdur
// return function durdurur.
// let result1 = () => {
//     let number = 5;
//     if (number == 1)
//         document.write("1")
//     else
//         document.write("1 farklıdır")
// }
// result1()

// Ternary Operators
// let result11 = () => {
//     let number = 1;
//     let result = (number == 1) ? "1" : "1 farklıdır";
//     document.write(result)

// }
// result11()


// let result2 = () => {
//     let number = 15;
//     if (number === 1)
//         document.write("1")
//     else if (number === 2)
//         document.write("2")
//     else if (number === 3)
//         document.write("3")
//     else if (number === 4)
//         document.write("4")
//     else if (number === 5)
//         document.write("5")
//     else
//         document.write("1<=X<=5 dışındadır farklıdır")
// }
// result2()

// let result3 = () => {
//     let number = 2;
//     switch (number) {
//         case 1:
//             document.write("1")
//             break;
//         case 2:
//             document.write("2")
//             break;
//         case 3:
//             document.write("3")
//             break;
//         case 4:
//             document.write("4")
//             break;
//         case 5:
//             document.write("5")
//             break;
//         default:
//             document.write("1<=X<=5 dışındadır farklıdır")
//             break;
//     }

// }
// result3()



// ////////////////////////////////////////////////////////////////////////////////////

// let result4 = () => {
//     For Döngüsü
//     let sum = 0;
//     for (let i = 1; i <= 10; i++) {
//         sum = sum + i;
//     }
//     document.writeln(sum)
// }
// result4()


// let result5 = () => {
//     while Döngüsü
//     let sum = 0;
//     let i = 1;
//     while (i <= 10) {
//         sum = sum + i;
//         i++;
//         i=i+1;
//         i += 1;
//     }
//     document.writeln(sum)
// }
// result5()


// let result6 = () => {
//     dowhile Döngüsü
//     let sum = 0;
//     let i = 1;
//     do {
//         sum = sum + i;
//         i++;
//         i = i + 1;
//         i += 1;
//     }
//     while (i <= 10);
//     document.writeln(sum)
// }
// result6()


// try-catch
// let result7 = () => {
//     try {
//         alertx("pop-up data")

//     } catch (error) {
//         console.log("Hata mesajı: "+error.message);
//         console.log("Hata mesajı adı: "+error.name);
//         console.log("Hepsi: "+error);
//     }finally{
//      console.log("db.closed: ");
//     }
//     console.log("son satır")
//     throw "Hata var"
// }
// result7()

// /////////////////////////////////////////////////////////
// Array
// let arrayData=()=>{
// let dizi=["Ankara",44,true,34.56,"Sivas"];
// console.log(dizi)
// console.log(typeof  dizi)
// console.log(dizi[0].toUpperCase())
// console.log(dizi[3])
// console.log(dizi[dizi.length-1])

// 1- iterative for
// for (let i = 0; i < dizi.length; i++) {
// /console.log(dizi[i]+" ");
// document.write(dizi[i]+" ");
// }

// document.write("###############<br/>");

// 2- for in (For Over Index)
// for( let temp in dizi){
//     document.write(temp+"="+dizi[temp]+" ");
// }

// document.write("<br/>###############<br/>");

// 3- for of (For Over Member)
// for( let temp of dizi){
//     document.write(temp+" ");
// }
// document.write("<br/>###############<br/>");

// 4- forEach
// dizi.forEach(function(value){
//     document.write(value+" ");
// })

// document.write("<br/>###############<br/>");

// 5- forEach (ES5)
// dizi.forEach(function(value,index,array){
//     document.write(index+"= "+value+", ");
//     interpolation (ES6)
//     document.write(`${index} =${value} ,`);
// });

// }
// arrayData()

// ES5(Anonymous Function)
// ES6(Arrow Function)
let arrayDataSet = () => {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    arr[1] = 22;
    return arr;
}
let arrayData2 = () => {
    //slice: dizilerde istediğimiz aralığı alır
    const arrayData = arrayDataSet().slice(0, 7);
    arrayData.push("sonData");//1 tane sona ekle
    arrayData.unshift("ilkData");//1 tane başa ekle
    arrayData.pop();//1 tane son data çıkar
    arrayData.shift();//1 tane ilk data çıkar

    arrayData.sort()//küçükten büyüğe
    //arrayData.sort().reverse()//büyükten küçüğe

    //forEach(ES5)
    arrayData.forEach(function (value) {
        document.writeln(value)
    }); //end forEach

    document.writeln("<br/>################<br/>")

    //filter,map,forEach(ES5)
    arrayData
        .filter(function (value) {
            return value % 2 == 0
        }) //end filter
        .map(function (value) {
            //String ,interpolation(ES6)
            return value.toString().concat(`=çift sayı,`)
        })
        .forEach(function (value) {
            document.writeln(value)
        }); //forEach
}
//arrayData2();

let localGlobal = () => {
    //global
    var global = "Merhabalar1";
    var global = "Merhabalar2";
    document.writeln(`var: ${global}<br/>`);

    //let const aynı isimde kullanamam
    let local = "Merhabalar3";
    document.writeln(`let: ${local}<br/>`);
    //let local="Merhabalar3"; ==> kullanamayız.
    local = "Merhabalar4";
    document.writeln(`let: ${local}<br/>`);

    const local2 = "Merhabalar5";
    document.writeln(`const: ${local2}<br/>`);
    //Uncaught TypeError: Assignment to constant variable.
    local2 = "Merhabalar6";
    document.writeln(`const: ${local2}<br/>`);
}
//localGlobal()

let arrayData3 = () => {

    let objectData = {
        "name": "Hamit",
        "surname": "Mızrak",
        "tc_number": 112233,
        "isLogin": true,
        "java": ["javase", "javaee", "javame"],
        "java8": {
            "stream": ["forEach", "limit", "filter"]
        },
        "fullName": function () {
            return `${this.name} ${this.surname}`
        }
    };
    // document.writeln(`name: ${objectData.name}<br/>`);
    // document.writeln(objectData.isLogin+"<br/>");
    // document.writeln(objectData.tc_number+"<br/>");
    // document.writeln(objectData.java[1]+"<br/>");
    // document.writeln(objectData.java8.stream[0]  +"<br/>");
    // document.writeln(objectData.fullName() +"<br/>");

    //Object forIn
    for (let temp in objectData) {
        document.writeln(`${temp}: ${objectData[temp]}  <br/>`);
    }

    //JSON.stringify, JSON.parse
    const objectToString = JSON.stringify(objectData);
    const stringTcNumber = JSON.parse(objectToString).tc_number;
    document.writeln(`name: ${stringTcNumber}<br/>`);

}
arrayData3()






