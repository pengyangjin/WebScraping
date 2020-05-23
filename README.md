# WebScraping
## 1.安装chrome浏览器
## 2.安装chromedriver
  下载从http://npm.taobao.org/mirrors/chromedriver/ 下载对应版本的chromedriver_win32.zip  
  将chromedriver_win32.zip解压缩得到chromedriver.exe  
  将chromedriver.exe移动到C:\Program Files (x86)\Google\Chrome\Application目录  
  将C:\Program Files (x86)\Google\Chrome\Application添加到环境变量  
## 3.启动chrome
   在cmd界面输入  
    chrome.exe --remote-debugging-port=9222
## 4.运行Main.java



# 
System.setProperty("webdriver.edge.driver","C:/Application/edgedriver_win64/msedgedriver.exe");
EdgeOptions options=new EdgeOptions();
WebDriver webDriver= new EdgeDriver(options);
webDriver.get("https://www.cocservice.top/update/0000-Barbarian/");
String pageSource = webDriver.getPageSource();
webDriver.close();
//System.out.println(pageSource);
Document document= Jsoup.parse(pageSource);
Element element = document.selectFirst("table[class = updating]");
System.out.println(element.toString());
