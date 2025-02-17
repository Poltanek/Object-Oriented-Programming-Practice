## Lecturers Class - Basic Class with Name, Office, and Extension

- [ ] Create a Class that allows a lecturer to have a name, office and extension number
- The lecturer should also be able to change these values and teach.
- [ ] Update the lecturer class to include a research topic.
- [ ] Add accessor and mutator methods for the research topic
- [ ] Modify the ``setExtensionNumber()`` method to restrict the extension number to a range between 1111 and 9999.
- [ ] Write a method that prints all the information of the lecturer in a specific format.


## BankAccount - Account Class

- [ ] Create a class for a bank account with variables such as account name, number, balance, and overdraft limit.
- [ ] Write the accessor and mutator methods for the account class.
- [ ] Implement methods for withdrawing and depositing money.
- [ ] Ensure that the withdrawal does not exceed the balance or overdraft limit.
- [ ] Test the functionality of the account class in the main method.

## StudentLists - Student Class

- [ ] Create a class representing a student with name, student ID, program studied, and credits passed.
- [ ] Write the constructor and accessor/mutator methods.

- [ ] Write a method to generate the student's computer login in the format "UoW_XXXXXX".

- [ ] Write a method to print out all student information in the following format:
    ```
    Student Information
    Name: Alice Smith
    Student ID: 123456
    Programme: BSc (Hons) Digital and Technology Solutions
    Computer Login: UoW_123456
    Number of Credits Passed: 0
    ```

- [ ] Add an instance variable for the student's favourite subject and update the constructor.
- [ ] Update the `printInformation()` method to display the favourite subject.

- [ ] Write a method to determine if the student has passed based on the number of credits, with 120 credits required to pass.

## HeaterExercise - Heater Class

- [ ] Create a `Heater` class with a `temperature` instance variable and methods to increase or decrease the temperature by 5°C each time.

- [ ] Add an `increment` instance variable, set to 5, and adapt the `warmer()` and `cooler()` methods accordingly.

- [ ] Adapt the mutator method for `increment` to prevent it from being set to a negative number.

- [ ] Add `minTemperature` and `maxTemperature` instance variables to the `Heater` class and update the constructor.
- [ ] Modify `warmer()` and `cooler()` methods to respect these new instance variables.

## CatExercise - Cat Class

- [ ] Create a `Cat` class with instance variables for name, age, fur color, and disposition (whether the cat is happy or sad).
- [ ] Include accessor and mutator methods for the instance variables.
- [ ] Create methods to make the cat purr when happy and miaow.

## DogExercise - Dog Class

- [ ] Create a `Dog` class with instance variables for name, weight, and preferred food.
- [ ] Implement accessor and mutator methods for these variables.
- [ ] Create methods for the dog to bark and calculate how much food to feed based on the weight and preferred food:
    - Pedigree Chum: 4g of food per 750g weight.
    - Barker's Chicken: 8g of food per 750g weight.
    - Woofer's Beef: 10g of food per 750g weight.
    - Other foods: 6g of food per 750g weight.
