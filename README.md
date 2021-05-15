# MyPetDiary Documentation

**Main Activity - HomePage**
- Home page of the app
- opens up to 4 new activities: NewPetActivity, MyPetsActivity, TrainingMainActivity, DogTippsActivity


**CREATING AND DISPLAYING PETS**

1. NewPetActivity - Add a new pet
- consists of a form to complete with details of the pet (Name, Breed, Gender), which will be added to the Database of pets and will be displays in MyPetsActivity
- uses Database DBHelper

2. MyPetsActivity - My Pets
- displays the pets added previously in NewPetActivity
- consists of a RecyclerView displaying the pets
- displays "No data" if DB is empty
- if DB is non-empty, displays Pets
- By clicking on each pet, a new activity opens up: UpdateActivity

3. UpdateActivity - update, delete existing pets
- By clicking on update, name, gender and breed will be updated
- By clicking on delete, a pop-up will be displayed, asking the user if he is sure to delete the pet
- upon clicking yes, pet will be deleted from database

4. CustomAdapter 
- provides a ViewHolder for the DB to display items

5. DBHelper
- SQLite Database implemented to support MyPetsActivity and display the existing items


**PET TRAINING**

1. TrainingMainActivity
- opens up from .MainActivity
- is helped by: RecyclerViewAdapter, TrainingActivity, Trainings
- from here, trainings are displayed using the RecyclerViewAdapter
- User can click on any training and TrainingActivity will open, which contains Trainings
- contains each training and it's method, name and image in form of a list

2. RecyclerViewAdapter
- provides RecyclerViewer to display the Training items

3. TrainingActivity
- contains the display of each individual training

**DOG TIPS**

1. DogTippMainActivity
- opens up by clicking TIPPS on MainActivity Homepage
- constructed similarly to Pet Training
- is helped by: RecyclerViewAdapterDog, DogTippActivity and DogTipps

