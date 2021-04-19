# fizzbuzz-bootstrap-api

*To run the project*
1. Simply go to the fizzbuzz-api folder in the repo https://github.com/jqj8595/fizzbuzz-bootstrap-api/tree/main/fizzbuzz-api where you will find the Dockerfile.
2. Create a docker image out of the docker file by running:
docker build --tag=fizzbuzz-api:latest .  
3. Run the container using the docker image created:
docker run -p8881:8081 fizzbuzz-api:latest
Note: It maps port 8881 to 8081, if port 8081 is in use you can simply change the port in the application.properties file inside the project.
Send a Get request using the endpoint http://localhost:8881/api/fizz/{upperLimit} 
You can pass integers to the upperLimit URI param.
Example requests:
 http://localhost:8881/api/fizz/20 
 will give you the following result:
 <img width="1036" alt="Screen Shot 2021-04-19 at 8 43 25 PM" src="https://user-images.githubusercontent.com/20781377/115207678-eb790f80-a14f-11eb-9966-c1acc27886a3.png">


*Automated Testing using SOAPUI*
I have used soapui as I am mostly familiar with this tool as an automated test suite. You can find the soapui xml file in /src/test/SoapUI/fizzbuzz-api.xml.
Import this project xml file into soapui and run test cases as shown in the screenshot below.
<img width="1792" alt="Screen Shot 2021-04-19 at 5 08 54 PM" src="https://user-images.githubusercontent.com/20781377/115205070-48bf9180-a14d-11eb-91c6-ecbf31f27328.png">

As you can see I have created two automated test cases that pass using the fizzbuzz api, one for positive numbers and the other using negative numbers.
Further test scenarios to consider can be:
- Validating http status codes for the variety of response codes we could get, including when basic auth is enabled. 
- Testing large integers and decimals.
- Testing responses when api is not running
- Testing response times compared to expected times - SLA


Enabliing authentication- I have configured basic auth java class in the folder com.api.fizzbuzzapi.security.SecurityConfig which extends the WebSecurityConfigurerAdapter used from the libaries added by the spring-boot-starter-security dependency. 
This shares a temp password each time you run the application, which you need to use when sending a request to the api using basic auth.
To further improve this we could look at rate limiting to limit amount of requests sent by a user, bearer tokens, or access tokens using oAuth.

