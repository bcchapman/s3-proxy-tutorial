# Prerequisites 
AWS Account and credentials configured
node/npm
java sdk

# How to run example
`npm install` \
Rename `custom.bucketName` in serverless.yml to something unique \
`npm run deploy`

Note api gateway address from endpoints output and replace in ?????? placeholders below

Test

curl -X POST -H "Content-Type: text/html" -H "User: bcchapman" --data-binary @test/sample_request.txt https://??????.execute-api.us-east-2.amazonaws.com/dev/createFile?filePath=text%2Fsample_request.txt \

curl -X POST -H "Content-Type: img/png" -H "User: bcchapman" --data-binary @test/aws_logo.png https://??????.execute-api.us-east-2.amazonaws.com/dev/createFile?filePath=images%2Ftc_logo.png
