
# Cliff.ai Take Home Assignment

A Java backend application built to give info about a Team and its Player
from various Rest APIs with custom response.


## Installation

Install via cmd:
  
git clone https://github.com/AnmolChhabra98/CliffAI_Home_Assignment.git

Open project in any IDE (STS Prefered)
    
## After Installation

Change MySQL username & password with your MySQL username & password in below mentioned file:  

Path: CarScan_Home_Assignment/src/main/resources/application.properties  
• spring.datasource.username=yourMySQLUsername  
• spring.datasource.password=yourMySQLPassword

After successfully running the project it will automatically create a database(cliffai) with tables(Team & Player) having sample data.
## API Reference for Team.

#### Create Team.

```http
  POST http://localhost:8085/create-team
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Object` | `Team` | **Required**. Pass team object as input to create team if it doesn't exists. |

Input: {  
    "id": 4,  
    "name": "CliffAi Onsite Team",  
    "location": "London",  
    "created_at": "05-11-2020",  
    "updated_at": "19-03-2021"  
    }   
    Output: {  
    "result": "success",  
    "message": "successfully retrive",  
    "data": "CliffAi Onsite Team team saved successfully."  
    }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149653763-66719274-60a4-46f2-b3b5-a993c4f11d9d.png)

#### Find Team.

```http
  GET http://localhost:8085/find-team-by-id/{teamId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `teamId` | `integer` | **Required**. To find a team by id if it exists. |

Input: http://localhost:8085/find-team-by-id/1

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": {   
        "id": 1,    
        "name": "CliffAi",  
        "location": "Mumbai",   
        "created_at": "19-02-2019",  
        "updated_at": "19-02-2022"  
        }   
        }


#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149653863-8a5b4a3a-42d6-461c-83eb-3bc9c6e7fc4c.png)

#### Update Team.

```http
  PUT http://localhost:8085/update-team
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Object` | `Team` | **Required**. Pass team object as input to update team if it exists. |

Input: {    
    "id": 1,    
    "name": "CliffAi",  
    "location": "Indore",   
    "created_at": "19-02-2019",  
    "updated_at": "19-02-2022"  
    }


Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": ""CliffAi data updated successfully.""  
    }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149653966-b4a1dce4-d643-4db3-b38f-053dff8ace37.png)

#### Delete Team.

```http
  DELETE http://localhost:8085/delete-team-by-id/{teamId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `teamId` | `integer` | **Required**. To delete a team by teamId if it exists. |

Input: http://localhost:8085/delete-team-by-id/4

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": "CliffAi Onsite Team team data deleted successfully."  
        }


#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654036-c8cc17a0-47ce-45c5-b937-113f183ff094.png)

#### List Teams.

```http
  GET http://localhost:8085/get-all-teams/{pageNo}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `pageNo` | `integer` | **Required**. To get all teams on a specified page it can show max 1 record at each page. |

Input: http://localhost:8085/get-all-teams/1

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": [ {  
            "id": 2,    
            "name": "Greendeck",    
            "location": "Punjab",   
            "created_at": "05-11-2014",  
            "updated_at": "19-03-2015"  }]   
    }


#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654171-c386b686-27b0-4c4f-a640-3365e14ac888.png)


## API Reference for Player.

#### Create Player.

```http
  POST http://localhost:8085/create-player
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Object` | `Player` | **Required**. Pass player object as input to create player if it doesn't exists. |

Input: {    
    "id": 16,   
    "name": "Kl Rahul",  
    "age": "30",    
    "created_at": "13-01-2020",  
    "updated_at": "28-02-2021",  
    "team": {  
        "id": 1,    
        "name": "CliffAi",  
        "location": "Mumbai",   
        "created_at": "19-02-2019",  
        "updated_at": "19-02-2022"  
        }   
    }


#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654265-61df494e-634a-4b3f-adf8-0852caeda5d7.png)

#### Find Player.

```http
  GET http://localhost:8085/find-player-by-id/{playerId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `playerId` | `integer` | **Required**. To find a player by playerId if it exists. |

