# API Automation Training

Welcome to the API Automation Training! This repository serves as the foundation for the training, providing a base API Automation Framework and step-by-step guidance for participants to build their API automation skills.

Find the API Framework documentation here.

The training is designed for participants to fork this repository, develop their tests for a mock API, and create Pull Requests (PRs) for feedback and review. Mentors will review PRs regularly, providing feedback and guidance to ensure learning and progress.
Training Objectives

---

1.  **Learn the basics of Java:**
    Understand the fundamental features of Java, including classes, inheritance, etc. These concepts will help you write better, more maintainable code for API automation.

2.  **Understand the Base Framework:**
    Familiarize yourself with the provided Java API Automation Framework using Maven for test execution, Rest Assured for HTTP requests, and JUnit 5 for assertions. Learn how the framework is structured and how to extend it for your testing needs.

3.  **Learn API Automation Concepts:**
    Grasp core concepts like service modeling (encapsulating API endpoints), organizing test cases, setting up environments with .env files, and strategies for functional and non-functional API testing.

4.  **Implement Test Automation:**
    Use the base framework to write tests for real-world scenarios using the CatCafeProject API. Implement robust, maintainable test scripts for CRUD operations and edge cases.

5.  **Collaborate Effectively:**
    Develop skills in using Git workflows for version control. Create feature branches, submit Pull Requests (PRs), and respond to feedback from mentors. Learn best practices for working in an asynchronous environment while maintaining high-quality contributions.

---

## Workflow and Guidelines

1.    **Fork the Repository:** Fork this repo to your GitHub account and create a local clone.
2.    **Add collaborators:** Add your mentors as collaborators to the repo.
3.    **Branching:** Use feature branches (e.g., feature/milestone-1) for your changes.
4.    **Pull Requests:** Create PRs for each milestone. Include a description of your changes and any challenges faced. Add your mentor as a reviewer.
5.    **Code Reviews:** Mentors/Teacher will review your PRs, providing feedback. 
5.    **Code Reviews:** Mentors/Teacher will review your PRs, providing feedback. 
6.    **Feedback:** Address feedback promptly and resubmit your PR.

---

## Training Milestones

Before starting each milestone, create a feature branch with the name of the milestone, e.g.: feature/milestone-1 Follow each Milestone without reading the next one.

## **Milestone 1: Setup and Explore. Service model creation and first tests**

**Objective**:Set up the framework and understand its structure. Create a service model with methods for the Store service.

1. Move to the framework folder:
   ```bash
    cd framework
    ```

2. Install dependencies and set up your environment:

    ```bash
    mvn install
    copy example.env .env
    ```

    **Note:** If the execution does not work because you do not have Maven installed, go to https://maven.apache.org/ and follow the download and install instructions

3. Update .env with the test API base URL:
    ```yaml
    BASEURL=http://catcafeproject.us-east-1.elasticbeanstalk.com
    BASEURL=http://catcafeproject.us-east-1.elasticbeanstalk.com
    ```
4. Explore the framework:
    - Read the README.me file in the framework folder. 
    - Read the README.me file in the framework folder. 
    - Understand the `ServiceBase` class and its usage in service models.
    - Understand the API that will be used: http://catcafeproject.us-east-1.elasticbeanstalk.com/api-docs/
    - Understand the API that will be used: http://catcafeproject.us-east-1.elasticbeanstalk.com/api-docs/

5. Create a new `CatService` extending `ServiceBase`.
6. Implement methods in `CatService` for the following operations:
    - `GET /cats`
    - `POST /cats`
    - `PUT /cats/{catId}`
    - `GET /cats/{catId}`
    - `PATCH /cats/{catId}`
    - `DELETE /cats/{catId}`
5. Create a new `CatService` extending `ServiceBase`.
6. Implement methods in `CatService` for the following operations:
    - `GET /cats`
    - `POST /cats`
    - `PUT /cats/{catId}`
    - `GET /cats/{catId}`
    - `PATCH /cats/{catId}`
    - `DELETE /cats/{catId}`
7. Add request and response models where appropriate.
8. Write the first test for the POST /cats endpoint to verify that a Cat can be created successfully.
8. Write the first test for the POST /cats endpoint to verify that a Cat can be created successfully.

**Deliverable**:

- Create a PR with the change, adding a short description of your implementation process.

### Milestone 2: CI/CD Pipeline

**Objective**: Configure and understand the GitHub Action to run tests on each PR and merge to `main`.

