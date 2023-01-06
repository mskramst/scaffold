# To create docker image to code in Java

1. Download from Docker hub image (maven:3.8.1-jdk-11-slim)
1. Use `docker pull` to download image to the machine
1. Then run the image using the following command
    `docker run -v $(pwd):/app -it -t <image-id> /bin/bash`
1. This will create a container with the current working directory shared into
   the app folder with the maven-java image and start bash
1. Then you can use docker start and docker attach to log into image
1. Change into the app directory and run `mvn test`

