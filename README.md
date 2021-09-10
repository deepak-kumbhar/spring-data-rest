# SpringDataRest
## _Spring data rest example using spring boot + mysql_

In this example you will learn the basics of Spring data rest, where you can perform simple CRUD operations.

## Features

- Fetch all users
- Fetch Specific users
- Fetch users with pagination and sorting
- Search user by email
- Save user


## Below is some JSON request and response

**Fetch all user**

URL: http://localhost:8080/users

Method: GET

Response:

```sh
{
  "_embedded" : {
    "users" : [ {
      "name" : "Deepak",
      "email" : "deep@gmail.com",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/1"
        },
        "user" : {
          "href" : "http://localhost:8080/users/1"
        }
      }
    }, {
      "name" : "Prajapati",
      "email" : "praj@gmail.com",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/2"
        },
        "user" : {
          "href" : "http://localhost:8080/users/2"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/users"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/users"
    }
  },
  "page" : {
    "size" : 20,
    "totalElements" : 2,
    "totalPages" : 1,
    "number" : 0
  }
}
```

**Fetch specific user**

URL: http://localhost:8080/users/1

Method: GET

Response:

```sh
{
  "name" : "Deepak",
  "email" : "deep@gmail.com",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/users/1"
    },
    "user" : {
      "href" : "http://localhost:8080/users/1"
    }
  }
}
```

**Fetch users with pagination and sorting**

URL: http://localhost:8080/users?page=0&size=2&sort=name,desc

Method: GET

Response:

```sh
{
  "_embedded" : {
    "users" : [ {
      "name" : "Prajapati",
      "email" : "praj@gmail.com",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/2"
        },
        "user" : {
          "href" : "http://localhost:8080/users/2"
        }
      }
    }, {
      "name" : "Deepak",
      "email" : "deep@gmail.com",
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/users/1"
        },
        "user" : {
          "href" : "http://localhost:8080/users/1"
        }
      }
    } ]
  },
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/users?page=0&size=2&sort=name,desc"
    },
    "profile" : {
      "href" : "http://localhost:8080/profile/users"
    }
  },
  "page" : {
    "size" : 2,
    "totalElements" : 2,
    "totalPages" : 1,
    "number" : 0
  }
}
```

**Search user by email**

URL: http://localhost:8080/users/search/findByEmail?email=deep@gmail.com

Method: GET

Response:

```sh
{
  "name" : "Deepak",
  "email" : "deep@gmail.com",
  "_links" : {
    "self" : {
      "href" : "http://localhost:8080/users/1"
    },
    "user" : {
      "href" : "http://localhost:8080/users/1"
    }
  }
}
```

**Save user**

URL: http://localhost:8080/users/1

Method: POST

Request:

```sh
{
    "name":"Ramesh",
    "email":"ramesh@gmail.com"
}
```

Response:
```sh
{
    "name": "Ramesh",
    "email": "ramesh@gmail.com",
    "_links": {
        "self": {
            "href": "http://localhost:8080/users/3"
        },
        "user": {
            "href": "http://localhost:8080/users/3"
        }
    }
}
```

## Required dependency
```sh
    <dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-data-rest</artifactId>
	</dependency>
```

## Feel free to fork the repostiory and leave the star😊

## Thank You!
