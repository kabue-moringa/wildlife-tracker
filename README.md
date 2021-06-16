## WILD-TRACKER.
This is a java app that enables one to track a wild-animal and record the status at which the animal is.

## AUTHOR:
joseph kabue wangari



### PRE-REQUISITES.

* Postgresql
Ensure you have installed postgresql on your localmachine

This will be used as the System 

* NOTE!

The $ and =# are only used to indicate the current location!

Initialize postgresql Database using the below commands:
$  [psql]

## Create DataBase:
CREATE DATABASE wildlife_tracker;
#### Connect to DataBase]
 \c wildlife_tracker
####Creating  Tables
CREATE TABLE animals (id int PRIMARY KEY,name varchar,health varchar, status varchar);

CREATE TABLE sightings (id int PRIMARY KEY,location varchar, ranger_name varchar);

### TECHNOLOGIES USED:

* [Java ]
* [Intellij Idea]
* [Spark]
* [HTML]


# LICENSE
This project is licensed under the MIT License - see the LICENSE file for details