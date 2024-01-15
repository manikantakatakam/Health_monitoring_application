# Health Monitoring Web Application Documentation

## Overview

The Health Monitoring Web Application is designed to monitor the health of elderly individuals and send alert messages to their guardians in case of any abnormalities. This application uses sensors to measure heartbeat and temperature, providing real-time health information.

## Features

1. **Heartbeat Monitoring:**
   - The application continuously monitors the heartbeat of the elderly person.
   - Abnormalities in heartbeat are detected, and alerts are triggered.

2. **Temperature Monitoring:**
   - The application measures the body temperature of the elderly person.
   - Abnormal temperature readings result in alert notifications.

3. **Alert System:**
   - Guardians are notified via SMS in case of abnormal health readings.
   - Twilio is used to send SMS messages programmatically.

## Technologies Used

- **Java:** The core programming language for backend logic.
- **Twilio API:** Used for sending alert messages.
- **HTML, CSS, JavaScript:** Frontend development for user interface.
- **MongoDB:** Database for storing health data.

## How to Run the Application

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/manikantakatakam/Health_monitoring_app.git
   cd Health_monitoring_app
## Install Dependencies:

1. Ensure you have Java installed.
2. Install required Java libraries.
3. Set up a Twilio account and obtain API credentials.

## Configure Application:

1. Set up MongoDB and update the database connection details.
2. Update Twilio credentials in the application code.

## Run the Application:

1. Start the Java application.
2. Open the web application in a browser.

## View Health Data:

- Monitor real-time health data on the web interface.
- View historical health data stored in the MongoDB database.

## Alert System Configuration:

To enable the alert system and SMS notifications, configure your Twilio credentials in the application. Update the following placeholders in the code:

- `TWILIO_ACCOUNT_SID`: Your Twilio Account SID.
- `TWILIO_AUTH_TOKEN`: Your Twilio Auth Token.
- `TWILIO_PHONE_NUMBER`: Your Twilio phone number.

## Future Enhancements:

- **User Authentication:** Implement secure user authentication for guardians.
- **Extended Sensor Support:** Integrate additional health sensors for a more comprehensive health monitoring experience.
- **Mobile Application:** Develop a dedicated mobile application for better accessibility.

## Contributors:

- @manikantakatakam
