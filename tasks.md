### Welcome

This is a Methods Business and Digital LTD Java + Spring boot assessment. This short assessment has been designed to test your skills in Java and springboot. You have 48 hrs to complete all the tasks listed below. Please complete as many of the tasks listed below, in order.


### Tasks



### Task1: Change The pets image

On the home page there is an image of a cat and a dog, replace that image with the cat.png picture provided in the static/images folder. Please commit your changes to your local branch.


### Task 2: Create a tab for listing pets

Currently you can only add a pet from the owner’s page. Create a new tab for adding a pet, to the site’s current header. So, the page options in the header should be ordered as below

-	Home
-	Find Owners
-	Pets
-	Veterinarians
-	Error


### Task 3: Add a button to Veterinarians page

Currently, there is no option of adding a vet. Please add a button to the ‘Veterinarians’ listing page which gives you the ability to add a new vet to the db.


### Task 4: Prevent Duplication of owners

An Owner can be created using the ‘Add Owner’ button on the ‘Find Owners’ page. Devise a mechanism to check that an entry for the owner doesn’t exist before the changes are commited to the DB. If an owner with similar details exists, prompt the user with an error “Duplicate entry, this owner already exists on our systems. Please use our ‘Find owner’ option to find this owner.”


### Task 5: Create a microservice

-   Create a new 'book a vet appointment' service. This should be another page where you can book an appointment with a vet listed in our datasbase.
-   The new service should be a seperate microservice. You cna write this in any language but extra points will be awarded if written in python.
-   change the front-end to display the new microservice as an additional link as part of the menu in the page header. The header should now have the following items

-	Home
-	Find Owners
-	Pets
-	Veterinarians
-	Error
-   Appointments
