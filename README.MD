# Prerequisites 
AWS Account and credentials configured
node/npm
java sdk

# How to run example
npm install 
./gradlew build
Rename `custom.bucketName` in serverless.yml to something unique
serverless deploy

Note api gateway address from endpoints output and replace in ?????? placeholders below

Test

curl -X POST -H "Content-Type: text/html" --data-binary @test/sample_request.txt https://??????.execute-api.us-east-2.amazonaws.com/dev/createFile?filePath=bcchapman%2Fsample_request.txt
curl -X POST -H "Content-Type: img/png" --data-binary @test/aws_logo.png https://??????.execute-api.us-east-2.amazonaws.com/dev/createFile?filePath=bcchapman%2Ftc_logo.png