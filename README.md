# Implicit-Intent

## Learning Objective: 

> The main goal of this assignment is to understand and apply implicit intent concepts. Build an app that allows users to give input values like url link and phone number. Invoke the web link & phone calls using implicit intent concept.

**Step 1:**  Create a new application with MainActivity and design necessary responsive UI like buttons, textView, imageView, editText with ConstraintLayout in layout->XML file

[![Figure 1.1](https://i.imgur.com/iYKXU0O.png)](https://i.imgur.com/iYKXU0O.png)

**Step 2:** Assign the inputText value for the URL editText as textUri. In order to get the user input url value (as shown in figure 1.2) and launch it in the web browser, go to the java file and define a onClick method for the LAUNCH button. Get the editText value and pass the input value inside Uri with Intent.ACTION_VIEW using implicit intent.

[![Figure 1.2](https://i.imgur.com/VIXtoxm.png)](https://i.imgur.com/VIXtoxm.png)

**Step 3:** The android app must have permission to access the internet. To achieve that, go to Manifest file and add the android.permission.INTERNET. When the user gives the input url and press LAUNCH button, the app should show list of browsers available and allow the user to choose one of the browsers to open the web page. By default if you have only one browser, then the web page opens directly (as shown in figure 1.3).

[![Figure 1.3](https://i.imgur.com/Os3nBDN.png)](https://i.imgur.com/Os3nBDN.png)

**Step 4:** Assign the inputText value for the Phone editText as phone. In the java file, create an onClick method on the RING button (as shown in figure 1.4). Get the input phone number and pass it inside Uri with Intent.ACTION_CALL using implicit Intent. 

[![Figure 1.3](https://i.imgur.com/vR2aVk0.png)](https://i.imgur.com/vR2aVk0.png)

**Step 5:** To get permission to access the phone call, add permission.CALL_PHONE in the Manifest file. When the user enters the input number and clicks the RING button (as shown in figure 1.4), the number is dialed in the phone call (as shown in figure 1.5)

[![Figure 1.3](https://i.imgur.com/sHESaOb.png)](https://i.imgur.com/sHESaOb.png)

**Step 6:** To stop all activities and exit from the app, click on the CLOSE APP button.

### Live Demonstration: 
[LINK](http://g.recordit.co/qY9QDSY6SW.gif)

### Reference:   
[YOUTUBE](https://www.youtube.com/watch?v=VwhJaGVmjwg)
