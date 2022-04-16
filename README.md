

---
Group 21's Original App Design: Decision Maker
===
Does the word "indecisive" describe you? Have you ever tried to decide on what to eat alone or with a group, and spent hours deliberating due to not really feeling strongly about any kind of cuisine? If so, our group has the perfect solution for you! The goal of this app is to make deciding on breakfast/lunch/dinner and everything in between for you and whoever you're with effortless and fun. With the advent of this revolutionary application, you'll never have to make grown-up decisions like a well-adjusted adult again!

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
Application that choses an option for you from a given list.

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Fun, random, food.
- **Mobile:** This app would be developed for mobile only.
- **Story:** Helps the undecited user with picking a choice to eat from a given set of options.
- **Market:** Everyone with a phone
- **Habit:** This app would be used when deciding what to each or what to cook.
- **Scope:** This app is used by an individual user, but there is the potential to connect with other users and have a polling system to make a decision between all users.

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

Help me choose!
- [X] User should be able to see a splash screen
- [ ] User have two options to choose from in main screen 
- [ ] User should be able to enter as many options as they want
- [ ] User should able to see a pop up with the decision chosen from the options they entered

I don't know what i want
* -> api


**Optional Nice-to-have Stories**


- [ ] Show me some receipes!
- [ ] Group poll (???)
- [ ] Loading" message to indicate choice being made

### 2. Screen Archetypes

* Main screen
  * User should be see two options to choose from 
* Add choices screen
  * User can add their choices 

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* [Help me choose!]
* [I don't know what I want]


**Flow Navigation** (Screen to Screen)

* Main page -> enter selections
* Don't know -> select for me


## Wireframes

<a href="https://ibb.co/Qfchvcs"><img src="https://i.ibb.co/Dtbmfb3/Screen-Shot-2022-04-08-at-6-39-39-PM.png" alt="Screen-Shot-2022-04-08-at-6-39-39-PM" border="0"></a>



### [BONUS] Digital Wireframes & Mockups

<a href="https://ibb.co/tJHh6q7"><img src="https://i.ibb.co/9rpv0bF/Screen-Shot-2022-04-08-at-10-21-57-PM.png" alt="Screen-Shot-2022-04-08-at-10-21-57-PM" border="0"></a><br /><a target='_blank' href='https://imgbb.com/'>free image hosting</a><br />

### [BONUS] Interactive Prototype

![ezgif com-gif-maker (48)](https://user-images.githubusercontent.com/73797804/162553283-d1147a08-d835-439f-8331-a416caaccdc7.gif)

## Schema
[This section will be completed in Unit 9]
### Models

| Property | Type     | Description |
| -------- | -------- | --------    | 
| objectId | String   | unique id for entry(default) |     
| cuisine  | String   | cuisine name, user input     |
| restaurant| String  | name of a restaurant         |
| counter   | number  | unique counter random algorithm| 

### Networking
#### List of network requests by screen

- Main Screen
  - (Create/POST) Add a new restaurant choice to the database
      ```
      @ParseClassName("Choice")
      class Choice : ParseObject() {
          // Description : String
          fun getDescription(): String? {
              return getString(KEY_DESCRIPTION)
          }
          fun setDescription(description: String) {
              put(KEY_DESCRIPTION, description)
          }
      ```
  - (Read/GET)  Get the previously added restaurants from the database
      ```
      let query = PFQuery(className:"Restaurant")
      query.whereKey("name", equalTo: searchedName)
      query.order(byDescending: "createdAt")
      query.findObjectsInBackground { (restaurants:[PFObject]?, error: Error?) in
         if let error = error { 
            print(error.localizedDescription)
         } else if let posts = posts {
            print("Successfully retrieved \(posts.count) posts.")
        // TODO: Do something with restaurants...
         }
      }
      ```
  - [Create basic snippets for each Parse network request]
###[OPTIONAL: List endpoints if using existing API]


### Yelp API
- Base URL - GET https://api.yelp.com/v3


| HTTP Verb | Endpoint | Description |
| --------- | -------- | --------------------------------------------------------------- |
| GET       | /businesses | Returns up to 1000 businesses based on provided search criteria |


![ezgif com-gif-maker (49)](https://user-images.githubusercontent.com/73797804/163660214-aee0bad9-85bf-49c0-8638-bca271ec4c63.gif)

