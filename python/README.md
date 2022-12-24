## Build and test python code in Docker container

Testing site with virtual environment

```
python3 -m venv venv
. venv/bin/activate
deactivate
pip install pytest
pytest 
```

pytest will run tests in the pytest directory
see setup file

Creates a container with python and pipenv installed

Use with tmux to create code on local development and run tests within container

No need to install newer version of python

Of course, you could just use a virtual environment like venv


#### Build from docker container and then create running container in it mode
docker build . -t test-python
docker run -it --name testing-python -v $(pwd):/usr/local/bin/src/testingpy test-python bash

#### Will rejoin the container
docker start testing-python
docker attach testing-python

gotests will execute the tests