1. If you are not familiar with GitHub Actions, do some research to understand the basics, such as workflows, jobs, and steps. Refer to the [GitHub Actions Documentation](https://docs.github.com/en/actions).
2. Explore the `.github/workflows/main.yml` file to understand the workflow triggers and steps.
3. Based on the research you did on GitHub Actions and your experience running the tests in IntelliJ, adjust the Maven line in the main.yml file so the tests are run in the pipeline.
4. Create a new environment called "Testing" in **Settings** > **Environments** > **New environment**
5. Configure the `BASEURL` as an environment variable with value: `http://catcafeproject.us-east-1.elasticbeanstalk.com`
5. Configure the `BASEURL` as an environment variable with value: `http://catcafeproject.us-east-1.elasticbeanstalk.com`

**Deliverable**:

- Create a PR with a summary of what you learned and confirm that the workflow ran successfully in the Actions tab.

---

### **Milestone 3:  Implement the Create Cat Suite**
### **Milestone 3:  Implement the Create Cat Suite**

**Objective**: Create and write tests for the Create Cat test Suite.
**Objective**: Create and write tests for the Create Cat test Suite.

1. Write additional tests for the Create Order (`POST /cats`) endpoint.
1. Write additional tests for the Create Order (`POST /cats`) endpoint.
2. Include positive and negative tests.
3. Use tags like `@Tag("Smoke")` or `@Tag("Regression")` for test categorization. `@Tag("Smoke")` tests should be the ones that are absolutely required to pass.

**Deliverable**:

- Create a PR with the tests and a brief summary of the scenarios covered. Remember to check the pipeline every time a PR is created.

---

### **Milestone 4: Create Test Suites for the rest of the Cat Service*

**Objective**: Write tests for the rest of the Cat Service following the practices covered above.

        Write a test suite for each of the remaining endpoints in the Cat Service:
        - GET /cats
        - GET /cats/{catId}
        - DELETE /cats/{catId}
        - PATCH /cats/{catId}
        - PUT /cats/{catId}

- Create a PR with the tests and a brief summary of the scenarios covered. Remember to check the pipeline every time a PR is created.

---

### **Milestone 4: Create Test Suites for the rest of the Cat Service*

**Objective**: Write tests for the rest of the Cat Service following the practices covered above.

        Write a test suite for each of the remaining endpoints in the Cat Service:
        - GET /cats
        - GET /cats/{catId}
        - DELETE /cats/{catId}
        - PATCH /cats/{catId}
        - PUT /cats/{catId}


**Deliverable**:

- For each test suite, create a PR with the tests.
- For each test suite, create a PR with the tests.

---

### **Milestone 5:Pre and Post conditions: Hooks**

**Objective**: Write hooks for pre and post-conditions.

1. Write a [before HOOK](https://junit.org/junit5/docs/current/user-guide/#writing-tests-definitions) in the Get Cat test suite.
    i. Add a Before hook that creates a cat by calling the right method in the CatService model.
    ii. Obtain and store the catId (the variable for this must be declared above the before hook).
    iii. se the saved catId in the Get Cat test.
2. Write an [after HOOK](https://junit.org/junit5/docs/current/user-guide/#writing-tests-definitions) in the Create Cat test suite. This is very useful for cleaning up data after a test execution.
     i. After every positive test, update the catId variable with the newly created Cat ID.
     ii. Add an AfterEach hook that deletes the created cat by calling the right method in the CatService model.

**Deliverable**:

- Create a PR with the tests and a brief summary of the scenarios covered.
- Create a PR with the tests and a brief summary of the scenarios covered.

---

### **Milestone 6: Verify endpoints basic Performance**
### **Milestone 6: Verify endpoints basic Performance**

**Objective**: Expand the test suite with basic performance test cases.

1. Add performance checks for the endpoints (e.g., response time < 1000ms).

**Deliverable**:

- Create a PR with the new tests and details covered.

---

### **Milestone 7: Extend to Other Services**
**Objective**:  Implement automation for additional services (Adopter and User).
### **Milestone 7: Extend to Other Services**
**Objective**:  Implement automation for additional services (Adopter and User).

1. Repeat the previous steps for **Adopter** and **User** service.
2. Create at least one user in the DB without deleting it.
1. Repeat the previous steps for **Adopter** and **User** service.
2. Create at least one user in the DB without deleting it.

**Deliverable**:

- Create separate PRs for each suite across both services.
---

### **Milestone 8: Authentication**
**Objective**: Implement the authenticate method. Extend automation for the Staff service.

1. Go to the ServiceBase class and find the example authenticate method.
2. Read the method and its documentation to understand what it does.
3. Now read the CatCafeProject documentation to understand how the authentication works for this API.
4. Update the authenticate method in the ServiceBase class and any other part of the code you need, to implement authentication for your Staff tests using the SessionManager.
5. Implement the StaffService and its test suite.
6. Use the authentication method in your Staff tests:
    i. Add the USER and PASSWORD environment variables in the framework/.env file, using the data from an existing user that you created on step 2 from Milestone7.
    ii. Modify the tests to call the authenticate method from a before hook, sending the credentials from your env file.
    iii.Create the secret variables "USER", "PASSWORD", and "JWT_SECRET" in your "Local" environment on Github.
Deliverable:

Create separate PRs for the implementation of the authentication infrastructure and for the Staff service and tests.
- Create separate PRs for each suite across both services.
---

### **Milestone 8: Authentication**
**Objective**: Implement the authenticate method. Extend automation for the Staff service.

1. Go to the ServiceBase class and find the example authenticate method.
2. Read the method and its documentation to understand what it does.
3. Now read the CatCafeProject documentation to understand how the authentication works for this API.
4. Update the authenticate method in the ServiceBase class and any other part of the code you need, to implement authentication for your Staff tests using the SessionManager.
5. Implement the StaffService and its test suite.
6. Use the authentication method in your Staff tests:
    i. Add the USER and PASSWORD environment variables in the framework/.env file, using the data from an existing user that you created on step 2 from Milestone7.
    ii. Modify the tests to call the authenticate method from a before hook, sending the credentials from your env file.
    iii.Create the secret variables "USER", "PASSWORD", and "JWT_SECRET" in your "Local" environment on Github.
Deliverable:

Create separate PRs for the implementation of the authentication infrastructure and for the Staff service and tests.

## Tips for Success

1. **Engage Actively**: Reach out for help if you're stuck or need clarification.
2. **Focus on Quality**: Write clean, maintainable code and meaningful tests.
3. **Learn from Feedback**: Incorporate mentor feedback to refine your implementation.

---
