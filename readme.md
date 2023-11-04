# Micro Wizarding School

Welcome to Micro Wizarding School, a Harry Potter-themed microservice architecture application. This magical world-inspired application aims to provide an enchanting experience for users while navigating through the various domains and services.

## Domains and Services

### 1. `user-service`: School Enrollment and Security (User Application and Security)

- **User Application Service:**
    - Manages the user application process for Hogwarts School, including personal information, previous education, and motivation for attending Hogwarts.
    - Handles user registration and account creation.

- **Security and Access Control Service (Optional):**
    - Manages authentication and access control for the application process and other areas of the application.

### 2. `house-service`: House Sorting and House Management (House Domain)

- **House Sorting Service:**
    - Sorts students into one of the four Hogwarts houses (Gryffindor, Slytherin, Hufflepuff, or Ravenclaw) based on user attributes and characteristics.
    - May involve a sorting hat-like feature.

- **House Quota and Material Management Service:**
    - Manages the house quota, ensuring a balanced distribution of students across houses.
    - Tracks the stock of materials and resources in each house's dormitory (e.g., food, textbooks, common room items).

### 3. `academic-service`: Wizarding Subjects and Homework (New Domain)

- **Curriculum and Class Registration Service:**
    - Manages the wizarding subjects and classes available at Hogwarts, including core subjects like Potions and Defense Against the Dark Arts.
    - Allows students to register for classes and create their academic schedules.

- **Homework and Assignment Tracking Service:**
    - Tracks homework assignments, projects, and deadlines for each subject.
    - Provides a platform for students to submit their homework and receive feedback from professors.

- **Grading and Progress Tracking Service:**
    - Enables professors to evaluate and grade student assignments and assessments.
    - Provides students with a way to track their academic progress and receive their house points based on performance.

## Interactions

- After successfully applying to Hogwarts through the User Application Service, students are sorted into houses using the House Sorting Service.

- Once sorted, students can register for wizarding subjects and create their academic schedules through the Curriculum and Class Registration Service.

- Students receive homework assignments and deadlines from their professors, and they can track and submit assignments through the Homework and Assignment Tracking Service.

- Professors use the Grading and Progress Tracking Service to assess student assignments and provide feedback, which contributes to students' academic progress and house point totals.

## Get Started

To experience the magic of Hogwarts School of Witchcraft and Wizardry Application, follow these steps:

1. Clone this repository to your local machine.

2. Set up each microservice using `mvn clean package` && `mvn package dockerfile:build` in each directory of service. 

3. Run each microservice using `docker-compose up` command line in the directory of `docker`.


## Contributing

We welcome contributions to enhance and expand the Hogwarts School of Witchcraft and Wizardry Application. Feel free to create pull requests, report issues, and join our community of developers and Potterheads.
