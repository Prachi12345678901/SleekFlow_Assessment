# SleekFlow_Assessment
Test Automation: Practical and Questionnaire Assignment
#to run code first Setup Selenium in the system.
#Steps to setup Selenium
JDK 1.8 - 64 bit: 

Uninstall the existing Java: Ignore If they don’t exist. 

Open Control panel and uninstall the below highlighted software. 


Open below link: 

https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html 

Click on Accept Licese Agreement 

Click on  link to download 64 bit 

Once downloaded, install it by clicking on Next button with default options only. 


Eclipse IDE – NEON – 64 bit 

Open below link: 

https://www.eclipse.org/downloads/packages/release/photon/m7 

Click on  64 bit link 

After Download and unzip it. 

You may download NEON version of Eclipse IDE as well. Ensure to download the latest version. 

Selenium Stand Alone Jar: 

Open below link: 

http://docs.seleniumhq.org/download/ 

Google Chrome Driver: 

In the same link: http://docs.seleniumhq.org/download/ 

Click on  link to download chrome for windows. 

 Firefox Driver: 

And then Click on the link

# Once done with the above steps 
1.Open Eclipse
2.Go to File
3. Paste the code from GitHub Repo
4. Save the .java file
5.  Right click on the editor window and select "Run As" ---> Java Applocation.
6.  Hit Enter key.
7.  Wait for the operation to close and redirected to Eclipse IDE.
8.  Look for the output on console.

#Note:
In System.setProperty("driver","Path"), In place of path please give the path where chromedriver.exe is stored in the system on which program is running else it will through error.
#Sample format for MAC: System.setProperty("webdriver.chrome.driver" ,  "/Users/sampada/Applications/chromedriver");
#Sample format for Windows: 
System.setProperty("webdriver.chrome.driver","C:\\Users\\practripathi\\Downloads\\CP-SATProject\\SleekFlow_Assessment\\chromedriver.exe");
