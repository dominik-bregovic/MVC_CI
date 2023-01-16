##The Project so far:##

**Creating the workflow**

The file in Github was going very well. The instructins were clear and easy to follow.

**Maven and it's features:**

*Validation:*
Easy to implement. No problems appeared

*Compiling:*
Easy to implement. No problems appeared

*Testing:*
Here we had to include the "maven-surefire-plugin" in order to include Unit-testing for our builds.
First we tried to include it over the dependencies, which failed.
After that we tried to include it over the plugins, which succeeded.

We implemented a simple test that just checks for a empty string. This was just to get it going.
Further implementations will follow.

*Packaging:*
Here we excluded the test from being executed. We have done this before and don't want to add redundancy.
Besides that the packaging was going as planed.

*Documentation with SITE:*
Here we have to improve the content of the documentation, but it is a basic documentation.

**Docker-deliver a application with an isolated environment**

Docker username: tcmTestAccount
Docker password: Doidoi_123!

Docker build and push gave us a real hard time though it is almost the same as in bitbucket.
Because of two typos I lost nearly 4 hours and we had to add the target directory to the remote repository to make it work.
Don't know why, because we are creating the target folder in our pipeline.
Additionaly we had to add a entry point in the pom.xml in order to start the application properly.


**Pipeline done, now docker compose is next**