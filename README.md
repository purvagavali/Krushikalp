## Krushikalp
A smart agriculture platform designed to assist farmers with crop disease detection, contract farming, and fertilizer recommendations.
## Overview
Krushikalp helps farmers:
- Detect crop diseases using deep learning.
- Access contract farming opportunities.
- Receive fertilizer recommendations based on data.

## System Requirements
- JDK 1.8 or higher
- Android Studio 
- NetBeans 12+
- XAMPP (PHP 7.x, MySQL)
  
###  Steps to Set Up the Dataset:

1. **Add Disease Images to the Dataset Folder**  
   - Place leaf images categorized by disease type into:
     ```
     Krushikalp/dataset/
     ```

2. **Train the Disease Detection Model**  
   -Run AddData.java in netbeans to train images.
   -After training images we can see this training data under aipoweragri section on xampp.
   

3. **Launch Xampp**  
   - Launch XAMPP and open phpMyAdmin.
   - You will now see the trained disease image data,Fertillizers data,Order details,Payment details available in the MySQL `krushikalp` database under the relevant table

4. **Fertillizer recommendation module**
   -Unable location and fetch real time weather of particular area
   -Insert required parameters to get recommendations.

5.**Contract Farming**
   -Upload crop images ,pesticide on farmer side.
   -On user side buy product by providing card details for further payment.


6. **Update IP Address in Android App**  
   - Open the Android project in Android Studio.
   - Navigate to the `AgricultureAiAssistant` .
   - Replace the localhost IP with your machine's local IP (e.g., `192.168.x.x`) to connect the mobile app to the backend server:
     ```java
     String BASE_URL = "http://192.168.x.x/krushikalp/";
     ```

Now, when the application runs, farmers can upload leaf images,check for fertillizers and connect with market through the mobile app, and the trained model will identify the disease ,recommends fertillizers and place order for products using the backend and database.

![WhatsApp Image 2025-06-03 at 12 06 22_b6651cc5](https://github.com/user-attachments/assets/3e57e877-5638-43a3-ab39-84bb48f01a3d)

