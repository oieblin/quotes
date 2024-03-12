# Quotes
With this Quotes web app you can get quote of the day.

## Technologies used in development
* Java
* Spring Boot
* Maven
* Postman

## Information
* A simple web/REST service has been created and launched locally.
 
* Added a GET endpoint that accepts input parameters in a URL and returns it as JSON.
## Response example
````JSON
{
  "qotd_date": "2024-03-13T00:00:00.000+00:00",
  "quote": {
    "id": 27994,
    "dialogue": false,
    "private": false,
    "tags": [
      "good"
    ],
    "url": "https://favqs.com/quotes/samuel-johnson/27994-your-manuscri-",
    "favorites_count": 0,
    "upvotes_count": 2,
    "downvotes_count": 0,
    "author": "Samuel Johnson",
    "author_permalink": "samuel-johnson",
    "body": "Your manuscript is both good and original but the part that is good is not original, and the part that is original is not good."
}
````