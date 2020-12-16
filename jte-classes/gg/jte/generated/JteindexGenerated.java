package gg.jte.generated;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {347,347,347,347,347,347};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\">\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n    <title>Universal Bank</title>\r\n    <link rel=\"stylesheet\" href=\"C:\\Users\\lucky\\Desktop\\www\\main.css\">\r\n</head>\r\n<body>\r\n<style>\r\n@import url('https://fonts.googleapis.com/css2?family=Satisfy&display=swap');\r\n\r\n* {\r\n    margin: 0;\r\n    padding: 0;\r\n    outline: none;\r\n}\r\nbody , html {\r\n    width: 100%;\r\n    height: 100%;\r\n}\r\n\r\nbody {\r\n    background-color: rgb(207,199,199);\r\n    font-family: Trebuchet MS,  Helvetica;\r\n}\r\n\r\nheader {\r\n   width: 100%;\r\n   padding: 10px 0.5% 0px 0.5%;\r\n   background: transparent;\r\n   float: left;\r\n   position: fixed;\r\n}\r\nheader #logo {\r\n    color: whitesmoke;\r\n    cursor: pointer;\r\n\r\n}\r\nheader #logo span {\r\n    font-size: 1.7em;\r\n    line-height: 45px ;\r\n    margin-left: 40px;\r\n   font-family: 'Satisfy', cursive;\r\n}\r\n@media (min-width: 701px) {\r\n    #logo {\r\n        float: left;\r\n        width: 30%;\r\n        font-size: 1.1em;\r\n    }\r\n    #about {\r\n        float: right;\r\n        width: 67%;\r\n    }\r\n}\r\n#about{\r\n    text-align: center;\r\n    font-size: 1em;\r\n    line-height: 40px;\r\n    margin-bottom: 10px;\r\n}\r\n#about> a {color: whitesmoke;}\r\n#about > a:hover {\r\n    color: #b0b0b0;\r\n    text-decoration: underline;\r\n\r\n}\r\n#about > a:not(:last-child){\r\n    margin-right: 7%;\r\n}\r\n.fixed{\r\n    z-index: 5000;\r\n    background-color: whitesmoke;\r\n    border-bottom: 1px, solid #c0c0c0;\r\n}\r\nheader.fixed #logo{\r\n    color: #343434;\r\n}\r\n.fixed #about a {color: #343434;}\r\n.fixed #about a:hover {color: #7c7c7c;}\r\n\r\n#top {\r\n    width: 100%;\r\n\r\n    background-image: url(http://www.cita.com.ua/img/ntours/big/4/2010721678.jpg);\r\n    background-blend-mode: multiply;\r\n    background-color: #2e3a44;\r\n    background-size: cover;\r\n    text-align: center;\r\n    color: #fff;\r\n\r\n}\r\n@media (min-width: 1001px) {\r\n#top {\r\nfont-size: 3em;\r\n height: 1000px;\r\n}\r\n}\r\n@media (max-width: 1000px)and (min-width: 651px){\r\n#top {\r\nfont-size: 2em;\r\n height: 600px;\r\n}\r\n}\r\n@media (max-width: 650px){\r\n#top {\r\nfont-size: 1.3em;\r\npadding-top: 50%;\r\n height: 500px;\r\n}\r\n\r\n}\r\n\r\n#top h1 {\r\n    padding-top: 20%;\r\n}\r\n#top h3 {\r\n    color: #c1bcbc;\r\n\r\n}\r\n#main{\r\npadding: 100px 20%;\r\nwidth:60;\r\nfloat: left;\r\nbackground-color: #f6f6f6;\r\nborder-top: 2px solid silver;\r\ncolor: #484848;\r\nfont-size:1.3em;\r\n}\r\n@media(min-width:1401px){\r\n#main{\r\npadding: 100px 20%;\r\nwidth:60%;\r\n}\r\n}\r\n@media(max-width:1400px){\r\n#main{\r\npadding: 100px 10%;\r\nwidth:80%;\r\n}\r\n}\r\n@media(max-width:700px){\r\n#main div{\r\nwidth: 98%!important;\r\n}\r\n}\r\n#main div {\r\nwidth: 48%;\r\nmargin-right:2%;\r\nfloat: left;\r\n}\r\n#main h2 {font-size: 3em}\r\n#main h2 {color: #a0a0a0}\r\n\r\n#overview{\r\nfloat: left;\r\nbackground-image: url(\"https://assets.wam.ae/uploads/2019/07/994351622154327255.jpg\");\r\nbackground-blend-mode: multiply;\r\nbackground-color:#4f1c75 ;\r\nbackground-size: cover;\r\nbackground-attachment: fixed;\r\n\r\npadding: 100px 0;\r\nwidth: 100%;\r\ntext-align: center;\r\ncolor: #f6f6f6;\r\n}\r\n#overview h2 {font-size: 4em}\r\n#overview h4 {color: #ccc; font-size: 1.5em}\r\n#overview .img {\r\n    float: left;\r\n    width: 30%;\r\n    margin-right: 5%;\r\n    margin-top: 50px;\r\n\r\n}\r\n#overview .img:nth-child(odd){\r\nmargin-left: 20%;\r\n}\r\n#overview img{\r\nbackground: #fafafa;\r\npadding: 5px;\r\nborder: 2px solid silver;\r\nfloat: left;\r\nwidth: 100%;\r\nmax-width: 500px;\r\n}\r\n#overview span {\r\nfloat: left;\r\nwidth: 100%;\r\nfont-size: 2em;\r\nmargin-top: 10px;\r\n}\r\n@media (max-width:700px) {\r\n#overview .img {\r\nwidth: 80%!important;\r\nmargin-right: 0!important;\r\nmargin-left: 10%!important;\r\n}\r\n\r\n}\r\n\r\n@media (max-width: 700px) {\r\n    #logo {\r\n        margin-top: 15px ;\r\n        width: 100%;\r\n        font-size: 1.5em;\r\n    } #about{\r\n       float: left;\r\n       width: 100%;\r\n    }\r\n}\r\n#contacts {\r\nwidth: 100%;\r\nfloat:left;\r\npadding-bottom: 40px;\r\npadding-top: 70px;\r\nborder-top: 4px solid #f8f4f4;\r\nbackground: #272d45;\r\n}\r\nh1, h2, h3, h4, h5 {\r\nfont-family: 'Satisfy', cursive;\r\nfont-weight: lighter;\r\n}\r\n\r\n#contacts h5 {font-size: 3em; color: silver}\r\n#form_input{\r\nmargin-top: 15px;\r\nwidth: 35%;\r\nmargin-left: 38%;\r\nfont-size: 1.1em;\r\n}\r\n#form_input label {\r\ncolor: #c6c0c0;\r\ncursor: pointer;\r\nfont-size: 1.4em;\r\nfont-family: 'Satisfy', cursive;\r\n}\r\n#form_input label> span {\r\ncolor: #e87e7e;\r\n}\r\n#form_input input,#form_input textarea {\r\nmargin-bottom: 10px;\r\nwidth: 70%;\r\npadding: 10px 2%;\r\nborder-radius: 7px;\r\nborder: 2px solid silver;\r\nfont-size: 0.9em;\r\ncolor: #4a4a4a;\r\n}\r\n#form_input input,#form_input textarea:focus {\r\nborder-color: #333;\r\n}\r\n.btn{\r\nfloat: left;\r\nborder-radius: 5px;\r\npadding: 5px 9px;\r\nfont-size: 1.2em;\r\nbackground-color: #ec6550;\r\ntext-shadow:#454545 0 0 2px;\r\ncursor: pointer;\r\ncolor: #f6f6f6;\r\nfont-family: 'Satisfy', cursive;\r\n}\r\n.btn:hover {\r\nbackground-color: #c15443;\r\n}\r\n</style>\r\n    <header>\r\n        <div id=\"logo\" onclick=\"slowScroll('#top')\">\r\n            <span>Universal Bank</span>\r\n        </div>\r\n        <div id=\"about\">\r\n            <a href=\"#\" title=\"Возможности\" onclick=\"slowScroll('#main')\">Возможности</a>\r\n            <a href=\"#\" onclick=\"slowScroll('#overiwe')\"title=\"Преимущества\">Преимущества</a>\r\n            <a href=\"#\"  onclick=\"slowScroll('#contacts')\"title=\"Контакты\">Контакты</a>\r\n           <a href=\"/registration\" onclick=\"slowScroll('#Регистрация')\"title=\"Регистрация\"> Регистрация</a>\r\n           <a href=\"/login\" onclick=\"slowScroll('#Авторизация')\"title=\"Авторизация\"> Авторизация</a>\r\n        </div>\r\n        \r\n    </header>\r\n    <div id=\"top\">\r\n        <h1>Ваш банк</h1>\r\n        <h3>Всегда с вами!</h3>\r\n    </div>\r\n      <div id=\"main\">\r\n          <div class=\"intro\">\r\n          <h2>Всё для клиента !</h2>\r\n          <span>Наши технологии помогут вам быстро и комфортно пользоваться услугами банка</span>\r\n          </div>\r\n              <div class=\"text\">\r\n\r\n                  <span>Бесконтактные оплаты смартфоном\r\n                    Оплачивайте покупки, услуги или проезд бесконтактно с Google Pay, Apple Pay и мобильным кошельком Банка Восток.\r\n                      Просто поднесите смартфон или smart-часы к терминалу.\r\n                    Все карты есть в Вашем устройстве, оплата происходит мгновенно.</span>\r\n              </div>\r\n      </div>\r\n         <div id=\"overview\">\r\n             <h2>Преймущества</h2>\r\n             <h4>С нами проще</h4>\r\n             <div class=\"img\">\r\n             <img src=\"https://image.freepik.com/free-vector/contactless-payment-with-smartphone-and-terminal_128452-23.jpg\" alt=\"\" >\r\n             <span>Оплачивайте телефоном</span>\r\n             </div>\r\n             <div class=\"img\">\r\n                 <img src=\"https://img.freepik.com/free-vector/contactless-payment-male-hand-holding-credit-card-illustration-of-wireless-mobile-payment-by-credit-card_143407-800.jpg?size=338&ext=jpg\" alt=\"\">\r\n                 <span>Оплачивайте картой</span>\r\n             </div>\r\n             <div class=\"img\">\r\n                 <img src=\"https://newstes.ru/uploads/posts/2018-11/1542536707_2.jpg\"alt=\"\">\r\n                 <span>Оформление карты</span>\r\n             </div>\r\n             <div class=\"img\">\r\n                 <img src=\"https://lk.megafon.ru/static/media/social_networks/social_img.jpg\"alt=\"\">\r\n                 <span>Личный кабинет</span>\r\n             </div>\r\n         </div>\r\n         <div id=\"contacts\">\r\n        <center><h5>Обратная связь</h5></center>\r\n         <form id=\"form_input\" >\r\n         <label for=\"name\">Имя <span>*</span></label><br>\r\n         <input type=\"text\" placeholder=\"Введите имя\" name=\"name\" id=\"name\" ><br>\r\n         <label for=\"gmail\">Ваша почта<span>*</span></label><br>\r\n         <input type=\"gmail\" placeholder=\"Введите gmail\" name=\"gmail\" id=\"gmail\"><br>\r\n         <label for=\"message\">Сообщение<span>*</span></label><br>\r\n         <textarea placeholder=\"Введите ваше сообщение\" name=\"message\" id = \"message\"></textarea><br>\r\n         <div id=\"mess_send\" class=\"btn\">Отправить</div>\r\n</form>\r\n</div>\r\n\r\n     <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n     <script>\r\n         function slowScroll (id) {\r\n             $('html, body').animate({\r\n             scrollTop: $(id).offset().top\r\n             },500);\r\n         }\r\n         $(document).on(\"scroll\", function(){\r\n             if($(window).scrollTop()===0)\r\n             $(\"header\").removeClass(\"fixed\");\r\n             else\r\n             $(\"header\").attr(\"class\", \"fixed\");\r\n         })\r\n     </script>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
