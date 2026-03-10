FROM ubuntu:latest
LABEL authors="yugo"

ENTRYPOINT ["top", "-b"]