Input: http://localhost:8085/find-player-by-id/11

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": {   
        "id": 11,   
        "name": "Aditya Joshi",  
        "age": "26",    
        "created_at": "13-01-2020",  
        "updated_at": "28-02-2021",  
        "team": {   
            "id": 1,    
            "name": "CliffAi",  
            "location": "Mumbai",  
            "created_at": "19-02-2019",  
            "updated_at": "19-02-2022"  
            }}  
    }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654382-2e6c84dc-2324-459d-ae7e-f21d6f564285.png)

#### Update Player.

```http
  PUT http://localhost:8085/update-player
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `Object` | `Player` | **Required**. Pass player object as input to update player if it exists. |

Input: {    
    "id": 16,   
    "name": "Kl Rahul",  
    "age": "30",    
    "created_at": "13-01-2020",  
    "updated_at": "28-02-2021",  
    "team": {  
        "id": 2,    
        "name": "Greendeck",  
        "location": "Punjab",   
        "created_at": "05-11-2014",  
        "updated_at": "19-03-2015"  
        }   
    }


Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": "Kl Rahul data updated successfully."  
    }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654518-15ce5905-e04e-4148-8085-35082f4bf9fb.png)

#### Delete Player.

```http
  DELETE http://localhost:8085/delete-player-by-id/{playerId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `playerId` | `integer` | **Required**. To delete a player by playerId if it exists. |

Input:  http://localhost:8085/delete-player-by-id/16

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": "Kl Rahul data deleted successfully."  
        }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654584-2b9a2e7a-a2f4-4927-8db9-9d2e85e4c2ec.png)

#### List Players.

```http
  GET http://localhost:8085/get-all-players/{pageNo}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `pageNo` | `integer` | **Required**. To get all players on a specified page it can show max 1 record at each page. |

Input: http://localhost:8085/get-all-players/1

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": [{  
        "id": 12,   
        "name": "Yashvardhan Srivastava",   
        "age": "27",    
        "created_at": "29-02-2021", 
        "updated_at": "01-04-2021",  
        "team": {   
            "id": 2,    
            "name": "Greendeck",    
            "location": "Punjab",   
            "created_at": "05-11-2014",  
            "updated_at": "19-03-2015" }   
        }]  
    }}

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654655-0a55f115-bd14-4e71-98de-6fcfbed69f1a.png)

#### Get Players by teamId.

```http
  GET http://localhost:8085/get-players-by-teamid/{teamId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `teamId` | `integer` | **Required**. To get all players by teamId. |

Input: http://localhost:8085/get-players-by-teamid/1

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": [{  
        "id": 11,   
        "name": "Aditya Joshi",  
        "age": "26",    
        "created_at": "13-01-2020",  
        "updated_at": "28-02-2021",  
        "team": {   
            "id": 1,    
            "name": "CliffAi",  
            "location": "Mumbai",   
            "created_at": "19-02-2019",  
            "updated_at": "19-02-2022" }    
        }]  
        }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654881-119faf32-b4bf-4f8f-b921-5356ecec0bed.png)

#### Get Team by playerId.

```http
  GET http://localhost:8085/get-team-by-playerid/{playerId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `playerId` | `integer` | **Required**. To get team by playerId. |

Input: http://localhost:8085/get-team-by-playerid/11

Output: {   
    "result": "success",    
    "message": "successfully retrive",  
    "data": {   
        "id": 1,    
        "name": "CliffAi",  
        "location": "Mumbai",   
        "created_at": "19-02-2019",  
        "updated_at": "19-02-2022"  }   
        }

#### Screenshot
![image](https://user-images.githubusercontent.com/59386081/149654963-70d3b1d6-9852-487b-a104-e3f9dc3f4529.png)

## Visualizer 📈

Feeling tired! 😫

Try it out: http://localhost:8085/swagger-ui/index.html


## Scary JSON APIs 😨

Check it here: http://localhost:8085/api-docs
## Hire Me!

If you find this Project helpful and want to hire a dev who can  
learn, adapt and know how to get things done efficiently  
then you can have a gem 💎 like me to be part of your team.
- 📫 How to reach me [**Abracadabra**](mailto:anmolchhabra098@gmail.com)