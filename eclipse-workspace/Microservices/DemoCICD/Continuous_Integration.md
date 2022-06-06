# Process of Continuous Integration: 
  1. Developers first check out code into their private workspace and then commit the changes into the repository
  2. The CI server monitors the repository and checks out the changes when they occur.
  3. The CI server builds the system and runs the unit and INtegration tests.
  4. After that the CI server releases the deployable artifacts for testing. 
  5. The CI server assigns a build label to the version of the code it builds.
  6. The CI server informs the team of the successful build.
  7. If the build or tests fails, the CI server alerts the team.
  8. The team fixes the issue at the earliest opportunity and continues to integrate tech test throughout the project. 
  
  
# Setting Up of Continuous Integration: 
  1. Create a Spring Application.
  2. Create a repository in the Gitlab.
  3. Setting up the CI with SCM(Gitlab).
  4. Configure CI.
  5. Review the CI build.
  
   # Personal access token generated on gitlab:  7FuVp9moGwL7LXMABcns
   
   * Downloading gitlab Runner:
     - create a file named - "GitLab-Runner" 
     - Go to google and search "Gitlab runner"
     - go to "install"
     - download for windows 64 bits
     link - " https://docs.gitlab.com/runner/install/windows.html " 
     - copy the downloaded file into the folder created "GitLab-Runner"
     - open cmd as adminstrator
     - go to the folder location in the command prompt 
     - write command "gitlab-runner install" to install the gitlab runner 
     - NOTE: here command starts with "gitlab-runner" because that is the name of the file gitlab runner ; if name is anything else then that is to be used 
     - to check version use 'gitlab-runner -v'
     - to register use " gitlab-runner register"
     # Go to project on gitlab account for which the runner needs to be registered 
     using following steps :  go to gitlab account ->click on project -> go to settings -> click on CI/CD -> click on runners -> expand runners -> copy the "url" and "registration token" and paste on command prompt when asked 
     -  provide description 
     - give tags like: ssh, ci etc.
     - enter note 
     * runner starts after this process
     - choose any executer from the option provided for ex- shell etc.
     - now whenever to start the gitlab runner type "gitlab-runner start" in cmd 
     
     # now create a file by clicking on prject named " .gitlab-ci.yml " 
     - and do the task that is done in this project .gitlab-ci.yml file done 
     - we will use a ready made image from docker 
     - we can make our own image on docker too and then use that 
     
     # Now:
       - open cmd as administrator 
       - go to project location in which we have to intialize "CICD"
       - initialize git init 
       - use all steps to intiliaze git repository
       - add remote 
       - and push now 
       
  
