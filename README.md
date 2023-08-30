# Transit Data Application

## Tech Stack: Python, MySQL, Mapbox, Maven, MBTA API, MongoDB, Docker

A web application that uses Mapbox to display the positions of buses along Route 1 for the MBTA. 
The longitude and latitude of the buses are hard coded for the prototype and are incremented periodically to simulate movement.

MBTA API:
https://www.mbta.com/developers/v3-api

https://api-v3.mbta.com/docs/swagger/index.html

# Transit_Data_Application
This application makes calls to the MBTA API for Route 1 periodically (every 10 seconds), parses the JSON results returned, and stores the data in a MySQL database for further analysis.
The application will monitor the MySQL database for changes and propagate any changes to a MongoDB database.
